-- CUSTOMERS SQL

select * from customers;

create table customers(
	bno number(4) primary key,
	name varchar2(30) not null,
	email varchar2(30),
	phone varchar2(30)
);


