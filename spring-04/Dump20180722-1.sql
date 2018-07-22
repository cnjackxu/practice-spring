CREATE DATABASE  IF NOT EXISTS `spring_db` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `spring_db`;
-- MySQL dump 10.13  Distrib 5.7.22, for Linux (x86_64)
--
-- Host: localhost    Database: spring_db
-- ------------------------------------------------------
-- Server version	5.7.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_game_online`
--

DROP TABLE IF EXISTS `tb_game_online`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_game_online` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_game_online`
--

LOCK TABLES `tb_game_online` WRITE;
/*!40000 ALTER TABLE `tb_game_online` DISABLE KEYS */;
INSERT INTO `tb_game_online` VALUES (1,'Lotto Max',1),(2,'Lotto 649',0);
/*!40000 ALTER TABLE `tb_game_online` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_ticket`
--

DROP TABLE IF EXISTS `tb_ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_ticket` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `t_num` varchar(45) NOT NULL,
  `t_create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `pid` int(11) NOT NULL,
  PRIMARY KEY (`tid`),
  KEY `fk_tb_ticket_1_idx` (`pid`),
  CONSTRAINT `fk_tb_ticket_1` FOREIGN KEY (`pid`) REFERENCES `tb_game_online` (`pid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_ticket`
--

LOCK TABLES `tb_ticket` WRITE;
/*!40000 ALTER TABLE `tb_ticket` DISABLE KEYS */;
INSERT INTO `tb_ticket` VALUES (1,'1001','2018-07-22 09:31:45',1),(2,'1002','2018-07-22 09:31:45',2);
/*!40000 ALTER TABLE `tb_ticket` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-22 18:33:02
