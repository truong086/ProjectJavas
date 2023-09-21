create database QuanLyQuanTraSua;

use QuanLyQuanTraSua;
-- select * from product;
create table categry(
	id int primary key auto_increment,
    tenloai nvarchar(50),
    ngaytao date
);

-- insert into categry(tenloai, ngaytao) values ('Trà sữa', '2022-10-10');

create table `account`( 
	id int primary key auto_increment,
	username nvarchar(50),
    `password` nvarchar(50),
    isSell int,
    isAdmin int
);

create table product(
	id int primary key auto_increment,
    title nvarchar(50),
    name nvarchar(50),
    image nvarchar(500),
    price double,  
    description nvarchar(500),
    catID int,
    foreign key (catID) references categry(id),
    soluong int,
    account_ID int,
    foreign key (account_ID) references `account`(id)
    
);


create table oder(
	id int primary key auto_increment,
    createDate date,
    customer_id int,
    foreign key(customer_id) references account(id),
    tongtien int
);

create table orderline(
	oder_id int,
    product_id int,
    foreign key (oder_id) references oder(id),
    foreign key (product_id) references product(id),
    quantity int,
    price float
);