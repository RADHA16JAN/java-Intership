                      --join queries
--1  Find actors who acted in film "Lost Bird"
select a.first_name as actors
from film_actor fa inner join
actor a on fa.actor_id=a.actor_id
where fa.film_id='533'
group by a.first_name;


--2   Find movies of "Sci-Fi" genre
select f.title as movies,count(fc.category_id)as total_movies
from film_category fc inner join
film f on f.film_id=fc.film_id
where fc.category_id='14'
group by f.title;



--3 Find movies of actress first_name: "PENELOPE" last_name:"GUINESS"
select f.title as movies
from film f inner join
film_actor fa on f.film_id=fa.film_id
inner join actor a on a.actor_id=fa.actor_id
where a.first_name='PENELOPE' and a.last_name='GUINESS'
group by f.title;


--4 list Genres, movies (in each Genre), actors in each movie
select c.name as genres,f.title as movies, a.first_name as actor
from category c join
film_category fc on fc.category_id=c.category_id
join film f on fc.film_id=f.film_id
join film_actor fa on fa.film_id=f.film_id 
join actor a on a.actor_id=fa.actor_id
order by genres asc;


--5 List films that are rented from inventory
select f.title as films
from film f inner join
inventory i on i.film_id=f.film_id inner join
rental r on r.inventory_id=i.inventory_id
group by f.title
order by f.title asc;


--6 List genres corresponding movies rented by customer.
select c.name as generes,f.title as movies,r.customer_id,r.rental_id
from category c join
film_category fc on c.category_id=fc.category_id
join film f on f.film_id=fc.film_id
join inventory i on i.film_id=f.film_id join
rental r on r.inventory_id=i.inventory_id 
group by r.customer_id,c.name,f.title,r.rental_id
order by c.name asc;

--7  List 5 rows of customer which have renated "Horror" generes.
select cs.first_name,c.name as generes
from customer cs inner join
rental r on r.customer_id=cs.customer_id
inner join inventory i on i.inventory_id=r.inventory_id
inner join film f on f.film_id=i.film_id 
inner join film_category fc on fc.film_id=f.film_id
inner join  category c on c.category_id=fc.category_id
where c.name='horror'
group by cs.first_name,c.name
limit 5;


--8 List 5 staff members who have given 
            --maximum movies on rent (best performers)
select s.first_name, count(f.title)as total_movies
from staff s inner join rental r on
r.staff_id=s.staff_id inner join inventory i
on i.inventory_id=r.inventory_id inner join
film f on f.film_id=i.film_id
group by s.first_name,f.title
order by total_movies desc
limit 5;


--9 List top movies types Genre (by count) rented by customers.
select c.name,f.title,count(c.name)as total_movie
from category c inner join 
film_category fc on fc.category_id=c.category_id
inner join film f on f.film_id=fc.film_id
inner join inventory i on i.film_id=f.film_id
inner join rental r on r.inventory_id=i.inventory_id
inner join customer cs on cs.customer_id=r.customer_id
group by c.name,f.title
order by total_movie desc;


--10 List top movies (by count) by Genre (by count) in the inventory.
select f.title as movies,c.name,
count(f.title)as total_movies,count(c.name)as  total_genres
from category c inner join
film_category fc on fc.category_id=c.category_id
inner join film f on f.film_id=fc.film_id
inner join inventory i on i.film_id=f.film_id
group by c.name,f.title
order by total_genres desc;

