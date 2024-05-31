create database miempresa;
use miempresa;

create table empleados(
documento char(8) not null primary key, nombre varchar(30) not null,
domicilio varchar(30), seccion varchar(20) );

create table controlCambios(
id_cambio INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
usuario varchar(30), documento_usuario char(8), fecha date,
datoanterior varchar(30), datonuevo varchar(30) );

Ingresamos algunos registros:

insert into empleados values('22222222','Ana Acosta','Bulnes 56','Secretaria');
insert into empleados values('23333333','Bernardo Bustos','Bulnes 188','Contabilidad'); insert into empleados values('24444444','Carlos Caseres','Caseros 364','Sistemas'); insert into empleados values('25555555','Diana Duarte','Colon 1234','Sistemas');
insert into empleados values('26666666','Diana Duarte','Colon 897','Sistemas'); insert into empleados values('27777777','Matilda Morales','Colon 542','Gerencia');

