create table client(
    id int auto_increment,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    age int not null,
    PRIMARY KEY (id)
);

insert into client(firstname,lastname,age) values ('Benjamin', 'Seiberl', 23);
insert into client(firstname,lastname,age) values ('Simon', 'Sebert', 21);
insert into client(firstname,lastname,age) values ('Stefan','Stanzel',23);
insert into client(firstname,lastname,age) values ('Katja','Schimak',35);
insert into client(firstname,lastname,age) values ('Florider','Reiter',32);
insert into client(firstname,lastname,age) values ('Florian','Haberfellner',28);
insert into client(firstname,lastname,age) values ('Franz-Peter','Manias',33);

create table employee(
    id int auto_increment,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    position varchar(255) not null,
    age int not null,
    PRIMARY KEY (id)
);

insert into employee(firstname,lastname,position,age) values ('Theresa', 'Leutner', 'Verkäuferin', 28);
insert into employee(firstname,lastname,position,age) values ('Herbert', 'Karner', 'Verkäufer', 53);
insert into employee(firstname,lastname,position,age) values ('Norbert', 'Neumann', 'IT-Spezialist', 36);
insert into employee(firstname,lastname,position,age) values ('Maria', 'Lechner', 'Verkaufsleiterin', 48);
insert into employee(firstname,lastname,position,age) values ('Helena', 'Porsa', 'Verkäuferin', 61);

create table employeeclient(
    employeeId int ,
    clientId int,
    PRIMARY KEY(employeeId,clientId),
    FOREIGN KEY (employeeId) REFERENCES employee(id),
    FOREIGN KEY (clientId) REFERENCES client(id)
);

insert into employeeclient(employeeId, clientId) values (1,1);
insert into employeeclient(employeeId, clientId) values (1,4);
insert into employeeclient(employeeId, clientId) values (1,5);
insert into employeeclient(employeeId, clientId) values (2,1);
insert into employeeclient(employeeId, clientId) values (2,3);
insert into employeeclient(employeeId, clientId) values (2,4);
insert into employeeclient(employeeId, clientId) values (3,1);
insert into employeeclient(employeeId, clientId) values (4,1);
insert into employeeclient(employeeId, clientId) values (4,2);
insert into employeeclient(employeeId, clientId) values (4,3);
insert into employeeclient(employeeId, clientId) values (4,4);