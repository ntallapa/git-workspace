drop database bwiki_schema;

create database bwiki_schema;

use bwiki_schema;

CREATE TABLE bwiki_schema.test (
	no int(10) unsigned NOT NULL AUTO_INCREMENT,
	place varchar(50),
	rating int(1),
	type varchar(30),
	PRIMARY KEY (no)
	);

CREATE TABLE bwiki_schema.places (
	no int(10) unsigned NOT NULL AUTO_INCREMENT,
	place varchar(50),
	rating int(1),
	type varchar(30),
	dist int(10),
	direction varchar(30),
	road varchar(30),
	food varchar(10),
	lodge varchar(20),
	food_lodge varchar(20),
	petrol varchar(20),
	remarks varchar(50),
	days_reqd int(1),
	from_period varchar(3),
	to_period varchar(10),
	PRIMARY KEY (no)
);


CREATE TABLE bwiki_schema.movie_theatre (
	no int(10) unsigned NOT NULL AUTO_INCREMENT,
	theatre_name varchar(50),
	address varchar(100),
	pin_code varchar(10),
	contact_number varchar(30),
	contact_person varchar(30),
	rating varchar(15),
	language varchar(50),
	PRIMARY KEY (no)
);