-- MySQL dump 10.13  Distrib 8.0.37, for Win64 (x86_64)
--
-- Host: localhost    Database: academia
-- ------------------------------------------------------
-- Server version	8.0.37

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
-- Table structure for table `alumnos`
--

DROP TABLE IF EXISTS `alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumnos` (
  `dni` varchar(4) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido1` varchar(30) DEFAULT NULL,
  `apellido2` varchar(30) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `sexo` varchar(2) DEFAULT NULL,
  `fechanac` date DEFAULT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnos`
--

LOCK TABLES `alumnos` WRITE;
/*!40000 ALTER TABLE `alumnos` DISABLE KEYS */;
INSERT INTO `alumnos` VALUES ('1111','Carlos','Puerta','Perez','c/ Pí, 21','V','2000-11-05'),('2222','Luisa','Sanchez','Donoso','c/ Sierpes, 1','M','1998-12-05'),('3333','Eva','Ramos','Prieto','c/ Rueda, 31','M','1999-04-12'),('4444','Luis','Paez','Garcia','c/ Martin Villa, 21','V','1999-03-04'),('5555','Ana','Padilla','Torres','c/ Tetuan, 2','M','2002-05-19'),('6666','Lola','Flores','Ruiz','c/ Real, 14','M','1996-04-30');
/*!40000 ALTER TABLE `alumnos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curso_manual`
--

DROP TABLE IF EXISTS `curso_manual`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso_manual` (
  `codcurso` varchar(6) NOT NULL,
  `referencia` varchar(5) NOT NULL,
  PRIMARY KEY (`codcurso`,`referencia`),
  KEY `fk_refcursomanual` (`referencia`),
  CONSTRAINT `fk_codcursomanual` FOREIGN KEY (`codcurso`) REFERENCES `cursos` (`codigocurso`),
  CONSTRAINT `fk_refcursomanual` FOREIGN KEY (`referencia`) REFERENCES `manuales` (`referencia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso_manual`
--

LOCK TABLES `curso_manual` WRITE;
/*!40000 ALTER TABLE `curso_manual` DISABLE KEYS */;
INSERT INTO `curso_manual` VALUES ('0001','M001'),('0004','M001'),('0005','M001'),('0006','M002'),('0004','M003'),('0001','M004'),('0005','M004'),('0003','M005'),('0006','M006');
/*!40000 ALTER TABLE `curso_manual` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curso_oposicion`
--

DROP TABLE IF EXISTS `curso_oposicion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso_oposicion` (
  `codcurso` varchar(4) NOT NULL,
  `codoposicion` varchar(6) NOT NULL,
  PRIMARY KEY (`codcurso`,`codoposicion`),
  KEY `fk_codoposicion` (`codoposicion`),
  CONSTRAINT `fk_codcursoop` FOREIGN KEY (`codcurso`) REFERENCES `cursos` (`codigocurso`),
  CONSTRAINT `fk_codoposicion` FOREIGN KEY (`codoposicion`) REFERENCES `oposiciones` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso_oposicion`
--

LOCK TABLES `curso_oposicion` WRITE;
/*!40000 ALTER TABLE `curso_oposicion` DISABLE KEYS */;
INSERT INTO `curso_oposicion` VALUES ('0001','C-502'),('0002','C-502'),('0005','C-502'),('0001','C-512'),('0004','C-512'),('0005','C-512'),('0001','C-522'),('0005','C-522'),('0006','C-522'),('0001','C-532'),('0005','C-532'),('0001','C-542'),('0005','C-542'),('0001','C-552'),('0003','C-552');
/*!40000 ALTER TABLE `curso_oposicion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cursos`
--

DROP TABLE IF EXISTS `cursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cursos` (
  `codigocurso` varchar(5) NOT NULL,
  `nombrecurso` varchar(40) DEFAULT NULL,
  `maxalumnos` int DEFAULT NULL,
  `fechaini` date DEFAULT NULL,
  `fechafin` date DEFAULT NULL,
  `numhoras` int DEFAULT NULL,
  `profesor` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`codigocurso`),
  KEY `fk_dniprofesor` (`profesor`),
  CONSTRAINT `fk_dniprofesor` FOREIGN KEY (`profesor`) REFERENCES `profesores` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursos`
--

LOCK TABLES `cursos` WRITE;
/*!40000 ALTER TABLE `cursos` DISABLE KEYS */;
INSERT INTO `cursos` VALUES ('0001','Función Publica',120,'2021-09-01','2022-06-30',400,'444'),('0002','Los chiquillos',180,'2021-09-01','2022-06-30',600,'222'),('0003','Puentes Atirantados',20,'2020-09-11','2022-06-30',800,'111'),('0004','Vida familiar de los presos',120,'2020-09-11','2021-06-30',400,'222'),('0005','La Constitucion',230,'2022-09-01','2023-06-30',100,'444'),('0006','Programación',80,'2022-09-01','2023-06-30',30,'555');
/*!40000 ALTER TABLE `cursos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manuales`
--

DROP TABLE IF EXISTS `manuales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `manuales` (
  `referencia` varchar(5) NOT NULL,
  `titulo` varchar(50) DEFAULT NULL,
  `autor` varchar(30) DEFAULT NULL,
  `fechapub` date DEFAULT NULL,
  `precio` int DEFAULT NULL,
  PRIMARY KEY (`referencia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manuales`
--

LOCK TABLES `manuales` WRITE;
/*!40000 ALTER TABLE `manuales` DISABLE KEYS */;
INSERT INTO `manuales` VALUES ('M001','El Derecho','Garzón','2006-12-05',23),('M002','C y PHP: lo mismo es','Joseph Sunday','2000-10-03',12),('M003','Los delincuentes y sus sentimientos','El Chori','2012-08-15',16),('M004','Las Administraciones Publicas','Ruiz','2012-07-07',8),('M005','Estatica y Dinamica','Calatrava','2002-05-05',43),('M006','Problemas irresolubles en JSP','John Tagua','2007-07-07',25);
/*!40000 ALTER TABLE `manuales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `matriculas`
--

DROP TABLE IF EXISTS `matriculas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `matriculas` (
  `dnialumno` varchar(9) NOT NULL,
  `codcurso` varchar(5) NOT NULL,
  `pruebaA` int DEFAULT NULL,
  `pruebaB` int DEFAULT NULL,
  `tipo` varchar(10) DEFAULT NULL,
  `inscripcion` date DEFAULT NULL,
  PRIMARY KEY (`dnialumno`,`codcurso`),
  KEY `fk_codcurso` (`codcurso`),
  CONSTRAINT `fk_codcurso` FOREIGN KEY (`codcurso`) REFERENCES `cursos` (`codigocurso`),
  CONSTRAINT `fk_dnialumno` FOREIGN KEY (`dnialumno`) REFERENCES `alumnos` (`dni`),
  CONSTRAINT `pruebaA_ok` CHECK ((`pruebaA` between 0 and 50)),
  CONSTRAINT `pruebaB_ok` CHECK ((`pruebaB` between 0 and 50))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matriculas`
--

LOCK TABLES `matriculas` WRITE;
/*!40000 ALTER TABLE `matriculas` DISABLE KEYS */;
INSERT INTO `matriculas` VALUES ('1111','0001',12,8,'Oficial','2021-07-01'),('1111','0005',18,5,'Oficial','2022-06-30'),('2222','0003',25,28,'Libre','2020-09-01'),('2222','0005',32,28,'Libre','2020-03-14'),('3333','0006',12,NULL,'Oficial','2022-01-01'),('4444','0006',NULL,18,'Oficial','2022-03-17'),('5555','0001',11,38,'Oficial','2021-08-10'),('5555','0002',32,38,'Libre','2021-05-17'),('5555','0003',11,18,'Oficial','2020-07-07'),('5555','0005',42,48,'Oficial','2022-01-15'),('5555','0006',20,48,'Oficial','2021-12-06');
/*!40000 ALTER TABLE `matriculas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `oposiciones`
--

DROP TABLE IF EXISTS `oposiciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `oposiciones` (
  `codigo` varchar(6) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `fecexam` date DEFAULT NULL,
  `organismo` varchar(50) DEFAULT NULL,
  `plazas` int DEFAULT NULL,
  `categoria` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  CONSTRAINT `categoria_ok` CHECK (((_cp850'A' <= `categoria`) and (`categoria` <= _cp850'E')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oposiciones`
--

LOCK TABLES `oposiciones` WRITE;
/*!40000 ALTER TABLE `oposiciones` DISABLE KEYS */;
INSERT INTO `oposiciones` VALUES ('C-502','Maestros de Primaria','2023-05-27','Consejeria Educacion',1220,'B'),('C-512','Funcionario de Prisiones','2023-06-10','Consejeria Justicia',120,'C'),('C-522','Profesores de Informática','2027-06-09','Consejeria Educacion',12,'A'),('C-532','Jardineros del Estado','2025-05-10','Ministerio Medio Ambiente',10,'D'),('C-542','Administrativos','2022-09-10','Ayuntamiento DH',12,'C'),('C-552','Ingenieros del Ejercito','2023-09-10','Ministerio Defensa',120,'A');
/*!40000 ALTER TABLE `oposiciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesores`
--

DROP TABLE IF EXISTS `profesores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesores` (
  `dni` varchar(4) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellido1` varchar(20) DEFAULT NULL,
  `apellido2` varchar(20) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `titulo` varchar(30) DEFAULT NULL,
  `sueldo` int DEFAULT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesores`
--

LOCK TABLES `profesores` WRITE;
/*!40000 ALTER TABLE `profesores` DISABLE KEYS */;
INSERT INTO `profesores` VALUES ('111','Manuel','Lopez','Garcia','c/ Albeniz,12','Ingeniero de Caminos',2000),('222','Luis','Perez','Sanchez','c/ Huelva, 1','Licenciado en Psicologia',1400),('333','Ana','Garcia','Lopez','c/ Sevilla,2','Ingeniero de Caminos',2200),('444','Eva','Parra','Ruiz','c/ Astoria,7','Licenciado en Derecho',1200),('555','Federico','Flores','Alba','c/ Tarifa, 1','Ingeniero Informatico',2500),('666','Alberto','Moreno','Rodriguez','c/ Parra, 2','Ingeniero de Caminos',2100);
/*!40000 ALTER TABLE `profesores` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-29 19:47:48
