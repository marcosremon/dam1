-- MySQL dump 10.13  Distrib 8.1.0, for Win64 (x86_64)
--
-- Host: localhost    Database: ciclistmo
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
  `dorsal` int NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `edad` int DEFAULT NULL,
  `nomeq` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`dorsal`),
  KEY `FK_CICLISTA_ES_PARTE__EQUIPO` (`nomeq`),
  CONSTRAINT `FK_CICLISTA_ES_PARTE__EQUIPO` FOREIGN KEY (`nomeq`) REFERENCES `equipo` (`nomeq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciclista`
--

LOCK TABLES `ciclista` WRITE;
/*!40000 ALTER TABLE `ciclista` DISABLE KEYS */;
INSERT INTO `ciclista` VALUES (1,'Miguel Indurain',21,'Banesto'),(2,'Pedro Delgado',29,'Banesto'),(3,'Alex Zulle',20,'Navigare'),(4,'Alessio Di Basco',30,'TVM'),(5,'Armand',17,'Amore Vita'),(8,'Jean Van Poppel',24,'Bresciali-Refin'),(9,'Maximo Podel',17,'Telecom'),(10,'Mario Cipollini',31,'Carrera'),(11,'Eddy Seigneur',20,'Amore Vita'),(12,'Alessio Di Basco',34,'Bresciali-Refin'),(13,'Gianni Bugno',24,'Gatorade'),(15,'Jesús Montoya',25,'Amore Vita'),(16,'Dimitri Konishev',27,'Amore Vita'),(17,'Bruno Lealli',30,'Amore Vita'),(20,'Alfonso Gutiérrez',27,'Navigare'),(22,'Giorgio Furlan',22,'Kelme'),(26,'Mikel Zarrabeitia',30,'Carrera'),(27,'Laurent Jalabert',22,'Banesto'),(30,'Melchor Mauri',26,'Mapei-Clas'),(31,'Per Pedersen',33,'Banesto'),(32,'Tony Rominger',31,'Kelme'),(33,'Stefenao della Sveitia',26,'Amore Vita'),(34,'Clauido Chiapucci',23,'Amore Vita'),(35,'Gian Mateo Faluca',34,'TVM'),(87,'ciclista4',33,'amore vita'),(88,'ciclista3',32,'amore vita'),(89,'ciclista2',31,'amore vita'),(90,'ciclista1',30,'amore vita');
/*!40000 ALTER TABLE `ciclista` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `insertMensaje` AFTER INSERT ON `ciclista` FOR EACH ROW begin
declare numeroCiclistasEquipo int;
declare mensajeAnulacion varchar(255);

select count(*) into numeroCiclistasEquipo from ciclista where nomeq = "amore vita";

if numeroCiclistasEquipo = 10 then
insert into mensajes (mensaje) values ("en el equipo no se pueden inscribir mas ciclistas");
elseif numeroCiclistasEquipo < 10 then
insert into mensajes (mensaje) values ("en el equipo la inscripcion sigue abierta");
else 
insert into mensajes (mensaje) values ("Error, revisar las inscripciones del equipo");
end if;
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `equipo`
--

DROP TABLE IF EXISTS `equipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipo` (
  `nomeq` varchar(25) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`nomeq`)
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
  `netapa` int NOT NULL,
  `km` float DEFAULT NULL,
  `salida` varchar(45) DEFAULT NULL,
  `llegada` varchar(45) DEFAULT NULL,
  `dorsal` int DEFAULT NULL,
  PRIMARY KEY (`netapa`),
  KEY `FK_ETAPA_TIENE_CICLISTA` (`dorsal`),
  CONSTRAINT `FK_ETAPA_TIENE_CICLISTA` FOREIGN KEY (`dorsal`) REFERENCES `ciclista` (`dorsal`)
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
-- Table structure for table `gananciasciclistas`
--

DROP TABLE IF EXISTS `gananciasciclistas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gananciasciclistas` (
  `dorsal_ciclista` int NOT NULL,
  `nombre_ciclista` varchar(255) DEFAULT NULL,
  `equipo` varchar(255) DEFAULT NULL,
  `gananciasciclista` float DEFAULT NULL,
  PRIMARY KEY (`dorsal_ciclista`),
  CONSTRAINT `gananciasciclistas_ibfk_1` FOREIGN KEY (`dorsal_ciclista`) REFERENCES `ciclista` (`dorsal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gananciasciclistas`
--

LOCK TABLES `gananciasciclistas` WRITE;
/*!40000 ALTER TABLE `gananciasciclistas` DISABLE KEYS */;
INSERT INTO `gananciasciclistas` VALUES (1,'Miguel Indurain','Banesto',1200000),(2,'Pedro Delgado','Banesto',1800000),(3,'Alex Zulle','Navigare',2820000),(4,'Alessio Di Basco','TVM',3120000);
/*!40000 ALTER TABLE `gananciasciclistas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `llevar`
--

DROP TABLE IF EXISTS `llevar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `llevar` (
  `dorsal` int NOT NULL,
  `netapa` int NOT NULL,
  `codigo` varchar(25) NOT NULL,
  PRIMARY KEY (`dorsal`,`netapa`,`codigo`),
  KEY `FK_LLEVAR_POSEE_MAILLOT` (`codigo`),
  KEY `FK_LLEVAR_POSEEN_ETAPA` (`netapa`),
  CONSTRAINT `FK_LLEVAR_CUENTA_CO_CICLISTA` FOREIGN KEY (`dorsal`) REFERENCES `ciclista` (`dorsal`),
  CONSTRAINT `FK_LLEVAR_POSEE_MAILLOT` FOREIGN KEY (`codigo`) REFERENCES `maillot` (`codigo`),
  CONSTRAINT `FK_LLEVAR_POSEEN_ETAPA` FOREIGN KEY (`netapa`) REFERENCES `etapa` (`netapa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `llevar`
--

LOCK TABLES `llevar` WRITE;
/*!40000 ALTER TABLE `llevar` DISABLE KEYS */;
INSERT INTO `llevar` VALUES (3,1,'MGE'),(3,1,'MMV'),(4,1,'MMO'),(2,2,'MGE'),(1,3,'MGE'),(1,4,'MGE'),(3,4,'MRE');
/*!40000 ALTER TABLE `llevar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maillot`
--

DROP TABLE IF EXISTS `maillot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `maillot` (
  `codigo` varchar(25) NOT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `premio` float DEFAULT NULL,
  PRIMARY KEY (`codigo`)
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
-- Table structure for table `mensajes`
--

DROP TABLE IF EXISTS `mensajes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mensajes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `mensaje` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mensajes`
--

LOCK TABLES `mensajes` WRITE;
/*!40000 ALTER TABLE `mensajes` DISABLE KEYS */;
INSERT INTO `mensajes` VALUES (1,'en el equipo la inscripcion sigue abierta'),(2,'en el equipo la inscripcion sigue abierta'),(3,'en el equipo no se pueden inscribir mas ciclistas'),(4,'Error, revisar las inscripciones del equipo');
/*!40000 ALTER TABLE `mensajes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `puerto`
--

DROP TABLE IF EXISTS `puerto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `puerto` (
  `nompuerto` varchar(45) NOT NULL,
  `altura` float DEFAULT NULL,
  `categoria` varchar(45) DEFAULT NULL,
  `pendiente` float DEFAULT NULL,
  `netapa` int DEFAULT NULL,
  `dorsal` varchar(25) DEFAULT NULL,
  `dificultad` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`nompuerto`),
  KEY `FK_PUERTO_TIENEN_ETAPA` (`netapa`),
  CONSTRAINT `FK_PUERTO_TIENEN_ETAPA` FOREIGN KEY (`netapa`) REFERENCES `etapa` (`netapa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `puerto`
--

LOCK TABLES `puerto` WRITE;
/*!40000 ALTER TABLE `puerto` DISABLE KEYS */;
INSERT INTO `puerto` VALUES ('aja',2500,'1',10,NULL,NULL,'facil'),('ala',2500,'1',18,NULL,NULL,'facil'),('me rayo',2800,'1',20,NULL,NULL,NULL),('ole',2600,'1',18,NULL,NULL,'facil'),('oyee',2700,'1',20,NULL,NULL,NULL),('p1',2489,'1',34,2,'3','maxima'),('p2',2789,'1',44,4,'3','maxima'),('Puerto F',2500,'E',17,4,'2','facil'),('Puerto fff',2500,'E',17,4,'2','facil'),('Puerto nuevo1',2500,'a',17,4,'1','facil'),('Puerto otro',2500,'E',17,4,'1','facil'),('Puerto1',2500,'E',23,1,'2','media');
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

-- Dump completed on 2024-05-16 19:23:18
