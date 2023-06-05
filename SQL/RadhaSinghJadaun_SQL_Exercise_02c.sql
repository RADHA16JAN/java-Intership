--11   List of actors who have not acted in any flim.
select  a.first_name as actors
from actor a left join
film_actor fa on fa.actor_id=a.actor_id left join
film f on f.film_id=fa.film_id
where f.film_id is null

--12   List of films that are not in inventory
select f.title as films
from film f left join inventory i 
on i.film_id=f.film_id
where i.film_id is null

--13   List of actors who are not in inventory
select a.first_name as actors
from actor a left join film_actor fa 
on a.actor_id=fa.actor_id left join inventory i
on i.film_id=fa.film_id 
group by a.first_name
having count(distinct i.inventory_id) != ( 
    select count(distinct inventory_id) 
   from inventory
  )


--14   List of actors whose movies are not stores.
select a.first_name as actor
from actor a left join film_actor fa
on fa.actor_id=a.actor_id left join film f
on f.film_id=fa.film_id left join inventory i
on i.film_id=f.film_id left join store s on
s.store_id=i.store_id
where s.store_id is null and i.film_id is null
and f.film_id is null and fa.actor_id is null



--15   List of staff who have not rented movies.
select s.first_name as staff 
from staff s left join rental r on
r.staff_id=s.staff_id  left join 
inventory i on i.inventory_id=r.inventory_id
left join film f on f.film_id=i.film_id
where i.inventory_id is null

--16   categories which do not have movies.
select c.name as category
from category c join film_category fc on
fc.category_id=c.category_id left join film f
on f.film_id=fc.film_id
where c.category_id is null and f.film_id is null

--17   Actors who acted in all movie categories
select a.first_name as actor
from actor a join film_actor fa on
fa.actor_id=a.actor_id join film_category fc
on fc.film_id=fa.film_id
group by a.first_name
having count(distinct fc.category_id) = ( 
    select count(distinct category_id) 
   from film_category
  )

--18  Actors who did NOT act in all movie categories
select a.first_name as actor
from actor a join film_actor fa on
fa.actor_id=a.actor_id join film_category fc
on fc.film_id=fa.film_id
group by a.first_name
having count(distinct fc.category_id) != ( 
    select count(distinct category_id) 
   from film_category
  )



--19  List of stores with address, city, countries.
select s.store_id, a.address,ct.city,c.country
from store s join address a
on a.address_id=s.address_id join
city ct on ct.city_id =a.city_id join
country c on c.country_id=ct.country_id
group by s.store_id, a.address,ct.city,c.country

--20  List of stores that do not have inventory.
select s.store_id
from store s left join
inventory i on i.store_id=s.store_id
where i.store_id is null;

--21  List of customers who do not have movie rentals.
select c.first_name as customers
from customer c left join 
rental r on r.customer_id=c.customer_id 
left join inventory i on i.inventory_id=r.inventory_id
left join film f on f.film_id=i.film_id
where r.customer_id is null and f.film_id is null and 
i.inventory_id is null


--22  List of Customers in India with address. 
select c.first_name as customer,a.address
from customer c join
address a on a.address_id=c.address_id 
join city ct on ct.city_id=a.city_id
where ct.country_id='44'
group by c.first_name,a.address
order by a.address asc;


--23  List of Customers with address all over the world.
select c.first_name as customer,ct.city,cn.country
from customer c join address a
on c.address_id=a.address_id join
city ct on ct.city_id=a.city_id join 
country cn on cn.country_id=ct.country_id
group by c.first_name,cn.country,ct.city
order by cn.country;

--24  List of movies made in Japanese or Mandarin.
select  f.title as movies,l.name as languages
from language l left join
film f on l.language_id=f.language_id
where l.language_id = '3' or l.language_id= '4'

--25  List of languages with no movies.
select  l.name as languages
from language l left join
film f on l.language_id=f.language_id
where f.language_id is null;