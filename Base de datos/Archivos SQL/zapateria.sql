CREATE DATABASE zapateria;
USE zapateria;
CREATE TABLE clientes (
    dni CHAR(9) PRIMARY KEY,
    nombre VARCHAR(20),
    telefono VARCHAR(12)
);
CREATE TABLE ventas (
    id_venta INT PRIMARY KEY AUTO_INCREMENT,
    fecha DATE,
    costeTotal FLOAT
);
CREATE TABLE zapatos (
    Id_zap INT PRIMARY KEY AUTO_INCREMENT,
    talla INT,
    color VARCHAR(10),
    precio FLOAT
);
CREATE TABLE RELACION (
    Id_zap INT,  
dni CHAR(9),
id_ticket INT,
PRIMARY KEY (Id_zap, dni, id_ticket),
FOREIGN KEY (id_ticket) REFERENCES ventas(id_venta),
    FOREIGN KEY (dni) REFERENCES clientes(dni),
FOREIGN KEY (Id_zap) REFERENCES zapatos(Id_zap));
