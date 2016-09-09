CREATE DATABASE people;

CREATE TABLE address
(
id INT PRIMARY KEY,
address VARCHAR(255)
);

CREATE TABLE person
(
id int PRIMARY KEY,
first_name varchar(255),
last_name varchar(255),
address_id int, 
FOREIGN KEY (address_id) REFERENCES address(id)
);