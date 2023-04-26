/*
SQLyog Ultimate v8.82 
MySQL - 5.1.50-community : Database - online_parking
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`online_parking` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `online_parking`;

/*Table structure for table `booking` */

DROP TABLE IF EXISTS `booking`;

CREATE TABLE `booking` (
  `b_id` int(4) NOT NULL AUTO_INCREMENT,
  `p_id` varchar(20) DEFAULT NULL,
  `c_id` varchar(20) DEFAULT NULL,
  `c_name` varchar(50) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `v_number` varchar(50) DEFAULT NULL,
  `p_no` decimal(10,0) DEFAULT NULL,
  `p_date` varchar(20) DEFAULT NULL,
  `p_time` varchar(20) DEFAULT NULL,
  `b_date` date DEFAULT NULL,
  UNIQUE KEY `b_id` (`b_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `booking` */

insert  into `booking`(`b_id`,`p_id`,`c_id`,`c_name`,`phone`,`v_number`,`p_no`,`p_date`,`p_time`,`b_date`) values (7,'sahara@gmail.com','ajay@gmail.com','saa','454','12','1','12/12/2015','10am','2016-04-22'),(8,'sahara@gmail.com','ajay@gmail.com','12','445','121','1','12/12/2015','10am12pm','2016-04-22'),(9,'sahara@gmail.com','ajay@gmail.com','sas','2312121','448','1','12/12/2015','10am12pm','2016-04-22');

/*Table structure for table `c_reg` */

DROP TABLE IF EXISTS `c_reg`;

CREATE TABLE `c_reg` (
  `r_id` int(4) NOT NULL AUTO_INCREMENT,
  `fname` varchar(50) DEFAULT NULL,
  `lname` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `r_date` date DEFAULT NULL,
  UNIQUE KEY `r_id` (`r_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `c_reg` */

insert  into `c_reg`(`r_id`,`fname`,`lname`,`email`,`phone`,`address`,`r_date`) values (1,'ajay','yadav','ajay@gmail.com','21212','sjaksaksa asasa','2016-03-06'),(2,'devanshu','jagg','dev@gmail.com','1215','dsdjsj','2016-03-18'),(3,'rahul','kumaR','rahul@gmail.com','1','','2016-03-31'),(4,'rahul','jsaj','rahul@gmail.com','412552','adsajh','2016-03-31');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`email`,`password`) values ('abc@gmail.com','ajay');

/*Table structure for table `registration` */

DROP TABLE IF EXISTS `registration`;

CREATE TABLE `registration` (
  `r_id` int(4) NOT NULL AUTO_INCREMENT,
  `p_name` varchar(50) DEFAULT NULL,
  `p_area` varchar(50) DEFAULT NULL,
  `p_cap` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `r_date` date DEFAULT NULL,
  UNIQUE KEY `r_id` (`r_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `registration` */

insert  into `registration`(`r_id`,`p_name`,`p_area`,`p_cap`,`email`,`phone`,`address`,`password`,`r_date`) values (3,'citylif','aliganj','250','city@gmail.com','122`','ajsdak','abc','2016-05-08');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
