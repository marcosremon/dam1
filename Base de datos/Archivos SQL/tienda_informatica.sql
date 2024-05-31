CREATE DATABASE tienda_informatica;
USE tienda_informatica;

CREATE TABLE productos (
id INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(20), precio NUMERIC(5,2)
);
INSERT INTO productos (nombre, precio) VALUES
('Sobremesa', 600.50),
('Portátil', 750.99),
('PS4',250.00);
