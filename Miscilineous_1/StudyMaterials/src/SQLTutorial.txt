
create table employee_learn(
e_id int not null,
e_name varchar(50),
e_salary int,
e_age int,
e_gender varchar(20),
e_dept varchar(20),
primary key(e_id)
)

insert into employee_learn values(1,'aaa',1000,25,'male','IT');
insert into employee_learn values(2,'bbb',2000,25,'female','HR');
insert into employee_learn values(3,'CCC',3000,26,'female','Manager');
insert into employee_learn values(4,'CCC',4000,26,'male','Developer');
insert into employee_learn values(5,'   ddd',5000,26,'male','Tester');
insert into employee_learn values(6,'abcde',6000,30,'male','Team Lead');



update employee_learn set e_gender='female' where e_id = 4



select * from employee_learn;
select distinct(e_name,e_gender),e_dept from employee_learn
-- and
select * from employee_learn where e_age = 25 and e_name = 'aaa'
--or
select * from employee_learn where e_age = 25 or e_name = 'aaa'
--not 
select * from employee_learn where not e_gender='female'
--like --> %
select * from employee_learn where e_name like 'b%'
-- like --> _
select * from employee_learn where e_name like 'a_a%';
-- between
select * from employee_learn where e_age between 25 and 22;


--MIN()
select max(e_name) from employee_learn limit 2;
-- count()
select count(*) from employee_learn where e_age = 25

-- sum()
select sum(e_age) from employee_learn where e_gender = 'male';

-- avg()
select avg(e_age) from employee_learn;

-------------------- String Functions --------------------------------
--- LTRIM() -> removes bloans on left side of string
select ('    aaaaa');
select LTRIM('   aaaa');
select LTRIM(e_name) from employee_learn;

--- LOWER() converts string to lower case
select ('    ABABABA');
select LOWER('   ABABABA');
select LOWER(e_name) from employee_learn;
-- combine both ltrim() and lower()
select LTRIM(LOWER(e_name)) from employee_learn;

-- upper() -> converts all characters to upper case
select upper(e_name) from employee_learn;

-- reverse() --> reverse a strimg
select reverse(e_name) from employee_learn;

-- substring() ->
select substring(e_name,1,2) from employee_learn;

--- order by -> fro sorting(By default ascending order) ASC,DESC
select * from employee_learn order by e_dept; -- by default ascending order
select * from employee_learn order by e_dept ASC;
select * from employee_learn order by e_dept DESC; -- descending order

-- LIMIT -> used to get first N records from db(only in post gres)
select * from employee_learn order by e_salary DESC LIMIT 2;
-- for my sql TOP 
select TOP 2 * from employee_learn;

--- Group by -> get aggreagate result with respect to group
select e_gender,avg(e_salary) from employee_learn group by e_gender;
select e_name,e_gender,avg(e_salary) from employee_learn group by e_gender,e_name;
-- Group by using where condition
-- scenario :- need to find avg salary by grouping according to name and gender and need to display according to name in ascending order
select e_name,e_gender,avg(e_salary) from employee_learn where e_gender = 'male' group by e_gender,e_name order by e_name;
-- scenario 2 :- display avg(age),dept for each department and also need to sort by avg age in descending order
select avg(e_age),e_dept from employee_learn group by e_dept order by avg(e_age) desc;

--> having clause -> to impose conditions on group by clause(where clause cannot be used with aggreagate funs
select e_dept,avg(e_salary) as avg_salary from employee_learn group by e_dept having avg(e_salary)>5000;
select e_dept,avg(e_salary) as avg_salary from employee_learn group by e_dept where avg(e_salary)>5000; -- where cannot be used with aggreagte funs

--> update -> modify the existing records in table
-- ex: update Table set col1 = val1,col2=val2... where condition
update employee_learn set e_name = 'ddd' where  e_dept = 'Tester';

--> delete existing records in the table
select * from employee_learn
insert into employee_learn values(7,'abcde',6000,30,'male','Team Lead1');
insert into employee_learn values(8,'abcde',6000,30,'male','Team Lead1');

delete from employee_learn where e_dept = 'Team Lead1';

--> Truncate delete all data inside table,structure of table remains same
Truncate table table_name;

--> Inner join -> matching values between two tables
-- syntax:- select columns from table1 inner join table2 on table1.column_x = table2.column_y;

     create table department_learn
    (
      dept_id int not null,
      dept_name varchar(100) not null,
      dept_location varchar(100) not null,
      primary key (dept_id)
    );

    insert into department_learn values(1,'Team Lead','bangalore');
    insert into department_learn values(2,'Team Lead','hyd');
        insert into department_learn values(3,'Dummy','US');


    select * from department_learn;
-- inner join 
    select employee_learn.e_name,employee_learn.e_dept,department_learn.dept_location from employee_learn inner join department_learn 
    on employee_learn.e_dept = department_learn.dept_name;

-- left join -> returns all the records from left table and matched records from right table

    select employee_learn.e_name,employee_learn.e_salary,employee_learn.e_age,employee_learn.e_dept,department_learn.dept_location,department_learn.dept_name  from employee_learn
    left join department_learn on employee_learn.e_dept = department_learn.dept_name order by e_name,e_salary;

    -- using where condition
        select employee_learn.e_name,employee_learn.e_salary,employee_learn.e_age,employee_learn.e_dept,department_learn.dept_location,department_learn.dept_name  from employee_learn
    left join department_learn on employee_learn.e_dept = department_learn.dept_name where dept_location is not null order by e_name,e_salary;

    -- Right join
        select employee_learn.e_name,employee_learn.e_salary,employee_learn.e_age,employee_learn.e_dept,department_learn.dept_location,department_learn.dept_name  from employee_learn
    right join department_learn on employee_learn.e_dept = department_learn.dept_name order by e_name,e_salary;

-- full join --> returns all the records
        select employee_learn.e_name,employee_learn.e_salary,employee_learn.e_age,employee_learn.e_dept,department_learn.dept_location,department_learn.dept_name  from employee_learn
    full join department_learn on employee_learn.e_dept = department_learn.dept_name order by e_name,e_salary;



-- update to join condition
-- update employee table based on depatrment location in department table
   -- common column is dept_name but not dept_location
     -- from department table get the dept_name for the given location and from dept_name get the match records in employe table
update employee_learn set e_age = e_age+10 from employee_learn 
 inner join department_learn on employee_learn.e_dept = department_learn.dept_name
 where department_learn.dept_location = 'hyd' ; -- this works only for mysql

-- update join query for postgres
 update employee_learn set e_age = e_age+10 from department_learn
 where employee_learn.e_dept = department_learn.dept_name and department_learn.dept_location = 'hyd';

   select * from employee_learn
   
-- delete with join in postgres
delete from employee_learn
using department_learn 
where employee_learn.e_dept = department_learn.dept_name and 
department_learn.dept_location = 'hyd';

select * from employee_learn;

-- union operator combine result set of two or more SELECT statements
-- in the final result there  will not be duplicates
-- number and order of the columns should be same in two tables
select column_list from table1
union
select column_list from table2 

select e_id,e_name,e_name from employee_learn where e_id>3
union
select dept_id,dept_name,dept_location from department_learn where dept_id>3 order by e_id

-- union All --> does not include duplicates
-- combines two or more select statements incuding duplicates
select e_id,e_name,e_name from employee_learn 
union all
select dept_id,dept_name,dept_location from department_learn
-- updated to check difference of union and union all
update department_learn set dept_name = 'CCC' ,dept_location='CCC' where dept_id = 3

-- Except operator
-- combines two select statements and return uniques records from left query
-- which are not a part of right query like A-B
select column_list from table1
except
select column_list from table2

select e_id,e_name,e_name from employee_learn
except
select dept_id,dept_name,dept_location from department_learn;

-- intersect operator
-- returns only the intersection records
select column_list from table1
intersect
select column_list from table2

select e_id,e_name,e_name from employee_learn
intersect
select dept_id,dept_name,dept_location from department_learn;

-- view --> virtual table based on result of an sql statement
create view view_name as select column_list
from table
where condition;

--> creating view
 create view female_employees as 
 select * from employee_learn where e_gender = 'female';

--> selecting view
 select * from female_employees;

 -- drop view
 drop view female_employees;

 -------------------Alter table - addcolumn --->
 Alter table table_name add colum_name dataTpye;

 alter table employee_learn
 add e_dob date;

 select * from employee_learn;

 -- drop column from a table
 Alter table table_name
 drop column column_name

 alter table employee_learn
 drop column e_dob;

 -------------------Merge statemet - inset update and delete i one statement ------
 
     create table source
    (
      e_id int not null,
      e_name varchar(100) not null,
      e_salary int,
      e_age int,
      e_gender varchar(100),
      e_dept varchar(100),
      primary key (e_id)
    );
    insert into source values(1,'sam',9300,40,'male','Operations');
    insert into source values(2,'bob',8000,21,'male','Support');
    insert into source values(3,'anne',13000,25,'female','Analytics');
    insert into source values(6,'jeff',11200,27,'male','Operations');
    insert into source values(7,'adam',10000,28,'male','Content');
    insert into source values(8,'priya',8500,37,'female','Tech');


     create table Target
    (
      e_id int not null,
      e_name varchar(100) not null,
      e_salary int,
      e_age int,
      e_gender varchar(100),
      e_dept varchar(100),
      primary key (e_id)
    );

    insert into Target values(1,'sam',9500,45,'male','Operations');
    insert into Target values(2,'bob',8000,21,'male','Support');
    insert into Target values(3,'anne',12500,25,'female','Analytics');
    insert into Target values(4,'julia',7300,30,'female','Analytics');
    insert into Target values(5,'Matt',159000,33,'male','Sales');
    insert into Target values(6,'jeff',11200,27,'male','Operations');

    select * from source;
    select * from target;
 -- Merge -> insert,update and delete in one statement
 -- two tables source and target
 -- source -> contains all the changes that are need to be applied
 -- target -> table upon which we implement all the changes
-- both should have common column
-- Syntax:
MERGE [TARGET] As T
USING [Source] AS S
      ON [Join Condition]
When MATCHED
     THEN [Update statement]-- if rows matched based on join condition ,then we will update target table
When NOT MATCHED BY TARGET -- if there are some rows in source table and not in target table then
     THEN [insert statement] --insert into target table
When NOT matched by source -- if there are some rows in target table but not in source then 
     Then [delete] statement -- then delete

MERGE into target as T
using source as S
       ON T.e_id=S.e_id
when matched
        then update set T.e_salary = S.e_salary,T.e_age = S.e_age
when not matched by target
        then insert (e_id,e_name,e_salary,e_age,e_gender,e_dept)
        values(S.e_id,e_name,S.e_salary,S.e_age,S.e_gender,S.e_dept)
when not matched by source
         then delete;

---------------- user defined functions --------------
---1)Scalar valued
-- 2) Table valued
-- 1) Scalar valued -> Always return int,varchar ---etc
-- Syntax:
CREATE Function function_name(@param1 data_type,@param2 data_type ..etc)
RETURNS return_datatype
As
BEGIN
 ---- function body
 Return value
 end

 create function add_five(num int)
 returns int
 as $$
 begin
 return num+5;
 end; $$
LANGUAGE PLPGSQL;

 select add_five(10);

 -- table valued function
 -- returns a table
 -- note:- no begin adn end statements
 --syntax
 create function fun_name(var1 data_type,var2 data_type..etc)
 returns table
 As 
 return (select column_list from table where[condition])


DROP FUNCTION select_gender(character varying,character varying);
--to display al rows
 create or replace function select_gender(gender varchar(100),table_name varchar(100))
 returns setof employee_learn
 As $$
 begin
--return query (select * from table_name where e_gender=gender);
 return QUERY EXECUTE 'SELECT * FROM ' || table_name ||' where e_gender = ''female'''|| '';
 end;
$$
LANGUAGE PLPGSQL;

select * from select_gender('female','employee_learn');

-- temporary tables -> created in tempDB and deleted as soon as session is terminated
-- useful in cases where ecer we need to show temp data
-- here we need to use hash
-- syntax:-
--- this is in MySQL
create table #table_name(
);

--this is in postgresSQL
create TEMPORARY TABLE table_name(
);

create TEMPORARY TABLE Temp_Student(
s_id int,
s_name varchar(200)
);

select * from Temp_Student;

--- SQL Case statement ----
-- helpful for multi way decision making
--syntax:-
CASE
   WHEN condition1 THEN result1
   WHEN condition2 THEN result2
   WHEN conditionN THEN resultN
   ELSE result
END;

select 
case
    when 10>20 then '10 is grater than 20'
    when 10<20 then '10 is less than 20'
else '10 is equal to 20'
end;


select * from employee_learn

select *,
case
when e_salary<3000 then 'C'
when e_salary<4000  then 'B'
else 'A'
end as grade
from employee_learn
go

------IF Function is alternate of case statement

DO $$
DECLARE
  a integer := 100;
  b integer := 20;
BEGIN 
  IF a > b THEN
   perform select * from employee_learn;
  END IF;
 
  IF a < b THEN
   RAISE NOTICE 'a is less than b';
  END IF;
 
  IF a = b THEN
   RAISE NOTICE 'a is equal to b';
  END IF;
END $$;

select e_id,e_age








https://www.youtube.com/watch?v=JTDK6r1GuUU

learnt today
1)min and max also works for strings, but avg() and sum() doesn't work
2) between and in are inclusive
3)substring in sql does not throw any exception
  substring in sql also gives value for -ve values
  "hello".substring(-1) --> hello
select SUBSTRING('hello',0,3); --> he
select SUBSTRING('hello',0,3); --> hel
 


//Scenario
count only first 3 rows

//need to learn
sub string in java
"hello"



