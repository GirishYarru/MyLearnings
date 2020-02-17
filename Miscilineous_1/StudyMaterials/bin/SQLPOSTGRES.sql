select * from employee_learn

-- 1)create table
create table employee_learn1(
e_id int not null,
e_name varchar(50),
e_salary int,
e_age int,
e_gender varchar(10),
e_dept varchar(20),
primary key(e_id)
)

-- testing create query
select * from employee_learn1;

-- 2)insert Query

insert into employee_learn1 values(1,'aaa',111,11,'male','ECE');
insert into employee_learn1 values(2,'bbb',222,22,'female','CSE');
insert into employee_learn1 values(3,'ccc',333,33,'male','EEE');
insert into employee_learn1 values(4,'ddd',444,44,'female','IT');



-- 3) Update Query
update employee_learn1 set e_name='eee' where e_id = 4;
update employee_learn1 set e_id=10 where e_id = 4;
update employee_learn1 set e_name='govinda';

-- 4)Truncate table and delete both are same unless we specify condition for delete query
truncate employee_learn1;
delete from employee_learn1;

-- 5)delete Query with condition
delete from employee_learn1 where e_id in (1,2);
delete from employee_learn1 where e_id = 1;

//6)Select Queries
-- using 
--distinct
--and,or,like,not,between,in
-- 6.1
select * from employee_learn1;
-- 6.2 select using distinct

  -- inserted few queries for testing purpose
  insert into employee_learn1 values(5,'ddd',444,44,'other','IT');

-- 6.3 distinct using multiple column names  
select distinct (e_name,e_gender),e_dept from employee_learn1;
select distinct * from employee_learn1;

--6.4
-- if we use the same results we will not get any result
select * from employee_learn1 where e_gender='male' and e_gender='other';
select * from employee_learn1 where e_gender='other' and e_age=44;
-- using or
select * from employee_learn1 where e_gender='male' or e_age=11;
//select using like
-- starting with 'm'
select * from employee_learn1 where e_gender like 'm%';
-- ending with 'm'
select * from employee_learn1 where e_gender like '%m';
-- casting integer to string
select * from employee_learn1 where CAST(e_age AS TEXT) like '4%';
-- '_ ' represents that char can be anything
select * from employee_learn1 where CAST(e_age as TEXT) like '_4';

-- 6.5 selct using not
select * from employee_learn1 where not e_gender='female' and not e_gender='male';
-- 6.6 select using between - inclusive
select * from employee_learn1 where e_id between 1 and 3;

-- note for Strings it is complicated way, so better to use 'like'
-- Here in below example String between behaves like >=a and <=b
select * from employee_learn1 where e_name between 'a' and 'c';

//6.6 select Query using IN - inclusive
select * from employee_learn1 where e_id in (1,2,3);

-- 7)---------aggregate functions-----
-- note:- min() and max() also works for strings
7.1)Min() 
7.22)Max()
7.3)Sum()
7.4)Avg()
7.5)count()

--7.1 - max
select max(e_age) from employee_learn1;
-- Scenario display employee name with maximum salary
select distinct e_name,e_salary from employee_learn1 where e_salary = (select max(e_salary) from employee_learn1)
-- 7.2 -min
select min(e_name)  from employee_learn1;
-- 7.3 -sum
select sum(e_age) from employee_learn1;
-- 7.4 -avg 
select avg(e_age) from employee_learn1;
-- 7.5-count
select count(e_name) from employee_learn1;
-- scenario what is the count of name column if one column is null
  insert into employee_learn1 values(6,null,555,55,'male','BCOM');
  -- null value is not counted
select count(e_name) from employee_learn1;

------------ 8 String functions -----------
-- 8.1 LTRIM() --> remove blanks on left side of string
-- 8.2 RTRIM() --> remove blanks on right side of string
-- 8.3 LOWER() -->converts all characters to lower case
-- 8.4 UPPER() --> converts all characters to upper case
-- 8.5 REVERSE()--> reverse a string
-- 8.6 SUBSTRING()

-- 8.1 LTRIM()
  -- remove blanks on left side of string
  select LTRIM('    aaa  ') ;

 -- 8.2 RTRIM()
  -- remove blanks on right side of string
  select LTRIM('    aaa  ') ;

  -- note TRIM() --> trims both left and right sides of string
-- 8.3 lower() --> converts all characters to lower case
select LOWER('  ABC ');
select LOWER(TRIM('   ABC  '))
-- 8.4 UPPER() --> converts all 
select UPPER('abc');
-- 8.5 REVERSE() reverse a String()
select REVERSE('HELLO');
-- 8.6 SUBSTRING(string,start,end)
select SUBSTRING('hello',0,3);

-- 9) --------------- ORDER BY ----------
-- by default ascending order
-- ASC - ascending order
-- DESC - descending order

select * from employee_learn order by e_name;
select * from employee_learn order by e_name ASC;
select * from employee_learn order by e_name DESC;

-- 10) -------------- LIMIT ----
select * from employee_learn order by e_age LIMIT 2;
select sum(e_age) from employee_learn1 LIMIT 2;



- 11) ------- Group by ------
select e_gender,avg(e_age) from employee_learn1 group by e_gender;
-- scenario 
select e_name,avg(e_salary) from employee_learn1 group by e_name,e_age order by e_name desc;


select sum(e_age) from employee_learn1 where e_id =1;

-- group by,having,order by,limit

select e_dept,avg(e_salary) from employee_learn1 group by e_dept having avg(e_salary)>1 order by e_dept;


select * from department_learn;
select * from employee_learn;

select e_id,e_name,e_dept,dept_name,dept_location from employee_learn left join department_learn
on employee_learn.e_dept = department_learn.dept_name;

        select employee_learn.e_name,employee_learn.e_salary,employee_learn.e_age,employee_learn.e_dept,department_learn.dept_location,department_learn.dept_name  from employee_learn
    right join department_learn on employee_learn.e_dept = department_learn.dept_name order by e_name,e_salary;


select employee_learn.e_name,employee_learn.e_salary,employee_learn.e_age,employee_learn.e_dept,department_learn.dept_location,department_learn.dept_name  from employee_learn
    full join department_learn on employee_learn.e_dept = department_learn.dept_name order by e_name,e_salary;

 update employee_learn set e_age = e_age+10 from department_learn
 where employee_learn.e_dept = department_learn.dept_name and department_learn.dept_location = 'hyd';

 select *,
case
when e_salary<3000 then 'C'
when e_salary<4000  then 'B'
else 'A'
end as grade
from employee_learn
go

create table dummyTest(

id int,
name varchar(20)

)
create sequence seq
   INCREMENT 1
   START 1

   sekect seq
create sequence player_id_seq
select * from dummyTest
insert into dummyTest(name) values('hai')
alter table dummyTest alter column id set default nextval('player_id_seq');

ALTER TABLE dummyTest ADD id INT NOT NULL SERIAL PRIMARY KEY

ALTER TABLE dummyTest ALTER COLUMN id set default nextval('player_id_seq') PRIMARY KEY;

select * from dummyTest;
select * from copyDummyTest;
create table copyDummyTest as table dummyTest;

ALTER TABLE dummyTest
	ADD COLUMN id1 SERIAL PRIMARY KEY
ALTER TABLE dummyTest
	DROP COLUMN id1
	





