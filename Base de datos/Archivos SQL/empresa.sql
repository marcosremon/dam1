create table empleados (
    DNI varchar(9) PRIMARY KEY,
    nombre varchar(20),
    apellidos varchar(20),
    fecha_nacimiento date,
    salario float,
    telefono varchar(9),
    productividad int,
    constraint chk_productividad check (productividad > 0 and productividad <= 3)
);

create table departamentos (
    codigo int primary key AUTO_INCREMENT,
    nombre varchar(20),
    jefe varchar(9) references empleados (DNI)
);

create table tareas (
    codigo int primary key auto_increment,
    nombre varchar(20),
    descripcion varchar(20),
    fecha_inicio date,
    fecha_fin date,
    empleado varchar(9) references empleados (DNI)
);

alter table empleados add column departamento int;
alter table empleados add foreign key (departamento) references departamentos(codigo);


insert into departamentos (nombre,jefe) values
('A','A'),
('B','C'),
('C','C');

insert into tareas (nombre,descripcion,fecha_inicio,empleado) values 
('Tarea a','Desc a',now(),'A'),
('Tarea b','Desc b',now(),'B'),
('Tarea c','Desc c',now(),'C');

insert into empleados values
('A','a','aa','1980-01-01',1000,'123123123',2,1),
('B','b','bb','1981-01-01',1100,'123123123',1,2),
('C','c','cc','1982-01-01',1200,'123123123',2,3),
('D','d','dd','1983-01-01',1300,'123123123',3,1);
