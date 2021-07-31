create table student(
id number(3) primary key,
name varchar2(30),
age number(2),
city varchar2(20)
);

drop table student;

insert into student values(101,'Vipin',30,'Bangalore');

select *from student;