--1 Get list of tables
select * from information_schema.tables; 

--2  Get list of columns and data types
-- for columns
select column_name from information_schema.columns; 
-- for data types
select data_types from information_schema.columns; 

--3  Get list of Schema, tables, columns.
--schema
select schema_name from information_schema.schemata;
--tables
select table_name from information_schema.tables;
--columns
select column_name from information_schema.columns;

--4  Get list of constraints 
--(Primary Key, Foreign Key, Check Constraints).
select * from information_schema.table_constraints;

--5  What is difference between Primary Key,
  -- Foreign Key and Unique Contraints.
  
  -- primary key uniquely indentifies a row in a table
  --foreign key used to link together by referencing primary key of related table
  --unique constraints  ensures that all values in a column are different . for a table their can be more than one unique constraints
  
--6   Get list of indexes for each tables.
select tablename, indexname
from pg_indexes;

--7  Understand table structures along with relationships, for each table look at data and see if they are in 1 Normal form, 2nd Normal Form or 3rd Normal form.
--Format should be <Table> <Name> <Normal Form Reason>
select table_name
from information_schema.tables;
--analysing 1st one:
Select *
from pg_statistic

--8 create database diagram using dbdiagram.io
--Done
--9 Calculate size of each table and total database size.
--database size
select pg_database.datname, 
 pg_database_size(pg_database.datname)*8/1024 AS size_in_KB 
from pg_database;
 --tables size
select pg_size_pretty (
    pg_tablespace_size ('pg_default') as Size_of_Table_in_MB 
      );


--10  Get list of users and related permissions.
-- list of users
select datname from pg_database;

select *
from pg_database

