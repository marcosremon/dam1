-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: universidad
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
-- Table structure for table `asignaturas`
--

DROP TABLE IF EXISTS `asignaturas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asignaturas` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `creditos` float unsigned NOT NULL,
  `tipo` enum('básica','obligatoria','optativa') NOT NULL,
  `curso` tinyint unsigned NOT NULL,
  `cuatrimestre` tinyint unsigned NOT NULL,
  `id_profesor` int unsigned DEFAULT NULL,
  `id_grado` int unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_profesor` (`id_profesor`),
  KEY `id_grado` (`id_grado`),
  CONSTRAINT `asignaturas_ibfk_1` FOREIGN KEY (`id_profesor`) REFERENCES `profesores` (`id_profesor`),
  CONSTRAINT `asignaturas_ibfk_2` FOREIGN KEY (`id_grado`) REFERENCES `grados` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=84 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignaturas`
--

LOCK TABLES `asignaturas` WRITE;
/*!40000 ALTER TABLE `asignaturas` DISABLE KEYS */;
INSERT INTO `asignaturas` VALUES (1,'Álgegra lineal y matemática discreta',6,'básica',1,1,3,4),(2,'Cálculo',6,'básica',1,1,14,4),(3,'Física para informática',6,'básica',1,1,3,4),(4,'Introducción a la programación',6,'básica',1,1,14,4),(5,'Organización y gestión de empresas',6,'básica',1,1,3,4),(6,'Estadística',6,'básica',1,2,14,4),(7,'Estructura y tecnología de computadores',6,'básica',1,2,3,4),(8,'Fundamentos de electrónica',6,'básica',1,2,14,4),(9,'Lógica y algorítmica',6,'básica',1,2,3,4),(10,'Metodología de la programación',6,'básica',1,2,14,4),(11,'Arquitectura de Computadores',6,'básica',2,1,3,4),(12,'Estructura de Datos y Algoritmos I',6,'obligatoria',2,1,3,4),(13,'Ingeniería del Software',6,'obligatoria',2,1,14,4),(14,'Sistemas Inteligentes',6,'obligatoria',2,1,3,4),(15,'Sistemas Operativos',6,'obligatoria',2,1,14,4),(16,'Bases de Datos',6,'básica',2,2,14,4),(17,'Estructura de Datos y Algoritmos II',6,'obligatoria',2,2,14,4),(18,'Fundamentos de Redes de Computadores',6,'obligatoria',2,2,3,4),(19,'Planificación y Gestión de Proyectos Informáticos',6,'obligatoria',2,2,3,4),(20,'Programación de Servicios Software',6,'obligatoria',2,2,14,4),(21,'Desarrollo de interfaces de usuario',6,'obligatoria',3,1,14,4),(22,'Ingeniería de Requisitos',6,'optativa',3,1,NULL,4),(23,'Integración de las Tecnologías de la Información en las Organizaciones',6,'optativa',3,1,NULL,4),(24,'Modelado y Diseño del Software 1',6,'optativa',3,1,NULL,4),(25,'Multiprocesadores',6,'optativa',3,1,NULL,4),(26,'Seguridad y cumplimiento normativo',6,'optativa',3,1,NULL,4),(27,'Sistema de Información para las Organizaciones',6,'optativa',3,1,NULL,4),(28,'Tecnologías web',6,'optativa',3,1,NULL,4),(29,'Teoría de códigos y criptografía',6,'optativa',3,1,NULL,4),(30,'Administración de bases de datos',6,'optativa',3,2,NULL,4),(31,'Herramientas y Métodos de Ingeniería del Software',6,'optativa',3,2,NULL,4),(32,'Informática industrial y robótica',6,'optativa',3,2,NULL,4),(33,'Ingeniería de Sistemas de Información',6,'optativa',3,2,NULL,4),(34,'Modelado y Diseño del Software 2',6,'optativa',3,2,NULL,4),(35,'Negocio Electrónico',6,'optativa',3,2,NULL,4),(36,'Periféricos e interfaces',6,'optativa',3,2,NULL,4),(37,'Sistemas de tiempo real',6,'optativa',3,2,NULL,4),(38,'Tecnologías de acceso a red',6,'optativa',3,2,NULL,4),(39,'Tratamiento digital de imágenes',6,'optativa',3,2,NULL,4),(40,'Administración de redes y sistemas operativos',6,'optativa',4,1,NULL,4),(41,'Almacenes de Datos',6,'optativa',4,1,NULL,4),(42,'Fiabilidad y Gestión de Riesgos',6,'optativa',4,1,NULL,4),(43,'Líneas de Productos Software',6,'optativa',4,1,NULL,4),(44,'Procesos de Ingeniería del Software 1',6,'optativa',4,1,NULL,4),(45,'Tecnologías multimedia',6,'optativa',4,1,NULL,4),(46,'Análisis y planificación de las TI',6,'optativa',4,2,NULL,4),(47,'Desarrollo Rápido de Aplicaciones',6,'optativa',4,2,NULL,4),(48,'Gestión de la Calidad y de la Innovación Tecnológica',6,'optativa',4,2,NULL,4),(49,'Inteligencia del Negocio',6,'optativa',4,2,NULL,4),(50,'Procesos de Ingeniería del Software 2',6,'optativa',4,2,NULL,4),(51,'Seguridad Informática',6,'optativa',4,2,NULL,4),(52,'Biologia celular',6,'básica',1,1,NULL,7),(53,'Física',6,'básica',1,1,NULL,7),(54,'Matemáticas I',6,'básica',1,1,NULL,7),(55,'Química general',6,'básica',1,1,NULL,7),(56,'Química orgánica',6,'básica',1,1,NULL,7),(57,'Biología vegetal y animal',6,'básica',1,2,NULL,7),(58,'Bioquímica',6,'básica',1,2,NULL,7),(59,'Genética',6,'básica',1,2,NULL,7),(60,'Matemáticas II',6,'básica',1,2,NULL,7),(61,'Microbiología',6,'básica',1,2,NULL,7),(62,'Botánica agrícola',6,'obligatoria',2,1,NULL,7),(63,'Fisiología vegetal',6,'obligatoria',2,1,NULL,7),(64,'Genética molecular',6,'obligatoria',2,1,NULL,7),(65,'Ingeniería bioquímica',6,'obligatoria',2,1,NULL,7),(66,'Termodinámica y cinética química aplicada',6,'obligatoria',2,1,NULL,7),(67,'Biorreactores',6,'obligatoria',2,2,NULL,7),(68,'Biotecnología microbiana',6,'obligatoria',2,2,NULL,7),(69,'Ingeniería genética',6,'obligatoria',2,2,NULL,7),(70,'Inmunología',6,'obligatoria',2,2,NULL,7),(71,'Virología',6,'obligatoria',2,2,NULL,7),(72,'Bases moleculares del desarrollo vegetal',4.5,'obligatoria',3,1,NULL,7),(73,'Fisiología animal',4.5,'obligatoria',3,1,NULL,7),(74,'Metabolismo y biosíntesis de biomoléculas',6,'obligatoria',3,1,NULL,7),(75,'Operaciones de separación',6,'obligatoria',3,1,NULL,7),(76,'Patología molecular de plantas',4.5,'obligatoria',3,1,NULL,7),(77,'Técnicas instrumentales básicas',4.5,'obligatoria',3,1,NULL,7),(78,'Bioinformática',4.5,'obligatoria',3,2,NULL,7),(79,'Biotecnología de los productos hortofrutículas',4.5,'obligatoria',3,2,NULL,7),(80,'Biotecnología vegetal',6,'obligatoria',3,2,NULL,7),(81,'Genómica y proteómica',4.5,'obligatoria',3,2,NULL,7),(82,'Procesos biotecnológicos',6,'obligatoria',3,2,NULL,7),(83,'Técnicas instrumentales avanzadas',4.5,'obligatoria',3,2,NULL,7);
/*!40000 ALTER TABLE `asignaturas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curso_escolar`
--

DROP TABLE IF EXISTS `curso_escolar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso_escolar` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `anyo_inicio` year NOT NULL,
  `anyo_fin` year NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso_escolar`
--

LOCK TABLES `curso_escolar` WRITE;
/*!40000 ALTER TABLE `curso_escolar` DISABLE KEYS */;
INSERT INTO `curso_escolar` VALUES (1,2014,2015),(2,2015,2016),(3,2016,2017),(4,2017,2018),(5,2018,2019);
/*!40000 ALTER TABLE `curso_escolar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamentos`
--

DROP TABLE IF EXISTS `departamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departamentos` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamentos`
--

LOCK TABLES `departamentos` WRITE;
/*!40000 ALTER TABLE `departamentos` DISABLE KEYS */;
INSERT INTO `departamentos` VALUES (1,'Informática'),(2,'Matemáticas'),(3,'Economía y Empresa'),(4,'Educación'),(5,'Agronomía'),(6,'Química y Física'),(7,'Filología'),(8,'Derecho'),(9,'Biología y Geología');
/*!40000 ALTER TABLE `departamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grados`
--

DROP TABLE IF EXISTS `grados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grados` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grados`
--

LOCK TABLES `grados` WRITE;
/*!40000 ALTER TABLE `grados` DISABLE KEYS */;
INSERT INTO `grados` VALUES (1,'grado en Ingeniería Agrícola (Plan 2015)'),(2,'grado en Ingeniería Eléctrica (Plan 2014)'),(3,'grado en Ingeniería Electrónica Industrial (Plan 2010)'),(4,'grado en Ingeniería Informática (Plan 2015)'),(5,'grado en Ingeniería Mecánica (Plan 2010)'),(6,'grado en Ingeniería Química Industrial (Plan 2010)'),(7,'grado en Biotecnología (Plan 2015)'),(8,'grado en Ciencias Ambientales (Plan 2009)'),(9,'grado en Matemáticas (Plan 2010)'),(10,'grado en Química (Plan 2009)');
/*!40000 ALTER TABLE `grados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `matriculas`
--

DROP TABLE IF EXISTS `matriculas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `matriculas` (
  `id_alumno` int unsigned NOT NULL,
  `id_asignatura` int unsigned NOT NULL,
  `id_curso_escolar` int unsigned NOT NULL,
  `nota` int unsigned NOT NULL,
  PRIMARY KEY (`id_alumno`,`id_asignatura`,`id_curso_escolar`),
  KEY `id_asignatura` (`id_asignatura`),
  KEY `id_curso_escolar` (`id_curso_escolar`),
  CONSTRAINT `matriculas_ibfk_1` FOREIGN KEY (`id_alumno`) REFERENCES `personas` (`id`),
  CONSTRAINT `matriculas_ibfk_2` FOREIGN KEY (`id_asignatura`) REFERENCES `asignaturas` (`id`),
  CONSTRAINT `matriculas_ibfk_3` FOREIGN KEY (`id_curso_escolar`) REFERENCES `curso_escolar` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matriculas`
--

LOCK TABLES `matriculas` WRITE;
/*!40000 ALTER TABLE `matriculas` DISABLE KEYS */;
INSERT INTO `matriculas` VALUES (1,1,1,10),(1,2,1,8),(1,3,1,5),(2,1,1,7),(2,2,1,8),(2,3,1,9),(4,1,1,3),(4,2,1,5),(4,3,1,7),(19,1,5,8),(19,2,5,7),(19,3,5,9),(19,4,5,5),(19,5,5,6),(19,6,5,8),(19,7,5,7),(19,8,5,4),(19,9,5,6),(19,10,5,5),(23,1,5,5),(23,2,5,3),(23,3,5,2),(23,4,5,8),(23,5,5,1),(23,6,5,10),(23,7,5,8),(23,8,5,9),(23,9,5,7),(23,10,5,5),(24,1,5,8),(24,2,5,6),(24,3,5,6),(24,4,5,10),(24,5,5,8),(24,6,5,7),(24,7,5,9),(24,8,5,6),(24,9,5,4),(24,10,5,2);
/*!40000 ALTER TABLE `matriculas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personas`
--

DROP TABLE IF EXISTS `personas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personas` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `nif` varchar(9) DEFAULT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellido1` varchar(50) NOT NULL,
  `apellido2` varchar(50) DEFAULT NULL,
  `ciudad` varchar(25) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` varchar(9) DEFAULT NULL,
  `fecha_nacimiento` date NOT NULL,
  `sexo` enum('H','M') NOT NULL,
  `tipo` enum('profesor','alumno') NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nif` (`nif`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personas`
--

LOCK TABLES `personas` WRITE;
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` VALUES (1,'26902806M','Salvador','Sánchez','Pérez','Almería','C/ Real del barrio alto','950254837','1991-03-28','H','alumno'),(2,'89542419S','Juan','Saez','Vega','Almería','C/ Mercurio','618253876','1992-08-08','H','alumno'),(3,'11105554G','Zoe','Ramirez','Gea','Almería','C/ Marte','618223876','1979-08-19','M','profesor'),(4,'17105885A','Pedro','Heller','Pagac','Almería','C/ Estrella fugaz',NULL,'2000-10-05','H','alumno'),(5,'38223286T','David','Schmidt','Fisher','Almería','C/ Venus','678516294','1978-01-19','H','profesor'),(6,'04233869Y','José','Koss','Bayer','Almería','C/ Júpiter','628349590','1998-01-28','H','alumno'),(7,'97258166K','Ismael','Strosin','Turcotte','Almería','C/ Neptuno',NULL,'1999-05-24','H','alumno'),(8,'79503962T','Cristina','Lemke','Rutherford','Almería','C/ Saturno','669162534','1977-08-21','M','profesor'),(9,'82842571K','Ramón','Herzog','Tremblay','Almería','C/ Urano','626351429','1996-11-21','H','alumno'),(10,'61142000L','Esther','Spencer','Lakin','Almería','C/ Plutón',NULL,'1977-05-19','M','profesor'),(11,'46900725E','Daniel','Herman','Pacocha','Almería','C/ Andarax','679837625','1997-04-26','H','alumno'),(12,'85366986W','Carmen','Streich','Hirthe','Almería','C/ Almanzora',NULL,'1971-04-29','M','profesor'),(13,'73571384L','Alfredo','Stiedemann','Morissette','Almería','C/ Guadalquivir','950896725','1980-02-01','H','profesor'),(14,'82937751G','Manolo','Hamill','Kozey','Almería','C/ Duero','950263514','1977-01-02','H','profesor'),(15,'80502866Z','Alejandro','Kohler','Schoen','Almería','C/ Tajo','668726354','1980-03-14','H','profesor'),(16,'10485008K','Antonio','Fahey','Considine','Almería','C/ Sierra de los Filabres',NULL,'1982-03-18','H','profesor'),(17,'85869555K','Guillermo','Ruecker','Upton','Almería','C/ Sierra de Gádor',NULL,'1973-05-05','H','profesor'),(18,'04326833G','Micaela','Monahan','Murray','Almería','C/ Veleta','662765413','1976-02-25','H','profesor'),(19,'11578526G','Inma','Lakin','Yundt','Almería','C/ Picos de Europa','678652431','1998-09-01','M','alumno'),(20,'79221403L','Francesca','Schowalter','Muller','Almería','C/ Quinto pino',NULL,'1980-10-31','H','profesor'),(21,'79089577Y','Juan','Gutiérrez','López','Almería','C/ Los pinos','678652431','1998-01-01','H','alumno'),(22,'41491230N','Antonio','Domínguez','Guerrero','Almería','C/ Cabo de Gata','626652498','1999-02-11','H','alumno'),(23,'64753215G','Irene','Hernández','Martínez','Almería','C/ Zapillo','628452384','1996-03-12','M','alumno'),(24,'85135690V','Sonia','Gea','Ruiz','Almería','C/ Mercurio','678812017','1995-04-13','M','alumno'),(25,'85135691V','Pepito','Gea','Ruiz','Almería','C/ Mercurio','678812017','1995-04-13','H','profesor'),(26,'85135692V','Juanito','Gea','Ruiz','Almería','C/ Mercurio','678812017','1995-04-13','H','profesor');
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesores`
--

DROP TABLE IF EXISTS `profesores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesores` (
  `id_profesor` int unsigned NOT NULL,
  `id_departamento` int unsigned NOT NULL,
  PRIMARY KEY (`id_profesor`),
  KEY `id_departamento` (`id_departamento`),
  CONSTRAINT `profesores_ibfk_1` FOREIGN KEY (`id_profesor`) REFERENCES `personas` (`id`),
  CONSTRAINT `profesores_ibfk_2` FOREIGN KEY (`id_departamento`) REFERENCES `departamentos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesores`
--

LOCK TABLES `profesores` WRITE;
/*!40000 ALTER TABLE `profesores` DISABLE KEYS */;
INSERT INTO `profesores` VALUES (3,1),(14,1),(5,2),(15,2),(8,3),(16,3),(10,4),(12,4),(17,4),(18,5),(13,6),(20,6);
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

-- Dump completed on 2024-02-28  8:28:49
