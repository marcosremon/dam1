-- MySQL dump 10.13  Distrib 8.0.35, for Win64 (x86_64)
--
-- Host: localhost    Database: rest_examen
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `areascobertura`
--

DROP TABLE IF EXISTS `areascobertura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `areascobertura` (
  `codigoRes` int NOT NULL,
  `codigoPostal` int NOT NULL,
  PRIMARY KEY (`codigoRes`,`codigoPostal`),
  CONSTRAINT `fk_areas` FOREIGN KEY (`codigoRes`) REFERENCES `restaurantes` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `areascobertura`
--

LOCK TABLES `areascobertura` WRITE;
/*!40000 ALTER TABLE `areascobertura` DISABLE KEYS */;
INSERT INTO `areascobertura` VALUES (1234,12345),(1234,12346),(2345,12345),(2345,12568),(3456,28224),(4444,28224),(5677,28224);
/*!40000 ALTER TABLE `areascobertura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `DNI` char(9) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `calle` varchar(20) DEFAULT NULL,
  `numero` int DEFAULT NULL,
  `piso` varchar(5) DEFAULT NULL,
  `localidad` varchar(15) DEFAULT NULL,
  `codigoPostal` int DEFAULT NULL,
  `telefono` varchar(9) DEFAULT NULL,
  `usuario` varchar(8) NOT NULL,
  `contraseña` char(8) DEFAULT ' Nopass',
  PRIMARY KEY (`DNI`),
  UNIQUE KEY `un_Usuario` (`usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES ('12345678M','Francisco','García Siñeriz','Tembleque',78,'BJ-A','Madrid',12346,'789345312','Nopass','Nopass'),('12345678N','Pedro','Pérez','Torralba',29,'4-B','Madrid',12345,'676856753','12345612','pedro'),('12345679M','Ágata','Valle Dorado','Gallur',78,'3-A','Leganés',28224,'676856743','agata','agata'),('45678901Y','María','Jorda Lorente','Leiva',1,'4-I','Móstoles',78945,'666123456','mari','passwd');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contiene`
--

DROP TABLE IF EXISTS `contiene`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contiene` (
  `restaura` int NOT NULL,
  `plato` char(25) NOT NULL,
  `pedido` int NOT NULL,
  `precio_con_comision` double(8,2) DEFAULT NULL,
  `unidades` int NOT NULL,
  PRIMARY KEY (`restaura`,`plato`,`pedido`),
  KEY `fk_contiene_pedido` (`pedido`),
  CONSTRAINT `fk_contiene_pedido` FOREIGN KEY (`pedido`) REFERENCES `pedidos` (`codigo`) ON DELETE CASCADE,
  CONSTRAINT `fk_contiene_plato` FOREIGN KEY (`restaura`, `plato`) REFERENCES `platos` (`resCod`, `nombrePlato`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contiene`
--

LOCK TABLES `contiene` WRITE;
/*!40000 ALTER TABLE `contiene` DISABLE KEYS */;
INSERT INTO `contiene` VALUES (1234,'pizza arrabiata',2,NULL,2),(1234,'pizza margarita',9,NULL,2),(1234,'pizza vegetal',9,NULL,2),(2345,'chana masala',2,NULL,1),(2345,'pollo tikka',7,NULL,3),(3456,'crunch-burguer',7,NULL,1),(3456,'hot-burguer',9,NULL,1),(3456,'vege-burguer',3,NULL,4),(3456,'vege-burguer',7,NULL,1),(5678,'torta gallega',4,NULL,1),(5678,'tortaDeCarneEspecial',8,NULL,1);
/*!40000 ALTER TABLE `contiene` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `descuentos`
--

DROP TABLE IF EXISTS `descuentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `descuentos` (
  `codigodescuento` int NOT NULL,
  `fecha_caducidad` date DEFAULT NULL,
  `porcentaje_descuento` int NOT NULL,
  PRIMARY KEY (`codigodescuento`),
  CONSTRAINT `ck_descuento_porcentaje_0_100` CHECK (((`porcentaje_descuento` > 0) and (`porcentaje_descuento` <= 100)))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `descuentos`
--

LOCK TABLES `descuentos` WRITE;
/*!40000 ALTER TABLE `descuentos` DISABLE KEYS */;
INSERT INTO `descuentos` VALUES (1100,'2025-04-20',50),(1200,'2025-03-30',25),(1300,'2025-06-30',5),(1400,'2025-06-30',10),(1500,'2025-06-30',100);
/*!40000 ALTER TABLE `descuentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horarios`
--

DROP TABLE IF EXISTS `horarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horarios` (
  `codRes` int NOT NULL,
  `dia_semana` char(1) NOT NULL,
  `hora_apertura` time NOT NULL,
  `hora_cierre` time NOT NULL,
  PRIMARY KEY (`codRes`,`dia_semana`),
  CONSTRAINT `fk_Horarios` FOREIGN KEY (`codRes`) REFERENCES `restaurantes` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horarios`
--

LOCK TABLES `horarios` WRITE;
/*!40000 ALTER TABLE `horarios` DISABLE KEYS */;
INSERT INTO `horarios` VALUES (1234,'J','12:00:00','23:00:00'),(1234,'S','12:00:00','17:00:00'),(1234,'V','20:00:00','03:00:00'),(1234,'X','12:00:00','23:00:00'),(2345,'D','12:00:00','23:00:00'),(2345,'J','12:00:00','23:00:00'),(2345,'S','20:00:00','03:00:00'),(2345,'V','12:00:00','03:00:00'),(3456,'D','12:00:00','18:00:00'),(3456,'J','12:00:00','23:00:00'),(3456,'S','20:00:00','03:00:00'),(3456,'V','20:00:00','03:00:00'),(4444,'D','12:00:00','18:00:00'),(4444,'J','12:00:00','23:00:00'),(4444,'S','20:00:00','03:00:00'),(4444,'V','20:00:00','03:00:00'),(5677,'V','20:00:00','01:00:00'),(5678,'J','12:00:00','23:00:00'),(5678,'L','12:00:00','18:00:00'),(5678,'M','12:00:00','18:00:00'),(5678,'X','12:00:00','18:00:00');
/*!40000 ALTER TABLE `horarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `estado` char(9) NOT NULL DEFAULT 'REST',
  `fecha_hora_pedido` timestamp NOT NULL,
  `fecha_hora_entrega` timestamp NULL DEFAULT NULL,
  `importe_total` double(8,2) DEFAULT NULL,
  `cliente` char(9) NOT NULL,
  `codigodescuento` int DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `fk_pedido_cliente` (`cliente`),
  KEY `fk_pedido_descuento` (`codigodescuento`),
  CONSTRAINT `fk_pedido_cliente` FOREIGN KEY (`cliente`) REFERENCES `clientes` (`DNI`),
  CONSTRAINT `fk_pedido_descuento` FOREIGN KEY (`codigodescuento`) REFERENCES `descuentos` (`codigodescuento`) ON DELETE SET NULL,
  CONSTRAINT `ck_pedido_estado` CHECK ((`estado` in (_cp850'REST',_cp850'CANCEL',_cp850'RUTA',_cp850'ENTREGADO',_cp850'RECHAZADO')))
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
INSERT INTO `pedidos` VALUES (1,'REST','2024-02-17 18:50:00','2024-02-17 19:50:00',100.00,'12345678N',1100),(2,'ENTREGADO','2024-02-16 18:50:00','2024-02-16 19:50:00',48.30,'12345678N',1100),(3,'ENTREGADO','2024-02-15 21:50:00','2024-02-15 22:10:00',31.68,'12345678N',1400),(4,'REST','2024-02-17 19:10:00','2024-02-17 19:50:00',22.57,'12345678M',NULL),(5,'RECHAZADO','2009-02-16 18:50:00','2024-02-16 19:50:00',100.00,'12345678M',NULL),(6,'CANCEL','2024-02-15 21:50:00','2024-02-15 22:10:00',100.00,'12345678M',1400),(7,'CANCEL','2024-02-15 14:10:00','2024-02-15 14:20:00',76.93,'12345679M',NULL),(8,'RUTA','2024-02-16 18:50:00','2024-02-16 19:50:00',13.01,'45678901Y',1200),(9,'ENTREGADO','2024-02-15 21:50:00','2024-02-15 22:10:00',45.36,'45678901Y',1100);
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `platos`
--

DROP TABLE IF EXISTS `platos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `platos` (
  `resCod` int NOT NULL,
  `nombrePlato` char(20) NOT NULL,
  `precio` double(8,2) DEFAULT NULL,
  `descripcion` char(30) DEFAULT NULL,
  `categoria` char(30) DEFAULT NULL,
  PRIMARY KEY (`resCod`,`nombrePlato`),
  KEY `I_CatPlatos` (`categoria`),
  CONSTRAINT `fk_Platos` FOREIGN KEY (`resCod`) REFERENCES `restaurantes` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `platos`
--

LOCK TABLES `platos` WRITE;
/*!40000 ALTER TABLE `platos` DISABLE KEYS */;
INSERT INTO `platos` VALUES (1234,'pizza arrabiata',17.50,'pizza de carne y guindilla','picante'),(1234,'pizza margarita',8.50,'tomate y queso','pizza'),(1234,'pizza vegetal',10.50,'queso y verduras','pizza'),(2345,'chana masala',12.00,'garbanzos y arroz','vegetariano'),(2345,'pollo tikka',16.50,'pollo con especias','picante'),(3456,'crunch-burguer',15.50,'hamburguesa con pan crujiente','carne'),(3456,'hot-burguer',6.00,'hamburguesa con salsa picante','picante'),(3456,'vege-burguer',7.20,'hamburguesa vegetal','vegetariano'),(4444,'jamón de Teruel',15.00,'pan con tomate y jamón','carne'),(4444,'regañao',10.50,'bollo de pan con sardina','pizza'),(5678,'torta gallega',21.00,'torta de pulpo','pescado'),(5678,'tortaDeCarneEspecial',12.10,'torta de carne y queso brie','carne');
/*!40000 ALTER TABLE `platos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `restaurantes`
--

DROP TABLE IF EXISTS `restaurantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `restaurantes` (
  `codigo` int NOT NULL,
  `nombre` char(20) NOT NULL,
  `calle` char(30) NOT NULL,
  `codigo_postal` int NOT NULL,
  `comision` double(8,2) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurantes`
--

LOCK TABLES `restaurantes` WRITE;
/*!40000 ALTER TABLE `restaurantes` DISABLE KEYS */;
INSERT INTO `restaurantes` VALUES (1234,'pizzahud','abascal 45',12345,2.00),(2345,'Templo hindú','carbón 22',12567,5.00),(3456,'burguer-burguer','diamante 12',28224,10.00),(4444,'teruel','la copa 20',12345,2.50),(5677,'rissoto','viñagrande 29',28925,5.50),(5678,'telericatorta','cántaro 17',28225,7.50);
/*!40000 ALTER TABLE `restaurantes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-26 13:04:17
