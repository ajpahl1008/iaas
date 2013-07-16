-- MySQL dump 10.13  Distrib 5.5.9, for Win32 (x86)
--
-- Host: 192.168.1.14    Database: iaas
-- ------------------------------------------------------
-- Server version	5.1.52

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
-- Current Database: `iaas`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `iaas` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `iaas`;

--
-- Table structure for table `applications`
--

DROP TABLE IF EXISTS `applications`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `applications` (
  `id` int(11) NOT NULL,
  `application_name` varchar(45) NOT NULL,
  `installation_command` mediumtext NOT NULL,
  `software_location` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `applications`
--

LOCK TABLES `applications` WRITE;
/*!40000 ALTER TABLE `applications` DISABLE KEYS */;
/*!40000 ALTER TABLE `applications` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categories` (
  `id` int(11) NOT NULL,
  `category` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (0,'X_SMALL'),(1,'SMALL'),(2,'MEDIUM'),(3,'LARGE'),(4,'X_LARGE');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `directives`
--

DROP TABLE IF EXISTS `directives`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `directives` (
  `id` int(11) NOT NULL,
  `directive` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `directives`
--

LOCK TABLES `directives` WRITE;
/*!40000 ALTER TABLE `directives` DISABLE KEYS */;
/*!40000 ALTER TABLE `directives` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `overview_j04`
--

DROP TABLE IF EXISTS `overview_j04`;
/*!50001 DROP VIEW IF EXISTS `overview_j04`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `overview_j04` (
  `id` int(11),
  `server_name` varchar(45),
  `start_date` varchar(11),
  `expiration_date` varchar(11),
  `status` varchar(45),
  `category` varchar(45),
  `first_name` varchar(45),
  `last_name` varchar(45),
  `phone_number` varchar(12),
  `login` varchar(45),
  `parent_name` varchar(45)
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `properties`
--

DROP TABLE IF EXISTS `properties`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `properties` (
  `id` int(11) NOT NULL,
  `parameter` varchar(45) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `properties`
--

LOCK TABLES `properties` WRITE;
/*!40000 ALTER TABLE `properties` DISABLE KEYS */;
INSERT INTO `properties` VALUES (0,'parameter0','value0'),(1,'parameter1','value1');
/*!40000 ALTER TABLE `properties` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `request_queue`
--

DROP TABLE IF EXISTS `request_queue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `request_queue` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `category_id` int(11) NOT NULL,
  `application_id` int(11) NOT NULL,
  `directive_id` int(11) NOT NULL,
  `completed` varchar(1) NOT NULL,
  `timestamp` varchar(32) NOT NULL,
  `server_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `request_queue`
--

LOCK TABLES `request_queue` WRITE;
/*!40000 ALTER TABLE `request_queue` DISABLE KEYS */;
/*!40000 ALTER TABLE `request_queue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `server_parent_map`
--

DROP TABLE IF EXISTS `server_parent_map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `server_parent_map` (
  `id` int(11) NOT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `parent_name` varchar(45) DEFAULT NULL,
  `child_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `SERVER_PARENT_FK` (`child_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `server_parent_map`
--

LOCK TABLES `server_parent_map` WRITE;
/*!40000 ALTER TABLE `server_parent_map` DISABLE KEYS */;
INSERT INTO `server_parent_map` VALUES (0,0,'frame001',14),(2,0,'frame001',15),(3,0,'frame001',23),(4,0,'frame001',27),(5,0,'frame001',45),(7,0,'frame001',23),(8,0,'frame001',27),(9,0,'frame001',45),(10,1,'frame002',46),(11,1,'frame002',47),(12,1,'frame002',50),(13,1,'frame002',51);
/*!40000 ALTER TABLE `server_parent_map` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servers`
--

DROP TABLE IF EXISTS `servers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `server_name` varchar(45) DEFAULT NULL,
  `start_date` varchar(11) DEFAULT NULL,
  `expiration_date` varchar(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `software` varchar(255) DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`user_id`),
  KEY `user_fk` (`user_id`),
  KEY `category_fk` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servers`
--

LOCK TABLES `servers` WRITE;
/*!40000 ALTER TABLE `servers` DISABLE KEYS */;
INSERT INTO `servers` VALUES (6,'maddog1001','','',0,2,'',0),(14,'maddog1021','','',0,3,'',0),(15,'maddog1099','','',0,3,'',0),(23,'maddog1002','','',0,4,'',2),(27,'maddog1214','','',0,3,'',2),(45,'maddog1012','','',0,4,'',5),(46,'maddog1011','','',0,4,'',2),(47,'maddog1200','','',0,4,'',5),(50,'maddog1009','','',0,3,'',2),(51,'maddog5555','','',0,3,'',1);
/*!40000 ALTER TABLE `servers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `statistics`
--

DROP TABLE IF EXISTS `statistics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `statistics` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `server_id` int(11) DEFAULT NULL,
  `server_uptime` varchar(11) DEFAULT NULL,
  `server_context_switching` varchar(45) DEFAULT NULL,
  `server_load` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `filesystems` (`id`),
  KEY `filesystems_fk` (`id`),
  KEY `server_fk` (`server_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `statistics`
--

LOCK TABLES `statistics` WRITE;
/*!40000 ALTER TABLE `statistics` DISABLE KEYS */;
INSERT INTO `statistics` VALUES (4,6,'00:00:00','0','0'),(5,5,'350:00:00','4321','23'),(7,8,'123:21:11','12','5000');
/*!40000 ALTER TABLE `statistics` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `stats_j03`
--

DROP TABLE IF EXISTS `stats_j03`;
/*!50001 DROP VIEW IF EXISTS `stats_j03`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `stats_j03` (
  `server_name` varchar(45),
  `server_uptime` varchar(11),
  `server_context_switching` varchar(45),
  `server_load` varchar(45)
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `status`
--

DROP TABLE IF EXISTS `status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `status` (
  `id` int(11) NOT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status`
--

LOCK TABLES `status` WRITE;
/*!40000 ALTER TABLE `status` DISABLE KEYS */;
INSERT INTO `status` VALUES (0,'ONLINE'),(1,'OFFLINE'),(2,'BUILD'),(3,'PROVISION'),(4,'DEPLOY'),(5,'ARCHIVING');
/*!40000 ALTER TABLE `status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storage`
--

DROP TABLE IF EXISTS `storage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `storage_entity` varchar(45) DEFAULT NULL,
  `storage_size` varchar(45) DEFAULT NULL,
  `percent_free` varchar(45) DEFAULT NULL,
  `server_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `server_fk` (`server_id`),
  KEY `filesystem_server_fk` (`server_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storage`
--

LOCK TABLES `storage` WRITE;
/*!40000 ALTER TABLE `storage` DISABLE KEYS */;
INSERT INTO `storage` VALUES (3,'/test1','1000','50',5),(4,'/test1','1000','75',6),(5,'/test2','1000','4',6),(6,'/test23','9000','24',5);
/*!40000 ALTER TABLE `storage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `storage_j02`
--

DROP TABLE IF EXISTS `storage_j02`;
/*!50001 DROP VIEW IF EXISTS `storage_j02`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `storage_j02` (
  `server_name` varchar(45),
  `storage_entity` varchar(45),
  `storage_size` varchar(45),
  `percent_free` varchar(45)
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `phone_number` varchar(12) NOT NULL,
  `login` varchar(45) NOT NULL,
  `ssh_public` longblob,
  `ssh_private` longblob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (0,'SYSTEM','SYSTEM','000-000-0000','SYSTEM',NULL,NULL),(19,'Anthony','Pahl','555-1212','j004063',NULL,NULL),(20,'George','Waton','555-1212','g123456',NULL,NULL);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Current Database: `iaas`
--

USE `iaas`;

--
-- Final view structure for view `overview_j04`
--

/*!50001 DROP TABLE IF EXISTS `overview_j04`*/;
/*!50001 DROP VIEW IF EXISTS `overview_j04`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `overview_j04` AS select `servers`.`id` AS `id`,`servers`.`server_name` AS `server_name`,`servers`.`start_date` AS `start_date`,`servers`.`expiration_date` AS `expiration_date`,`status`.`status` AS `status`,`categories`.`category` AS `category`,`users`.`first_name` AS `first_name`,`users`.`last_name` AS `last_name`,`users`.`phone_number` AS `phone_number`,`users`.`login` AS `login`,`server_parent_map`.`parent_name` AS `parent_name` from ((((`servers` join `users` on((`servers`.`user_id` = `users`.`id`))) join `categories` on((`servers`.`category_id` = `categories`.`id`))) join `status` on((`servers`.`status_id` = `status`.`id`))) join `server_parent_map` on((`servers`.`id` = `server_parent_map`.`child_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `stats_j03`
--

/*!50001 DROP TABLE IF EXISTS `stats_j03`*/;
/*!50001 DROP VIEW IF EXISTS `stats_j03`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `stats_j03` AS select `servers`.`server_name` AS `server_name`,`statistics`.`server_uptime` AS `server_uptime`,`statistics`.`server_context_switching` AS `server_context_switching`,`statistics`.`server_load` AS `server_load` from (`servers` join `statistics` on((`servers`.`id` = `statistics`.`server_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `storage_j02`
--

/*!50001 DROP TABLE IF EXISTS `storage_j02`*/;
/*!50001 DROP VIEW IF EXISTS `storage_j02`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `storage_j02` AS select `servers`.`server_name` AS `server_name`,`storage`.`storage_entity` AS `storage_entity`,`storage`.`storage_size` AS `storage_size`,`storage`.`percent_free` AS `percent_free` from (`servers` join `storage` on((`servers`.`id` = `storage`.`server_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2012-06-29 22:37:39
