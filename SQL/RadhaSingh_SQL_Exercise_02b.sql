                   --Actor table
--1 Get first_name , last_name for actors
select first_name,last_name 
from actor;

--2  Get first_name, last_name only 5 rows.
select first_name,last_name 
from actor
limit 5;

--3  Get first_name, last_name of 5 actors 
--who have been modified last
select a.first_name,a.last_name
from actor a
order by last_update desc
limit 5;

--4    Get top 5 repeating last_names of actors.
select last_name,count(last_name)as TotalRepeat
from actor a
group by last_name
order by  TotalRepeat desc
limit 5;

--5    Get top 6 repeating first_name of actors.
select first_name,count(first_name)as TotalRepeat
from actor a
group by first_name
order by  TotalRepeat desc
limit 6;


                 --Film table
--6 Get count of films in table
select count(title) as total_film
from film;

--7 What is average movie length (use length column)
select avg(length) as average_length
from film;

--8 Count of movies for each rating (use rating column)
select rating,count(rating) as total_movies
from film
group by rating
order by total_movies desc

--9   Get list of horror movies
select f.title, c.category_id
from film f inner join
film_category fc on f.film_id=fc.film_id
inner join category c on c.category_id=fc.category_id
where c.category_id=11;

--10  Movies that contain CAT in title.
select title
from film
where title like '%cat%';

                   -- Category
--11  How many movie categories are there?
select  count(name) as total_categories
from category; 

--12 Are category names repeating ?  
select name,count(name)
from category
group by name
having count(name)>1



                    --Country & City
--13   how many countries and cities ?
select count(city)
from city
union
select count(country)
from country;

--14 For each country get the list of cities.
select country_id,count(*)as city
from city
group by country_id
order by country_id asc;




                     -- customer
--15  Get list of active customers;
select customer_id,count(active)as active_customer
from customer
group by customer_id;

--16  Do any customer share same emailID
select count(email)as email
from customer
group by customer
order by email desc;
-- no customer share same email id 

--17  List of customers with same lastname
select last_name,count(last_name)as total_count
from customer
group by last_name
having count(last_name)>1
order by total_count desc;


                   -- film_category
--18 Total movies that are categoried
select count(film_id)
from film_category;

--19 total rows in inventory
select count(inventory_id)as total_row
from inventory;
