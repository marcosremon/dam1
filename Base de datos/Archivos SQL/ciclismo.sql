-- MySQL dump 10.13  Distrib 8.1.0, for Win64 (x86_64)
--
-- Host: localhost    Database: ciclismo2
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
-- Table structure for table `ciclista`
--

DROP TABLE IF EXISTS `ciclista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ciclista` (
  `dorsal` int DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `edad` int DEFAULT NULL,
  `nomeq` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciclista`
--

LOCK TABLES `ciclista` WRITE;
/*!40000 ALTER TABLE `ciclista` DISABLE KEYS */;
INSERT INTO `ciclista` VALUES (1,'Miguel Indurain',21,'Banesto'),(2,'Pedro Delgado',29,'Banesto'),(3,'Alex Zulle',20,'Navigare'),(4,'Alessio Di Basco',30,'TVM'),(5,'Armand',17,'Amore Vita'),(8,'Jean Van Poppel',24,'Bresciali-Refin'),(9,'Maximo Podel',17,'Telecom'),(10,'Mario Cipollini',31,'Carrera'),(11,'Eddy Seigneur',20,'Amore Vita'),(12,'Alessio Di Basco',34,'Bresciali-Refin'),(13,'Gianni Bugno',24,'Gatorade'),(15,'Jesús Montoya',25,'Amore Vita'),(16,'Dimitri Konishev',27,'Amore Vita'),(17,'Bruno Lealli',30,'Amore Vita'),(20,'Alfonso Gutiérrez',27,'Navigare'),(22,'Giorgio Furlan',22,'Kelme'),(26,'Mikel Zarrabeitia',30,'Carrera'),(27,'Laurent Jalabert',22,'Banesto'),(30,'Melchor Mauri',26,'Mapei-Clas'),(31,'Per Pedersen',33,'Banesto'),(32,'Tony Rominger',31,'Kelme'),(33,'Stefenao della Sveitia',26,'Amore Vita'),(34,'Clauido Chiapucci',23,'Amore Vita'),(35,'Gian Mateo Faluca',34,'TVM');
/*!40000 ALTER TABLE `ciclista` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipo`
--

DROP TABLE IF EXISTS `equipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipo` (
  `nomeq` varchar(20) DEFAULT NULL,
  `director` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipo`
--

LOCK TABLES `equipo` WRITE;
/*!40000 ALTER TABLE `equipo` DISABLE KEYS */;
INSERT INTO `equipo` VALUES ('Amore Vita','Ricardo Padacci'),('Banesto','Miguel Echevarría'),('Bresciali-Refin','Pietro Armani'),('Carrera','Luigi Petroni'),('Gatorade','Gian Luca Pacceli'),('Kelme','Álvaro Pino'),('Mapei-Clas','Juan Fernández'),('Navigare','Lorenzo Sciacci'),('Telecom','Morgan Reikacrd'),('TVM','Steevens Henk');
/*!40000 ALTER TABLE `equipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etapa`
--

DROP TABLE IF EXISTS `etapa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `etapa` (
  `netapa` int DEFAULT NULL,
  `km` int DEFAULT NULL,
  `salida` varchar(20) DEFAULT NULL,
  `llegada` varchar(20) DEFAULT NULL,
  `dorsal` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etapa`
--

LOCK TABLES `etapa` WRITE;
/*!40000 ALTER TABLE `etapa` DISABLE KEYS */;
INSERT INTO `etapa` VALUES (1,35,'Valladolid','Ávila',1),(2,70,'Salamanca','Zamora',2),(3,150,'Zamora','Almendralejo',1),(4,330,'Córdoba','Granada',1),(5,150,'Granada','Almería',3);
/*!40000 ALTER TABLE `etapa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `llevar`
--

DROP TABLE IF EXISTS `llevar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `llevar` (
  `dorsal` int DEFAULT NULL,
  `netapa` int DEFAULT NULL,
  `codigo` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `llevar`
--

LOCK TABLES `llevar` WRITE;
/*!40000 ALTER TABLE `llevar` DISABLE KEYS */;
INSERT INTO `llevar` VALUES (1,3,'MGE'),(1,4,'MGE'),(2,2,'MGE'),(3,1,'MGE'),(3,1,'MMV'),(3,4,'MRE'),(4,1,'MMO');
/*!40000 ALTER TABLE `llevar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maillot`
--

DROP TABLE IF EXISTS `maillot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `maillot` (
  `codigo` varchar(3) DEFAULT NULL,
  `tipo` varchar(20) DEFAULT NULL,
  `color` varchar(20) DEFAULT NULL,
  `premio` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maillot`
--

LOCK TABLES `maillot` WRITE;
/*!40000 ALTER TABLE `maillot` DISABLE KEYS */;
INSERT INTO `maillot` VALUES ('MGE','General','Amarillo',1000000),('MMO','Montaña','Blanco y rojo',500000),('MMS','Más sufrido','Estrellitas rojas',400000),('MMV','Metas volantes','Rojo',400000),('MRE','Regularidad','Verde',300000),('MSE','Sprint especial','Rosa',300000);
/*!40000 ALTER TABLE `maillot` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `puerto`
--

DROP TABLE IF EXISTS `puerto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `puerto` (
  `nompuerto` varchar(20) DEFAULT NULL,
  `altura` int DEFAULT NULL,
  `categoria` varchar(1) DEFAULT NULL,
  `pendiente` int DEFAULT NULL,
  `netapa` int DEFAULT NULL,
  `dorsal` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `puerto`
--

LOCK TABLES `puerto` WRITE;
/*!40000 ALTER TABLE `puerto` DISABLE KEYS */;
INSERT INTO `puerto` VALUES ('p1',2489,'1',34,2,3),('p2',2789,'1',44,4,3),('Puerto F',2500,'E',17,4,2),('Puerto fff',2500,'E',17,4,2),('Puerto nuevo1',2500,'a',17,4,1),('Puerto otro',2500,'E',17,4,1),('Puerto1',2500,'E',23,1,2);
/*!40000 ALTER TABLE `puerto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-15 18:30:59
