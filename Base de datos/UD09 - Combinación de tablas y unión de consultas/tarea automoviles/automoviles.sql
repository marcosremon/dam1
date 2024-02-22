-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: automoviles
-- ------------------------------------------------------
-- Server version	8.1.0

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
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `DNI` char(9) NOT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  `apellido` varchar(15) DEFAULT NULL,
  `ciudad` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`DNI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES ('1','Luis','García','Madrid'),('2','Antonio','López','Valencia'),('3','Juan','Martín','Madrid'),('4','María','García','Madrid'),('5','Javier','González','Barcelona'),('6','Ana','López','Barcelona');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coches`
--

DROP TABLE IF EXISTS `coches`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `coches` (
  `codcoche` int NOT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  `modelo` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`codcoche`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coches`
--

LOCK TABLES `coches` WRITE;
/*!40000 ALTER TABLE `coches` DISABLE KEYS */;
INSERT INTO `coches` VALUES (1,'ibiza','glx'),(2,'ibiza','gti'),(3,'ibiza','gtd'),(4,'toledo','gtd'),(5,'cordoba','gti'),(6,'megane','1.6'),(7,'megane','gti'),(8,'laguna','gtd'),(9,'laguna','td'),(10,'zx','16v'),(11,'zx','td'),(12,'xantia','gtd'),(13,'a4','1.8'),(14,'a4','2.8'),(15,'astra','caravan'),(16,'astra','gti'),(17,'corsa','1.4'),(18,'300','316i'),(19,'500','525i'),(20,'700','750i');
/*!40000 ALTER TABLE `coches` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `concesionarios`
--

DROP TABLE IF EXISTS `concesionarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `concesionarios` (
  `cifc` int NOT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  `ciudad` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`cifc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `concesionarios`
--

LOCK TABLES `concesionarios` WRITE;
/*!40000 ALTER TABLE `concesionarios` DISABLE KEYS */;
INSERT INTO `concesionarios` VALUES (1,'acar','Madrid'),(2,'bcar','Madrid'),(3,'ccar','Barcelona'),(4,'dcar','Valencia'),(5,'ecar','Bilbao');
/*!40000 ALTER TABLE `concesionarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `distribucion`
--

DROP TABLE IF EXISTS `distribucion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `distribucion` (
  `cifc` int NOT NULL,
  `codcoche` int NOT NULL,
  `cantidad` int DEFAULT NULL,
  PRIMARY KEY (`cifc`,`codcoche`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `distribucion`
--

LOCK TABLES `distribucion` WRITE;
/*!40000 ALTER TABLE `distribucion` DISABLE KEYS */;
INSERT INTO `distribucion` VALUES (1,1,3),(1,5,7),(1,6,7),(2,6,5),(2,8,10),(2,9,10),(3,10,5),(3,11,3),(3,12,5),(4,13,10),(4,14,5),(5,15,10),(5,16,20),(5,17,8);
/*!40000 ALTER TABLE `distribucion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marcas`
--

DROP TABLE IF EXISTS `marcas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marcas` (
  `cifm` char(9) NOT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  `ciudad` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`cifm`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marcas`
--

LOCK TABLES `marcas` WRITE;
/*!40000 ALTER TABLE `marcas` DISABLE KEYS */;
INSERT INTO `marcas` VALUES ('1','Seat','Madrid'),('2','Renault','Barcelona'),('3','Citroen','Valencia'),('4','Audi','Madrid'),('5','Opel','Bilbao'),('6','BMW','Barcelona');
/*!40000 ALTER TABLE `marcas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marco`
--

DROP TABLE IF EXISTS `marco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marco` (
  `cifm` int NOT NULL,
  `codcoche` int NOT NULL,
  PRIMARY KEY (`cifm`,`codcoche`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marco`
--

LOCK TABLES `marco` WRITE;
/*!40000 ALTER TABLE `marco` DISABLE KEYS */;
INSERT INTO `marco` VALUES (1,1),(1,2),(1,3),(1,4),(1,5),(2,6),(2,7),(2,8),(2,9),(3,10),(3,11),(3,12),(4,13),(4,14),(5,15),(5,16),(5,17),(6,18),(6,19),(6,20);
/*!40000 ALTER TABLE `marco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventas` (
  `cifc` int NOT NULL,
  `DNI` char(9) NOT NULL,
  `codcoche` int NOT NULL,
  `color` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cifc`,`DNI`,`codcoche`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (1,'1',1,'blanco'),(1,'2',5,'rojo'),(2,'1',6,'rojo'),(2,'3',8,'blanco'),(3,'4',11,'rojo'),(4,'5',14,'verde');
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-13 17:56:11
