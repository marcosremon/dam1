-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: operadoras
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `login` varchar(20) DEFAULT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL,
  `nivel` int DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `marca` varchar(20) DEFAULT NULL,
  `compañia` varchar(20) DEFAULT NULL,
  `saldo` float DEFAULT NULL,
  `activo` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'BRE2271','BRENDA','M',2,'brenda@live.com','655-330-5736','SAMSUNG','IUSACELL',100,1),(2,'OSC4677','OSCAR','H',3,'oscar@gmail.com','655-143-4181','LG','TELCEL',0,1),(3,'JOS7086','JOSE','H',3,'francisco@gmail.com','655-143-3922','NOKIA','MOVISTAR',150,1),(4,'LUI6115','LUIS','H',0,'enrique@outlook.com','655-137-1279','SAMSUNG','TELCEL',50,1),(5,'LUI7072','LUIS','H',1,'luis@hotmail.com','655-100-8260','NOKIA','IUSACELL',50,0),(6,'DAN2832','DANIEL','H',0,'daniel@outlook.com','655-145-2586','SONY','UNEFON',100,1),(7,'JAQ5351','JAQUELINE','M',0,'jaqueline@outlook.com','655-330-5514','BLACKBERRY','AXEL',0,1),(8,'ROM6520','ROMAN','H',2,'roman@gmail.com','655-330-3263','LG','IUSACELL',50,1),(9,'BLA9739','BLAS','H',0,'blas@hotmail.com','655-330-3871','LG','UNEFON',100,1),(10,'JES4752','JESSICA','M',1,'jessica@hotmail.com','655-143-6861','SAMSUNG','TELCEL',500,1),(11,'DIA6570','DIANA','M',1,'diana@live.com','655-143-3952','SONY','UNEFON',100,0),(12,'RIC8283','RICARDO','H',2,'ricardo@hotmail.com','655-145-6049','MOTOROLA','IUSACELL',150,1),(13,'VAL6882','VALENTINA','M',0,'valentina@live.com','655-137-4253','BLACKBERRY','AT&T',50,0),(14,'BRE8106','BRENDA','M',3,'brenda2@gmail.com','655-100-1351','MOTOROLA','NEXTEL',150,1),(15,'LUC4982','LUCIA','M',3,'lucia@gmail.com','655-145-4992','BLACKBERRY','IUSACELL',0,1),(16,'JUA2337','JUAN','H',0,'juan@outlook.com','655-100-6517','SAMSUNG','AXEL',0,0),(17,'ELP2984','ELPIDIO','H',1,'elpidio@outlook.com','655-145-9938','MOTOROLA','MOVISTAR',500,1),(18,'JES9640','JESSICA','M',3,'jessica2@live.com','655-330-5143','SONY','IUSACELL',200,1),(19,'LET4015','LETICIA','M',2,'leticia@yahoo.com','655-143-4019','BLACKBERRY','UNEFON',100,1),(20,'LUI1076','LUIS','H',3,'luis2@live.com','655-100-5085','SONY','UNEFON',150,1),(21,'HUG5441','HUGO','H',2,'hugo@live.com','655-137-3935','MOTOROLA','AT&T',500,1);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-09  9:25:40
