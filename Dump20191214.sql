-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: shoplaptop
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `categories` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `modified_by` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `categorycode` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `categoryname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_4d4fcm1k4pvyawuo33qne56ko` (`categorycode`),
  UNIQUE KEY `UK_pr2ms98ayaf1r17k7yyr4l3o9` (`categoryname`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1,NULL,NULL,NULL,NULL,'LAPTOP','Laptop'),(2,NULL,NULL,NULL,NULL,'HEADPHONE','Headphone'),(3,NULL,NULL,NULL,NULL,'USB','USB'),(4,NULL,NULL,NULL,NULL,'HDD','HDD'),(5,NULL,NULL,NULL,NULL,'SSD','SSD');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comments`
--

DROP TABLE IF EXISTS `comments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `comments` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `modified_by` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `content` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `rate` float DEFAULT NULL,
  `title` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `product_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6uv0qku8gsu6x1r2jkrtqwjtn` (`product_id`),
  KEY `FK8omq0tc18jd43bu5tjh6jvraq` (`user_id`),
  CONSTRAINT `FK6uv0qku8gsu6x1r2jkrtqwjtn` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`),
  CONSTRAINT `FK8omq0tc18jd43bu5tjh6jvraq` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comments`
--

LOCK TABLES `comments` WRITE;
/*!40000 ALTER TABLE `comments` DISABLE KEYS */;
/*!40000 ALTER TABLE `comments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `images`
--

DROP TABLE IF EXISTS `images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `images` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `modified_by` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `product_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKghwsjbjo7mg3iufxruvq6iu3q` (`product_id`),
  CONSTRAINT `FKghwsjbjo7mg3iufxruvq6iu3q` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `images`
--

LOCK TABLES `images` WRITE;
/*!40000 ALTER TABLE `images` DISABLE KEYS */;
/*!40000 ALTER TABLE `images` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderdetails`
--

DROP TABLE IF EXISTS `orderdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `orderdetails` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `modified_by` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `order_id` bigint(20) NOT NULL,
  `product_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKhnsosbuy7bhpqpnt3bjr7sh8x` (`order_id`),
  KEY `FK92im1bt9gndrexccag7x5oq92` (`product_id`),
  CONSTRAINT `FK92im1bt9gndrexccag7x5oq92` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`),
  CONSTRAINT `FKhnsosbuy7bhpqpnt3bjr7sh8x` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderdetails`
--

LOCK TABLES `orderdetails` WRITE;
/*!40000 ALTER TABLE `orderdetails` DISABLE KEYS */;
INSERT INTO `orderdetails` VALUES (1,NULL,NULL,NULL,NULL,1,1,10);
/*!40000 ALTER TABLE `orderdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `modified_by` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `name_customer` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `ship_address` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `ship_date` datetime NOT NULL,
  `status` int(11) NOT NULL,
  `total_price` double NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK32ql8ubntj5uh44ph9659tiih` (`user_id`),
  CONSTRAINT `FK32ql8ubntj5uh44ph9659tiih` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,NULL,NULL,NULL,NULL,'Nguyen Van A','Ho Chi Minh','2019-12-30 00:00:00',0,529841,1);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `products` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `modified_by` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `brand` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `color` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `decription` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `price` double NOT NULL,
  `promo_price` double DEFAULT NULL,
  `rating` float DEFAULT NULL,
  `series` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `thumbnail` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `warranty` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `category_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKog2rp4qthbtt2lfyhfo32lsw9` (`category_id`),
  CONSTRAINT `FKog2rp4qthbtt2lfyhfo32lsw9` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'Default auditor','2019-12-13 22:31:08','Default auditor','2019-12-13 22:31:08','NEW','beautiful','Chất liệu polyester bền nhưng nhẹ với khả năng chống thấm nước giúp bảo vệ thiết bị của bạn khỏi trầy xước và trầy xước.','new product',10000,NULL,NULL,'limited',NULL,'forever',3),(2,'Default auditor','2019-12-13 22:34:49','Default auditor','2019-12-13 22:34:49','Apple','silver','CPU: Intel Core i5 Broadwell, RAM: 8 GB DDR3L(On board) 1600MHz, SSD: 128 GB, Display: 13.3 inch WXGA+(1440 x 900), Graphics: Intel HD Graphics 6000, Battery: Lion 3 cell, Weight: 1.35kg','Laptop Apple MacBook Air 2017 i5 1.8GHz/8GB/128GB',22999000,21490000,NULL,'Macbook Air',NULL,'12 months',1),(3,'Default auditor','2019-12-13 22:35:41','Default auditor','2019-12-13 22:35:41','Apple','pink','Laptop Apple Macbook Air 2019 i5 1.6GHz/8GB/128GB','Laptop Apple MacBook Air 2017 i5 1.8GHz/8GB/128GB',28990000,27990000,NULL,'Macbook Air',NULL,'12 months',1),(4,'Default auditor','2019-12-13 22:38:05','Default auditor','2019-12-13 22:38:05','Sony','green','Headphone Type: Closed dynamic, Magnet: Neodymium, Headband: Stainless steel, Wearing Style: Supra-aural, 1.2m cable with Y-type connector and L-shaped gold-plated 4-pole mini plug, Microphone: Omni-directional electret condenser','Sony MDR-XB550AP On-Ear Extra Bass Headphones with Mic (Green)',1063563,834040,NULL,'on- ear',NULL,'6 months',2),(5,'Default auditor','2019-12-13 22:38:48','Default auditor','2019-12-13 22:38:48','JBL','green','Item Weight: 209 g, Product Dimensions: 7 x 18 x 15 cm, Compatible Devices: Audio Player , Laptop, Mobile, Tablet, Connector Type: Wired','JBL C300SI On-Ear Dynamic Wired Headphones, Without Mic (Black)',969491,322948,NULL,'on- ear',NULL,'6 months',2),(6,'Default auditor','2019-12-13 22:45:32','Default auditor','2019-12-13 22:45:32','SanDisk','green','Capacity: 32GB, Share your work files between computers with ease, Password-protect your sensitive files, Ultra-compact and portable USB flash drive','SanDisk Cruzer Blade 32GB USB Flash Drive',320038,135450,NULL,'on- ear',NULL,'6 months',3),(7,'Default auditor','2019-12-13 22:48:24','Default auditor','2019-12-13 22:48:24','Seagate','black','Memory Storage Capacity 1.5 TB, Flash Memory Installed Size: 1.5, Ram Memory Installed Size: 1.5 TB, Digital Storage Capacity: 1500 GB, Hard Drive Size: 1.5 TB, Hard Drive Interface: USB 3.0','Seagate Expansion Portable 1.5TB External Hard Drive HDD – USB 3.0 for PC Laptop (STEA1500400)',1906978,1292762,NULL,'on- ear',NULL,'12 months',4),(8,'Default auditor','2019-12-13 22:49:15','Default auditor','2019-12-13 22:49:15','Western Digital','blue','RAM Size: 1 GB, Memory Storage Capacity: 1 TB, Flash Memory Installed Size: 1 TB, Computer Memory Type: DDR3 SDRAM, Digital Storage Capacity: 1 TB, Hard Drive Size: 1 TB, Data Transfer Rate: 750 megabytes_per_second, Connector Type: Wired','Western Digital WD10EZEX 1TB Internal Hard Drive for Desktop (Blue)',1451488,904836,NULL,'on- ear',NULL,'12 months',4),(9,'Default auditor','2019-12-13 22:52:05','Default auditor','2019-12-13 22:52:05','Western Digital','black','Item Height: 7 Millimeters, Item Width: 7 Centimeters, Item Weight: 36.3 g, Product Dimensions: 10 x 7 x 0.7 cm, Item model number: WDS500G2B0A, Computer Memory Type: DDR4 SDRAM, Hard Drive Interface: Serial ATA','Western DigitalBlue 500GB Internal Solid State Drive',2844788,1777669,NULL,'on- ear',NULL,'12 months',5),(10,'Default auditor','2019-12-13 22:53:24','Default auditor','2019-12-13 22:53:24','Kingston','black','Item Weight: 118 g, Package Dimensions: 18.3 x 12.7 x 0.8 cm, Item model number: SA400S37/120GIN, Memory Storage Capacity: 120 GB, Flash Memory Installed Size: 120 GB, Hard Drive Interface: Solid State','Kingston SSDNow A400 120GB Internal Solid State Drive (SA400S37/120GIN)',1131450,529841,NULL,'on- ear',NULL,'12 months',5);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `modified_by` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `address` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `fullname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `phone` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `role` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `status` int(11) NOT NULL,
  `username` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_r43af9ap4edm43mmtq01oddj6` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,NULL,NULL,NULL,NULL,'Vo Van Ngan','cus1@gmail.com','Nguyen Van A','cus1','0909090090','CUSTOMER',1,'cus1'),(2,NULL,NULL,NULL,NULL,'Ho Chi Minh','cus2@gmail.com','Nguyen Thi B','cus2','909876565','CUSTOMER',1,'cus2'),(3,NULL,NULL,NULL,NULL,'Ha Noi','admin@gmail.com','Nguyen Quan Li','admin','0909878675','ADMIN',1,'admin');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-14  0:17:09
