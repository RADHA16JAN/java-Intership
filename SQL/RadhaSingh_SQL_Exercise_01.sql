-- simple queries

--01 Display count of rows in bookings, members and facilities 
select count(*)
from cd.bookings b union
select count(*) from
cd.facilities f union
select count(*) from
cd.members m;


--02  Display bookings in descending sorted order of data
select b.bookid
from cd.bookings b order by b.bookid desc;


--03  Display distinct facilities
select f.facid,f.name
from cd.facilities f;

--04  Get top 3 facilities with highest member cost
select * 
from cd.facilities
order by membercost desc
LIMIT 3;


--05  Get top 1 facilities with least montly maintenance
select * 
from cd.facilities
order by monthlymaintenance asc
LIMIT 1;

--06  Get members who share same surname.
SELECT m1.surname, m1.firstname, m2.surname, m2.firstname
FROM cd.members m1
INNER JOIN cd.members m2
ON m1.surname = m2.surname
AND m1.firstname != m2.firstname;
	

--07  Get members who stay in same City. 
--If they have Boston in Address then they are in same city.
select city, string_agg(firstname,'')
from(
      select m.firstname,m.address,'boston'as city 
	  from cd.members m where address like '%boston%'
)as a
group by city;

--08   Get members whos surname starts with 'Sm' or 'Tr' or ends with "ll" or "ew"
select m.surname
from cd.members m
where surname like 'Sm%' 
or surname like 'Tr%' or surname like '%ll'
or surname like '%ew';

--join queries
--01  Display members who have booked facilities
select m.memid,m.firstname,b.facid
from cd.members m inner join
cd.bookings b on b.memid=m.memid;


--02 Display facilities that have been booked.
select f.name,f.facid,b,bookid
from cd.facilities f inner join
cd.bookings b on b.facid=f.facid;


--03 Display members who have not booked facilities.
select m.memid,m.firstname,b.bookid
from cd.members m join
cd.bookings b on m.memid=b.memid 
where b.memid is null;


--04 Display facilities that have not been booked by members.
select f.*
from cd.facilities f left join
cd.bookings b on b.facid=f.facid
where b.facid is null;


--05 Display bookings with no facilities and members.
select *
from cd.bookings b left outer join
cd.facilities f on b.facid=f.facid
left outer join cd.members m on b.memid=m.memid
where
b.facid is null and
b.memid is null;


-- Aggregate Queies
--01 Display Total facilities usage by type(use booking table)
select count(*)as count, f.name
from cd.facilities f
group by f.name;

--02 Display members with total slots booked for each facility type.
select m.firstname,m.surname,sum(b.slots) as Total_Slot
from cd.members m inner join
cd.bookings b on m.memid=b.memid
inner join cd.facilities f on f.facid=b.facid
group by m.memid,f.facid;

--03 Display top 3 members with maximum faciliy usage (in terms of slots)
select m.firstname,m.surname,sum(b.slots) as Total_Slot
from cd.members m inner join
cd.bookings b on m.memid=b.memid
inner join cd.facilities f on f.facid=b.facid
group by m.memid,f.facid
limit 3;

--04 Display facilities booked sorted by slots descending
select f.name,b.slots
from cd.facilities f inner join
cd.bookings b on b.facid=f.facid
order by b.slots desc;

--05 Display top 3 booked facilities with maximum earnings.
SELECT f.name AS facility_name, SUM(b.slots*f.membercost) AS total_earnings
FROM cd.bookings b
JOIN cd.facilities f ON b.facid = f.facid
GROUP BY f.facid
ORDER BY total_earnings DESC
LIMIT 3;

--06 Display top 3 referred members based on booking total slots.
SELECT m.memid,m.firstname,m.surname,m.recommendedby,count(b.slots) AS total_slots
FROM cd.bookings b 
join cd.members m on b.memid=m.memid
GROUP BY m.memid
order by total_slots desc
limit 3;

--07 Display members based on count of usage ot Tennis (could be tennis or table tennis).
SELECT m.memid, concat(m.surname || ', ' || m.firstname) AS member_name, 
COUNT(*) AS usage_count
FROM cd.members m
inner JOIN cd.bookings b ON m.memid = b.memid
inner JOIN cd.facilities f ON b.facid = f.facid
WHERE f.name LIKE '%Tennis%'
GROUP BY m.memid;