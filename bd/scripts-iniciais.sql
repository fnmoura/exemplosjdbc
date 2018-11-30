/* excluir banco de dados se ele existir */
drop database if exists agenda;

/* criando o banco de dados */
create database agenda;

/* usando o banco de dados */
use agenda;

/* criando a tabela contato */
create table contato (
   codigo   int         not null   auto_increment,
   nome     varchar(50) null                     ,
   telefone varchar(50) null                     ,
   email    varchar(50) null                     ,
   dt_cad   date        null                     ,
   obs      text                                 ,
primary key (codigo)
);

