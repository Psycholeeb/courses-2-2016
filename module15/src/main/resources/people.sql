/*CREATE DATABASE IF NOT EXISTS People;# Затронута 1 строка.


CREATE TABLE if not exists People.address (
  id      INT PRIMARY KEY,
  address VARCHAR(255)
);# MySQL вернула пустой результат (т.е. ноль строк).


Create Table  IF NOT EXISTS People.person
(
id  int PRIMARY KEY,
first_name varchar(255),
last_name varchar(255),
address_id int,
FOREIGN KEY (id) REFERENCES address (id)
);# MySQL вернула пустой результат (т.е. ноль строк).
*/
/*
insert into People.address (id, address) values (1,'Ap #999-6608 Felis, St.');# Затронута 1 строка.

insert into People.address (id, address) values (2,'8403 In Road');# Затронута 1 строка.

insert into People.address (id, address) values (3,'4895 Dolor. Road');# Затронута 1 строка.

insert into People.address (id, address) values (4,'233-3092 Sem Av.');# Затронута 1 строка.

insert into People.address (id, address) values (5,'Ap #258-8948 At, Rd.');# Затронута 1 строка.

insert into People.address (id, address) values (6,'2911 Nec, Rd.');# Затронута 1 строка.

insert into People.address (id, address) values (7,'7886 Proin St.');# Затронута 1 строка.

insert into People.address (id, address) values (8,'Ap #314-418 Lorem Av.');# Затронута 1 строка.

insert into People.address (id, address) values (9,'Ap #821-4665 Lorem, Rd.');# Затронута 1 строка.

insert into People.address (id, address) values (10,'Ap #650-4921 Aptent Ave');# Затронута 1 строка.
*/
/*
insert into People.person (id, first_name, last_name, address_id) values (1,'Vincent','Keith',1);
insert into People.person (id, first_name, last_name, address_id) values (2,'Fritz','Bray',2);
insert into People.person (id, first_name, last_name, address_id) values (3,'Lyle','Patterson',3);
insert into People.person (id, first_name, last_name, address_id) values (4,'Holmes','Hardy',4);
insert into People.person (id, first_name, last_name, address_id) values (5,'Cody','Larson',5);
insert into People.person (id, first_name, last_name, address_id) values (6,'Gary','Ellis',6);
insert into People.person (id, first_name, last_name, address_id) values (7,'Victor','Jensen',7);
insert into People.person (id, first_name, last_name, address_id) values (8,'Galvin','Freeman',8);
insert into People.person (id, first_name, last_name, address_id) values (9,'Jack','Foley',9);
insert into People.person (id, first_name, last_name, address_id) values (10,'Christian','Torres',10);
insert into People.person (id, first_name, last_name, address_id) values (11,'Peter','Haney',3);
insert into People.person (id, first_name, last_name, address_id) values (12,'Cameron','Barry',2);
insert into People.person (id, first_name, last_name, address_id) values (13,'Aladdin','Barnett',9);
insert into People.person (id, first_name, last_name, address_id) values (14,'Lionel','Soto',1);
insert into People.person (id, first_name, last_name, address_id) values (15,'Preston','Trujillo',1);*/

select * from People.person

