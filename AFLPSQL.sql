drop database if exists project1;
create database project1;
use project1;

create table User(
id	int		primary key		auto_increment	not null,
nome	varchar(100)		not null,
cpf		varchar(100)		not null	unique,
login   varchar(60)			not null	unique,
senha 	varchar(60)			not null 	


);

create table Employee(
id	int		primary key				auto_increment	not null,
nome	varchar(100)				not null,
cpf		varchar(100)				not null	unique,
data_de_nascimento	varchar(50)		not null,
sexo	varchar(100)				not null,
cargo	varchar(100)				not null,
data_de_admissao	varchar(50)		not null,
endereco	varchar(100) 			not null	unique,
cidade	varchar(100) 				not null,
estado  varchar(50) 					not null

);

create table Company(
id		int		primary key		auto_increment		not null,
razao_social	varchar(100)			not null,
cnpj	varchar(100)			not null,
endereco	varchar(100)		not null
);

select * from Company;