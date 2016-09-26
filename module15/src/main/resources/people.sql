CREATE DATABASE people;

CREATE TABLE address
(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
address VARCHAR(255)
);

CREATE TABLE person
(
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
first_name varchar(255),
last_name varchar(255),
address_id int, 
FOREIGN KEY (address_id) REFERENCES address(id)
);


INSERT INTO address VALUE (id, 'Ap #999-6608 Felis, St.');