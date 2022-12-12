create table client(
    id int auto_increment,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    age int not null
);

insert into client(firstname,lastname,age) values ('Benjamin', 'Seiberl', 23);