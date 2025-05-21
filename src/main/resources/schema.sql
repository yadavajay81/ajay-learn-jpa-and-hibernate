create table course
(
	id bigint not null,
	name varchar(255) not null,
	author varchar(255) not null,
	primary key (id)

);

create table student
(
	id bigint not null,
	name varchar(255) not null,
	sclass varchar(255) not null,
	primary key (id)

);

create table employee
(
	id bigint not null,
	name varchar(255) not null,
	skill varchar(255) not null,
	primary key (id)

);
