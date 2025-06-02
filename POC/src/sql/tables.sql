create table dbo.County (
   id int not null identity (1,1),
   code char(2) not null,
   name varchar(20) not null
);

create table dbo.Offering (
   id int not null identity (1,1),
   code varchar(10) not null,
   title varchar(50) not null,
   description varchar(100)
);

create table dbo.Director (
   id int not null identity (1,1),
   name varchar(100) not null
);

create table dbo.Status (
   id int not null identity (1,1),
   description varchar(50) not null
);

create table dbo.OfferingDetail (
   id int not null identity (1,1),
   offeringId int not null,
   countyId int not null,
   directorId int not null,
   statusId int not null,
   year int not null
);