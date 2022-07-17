-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: sql300.byetcluster.com
-- Generation Time: Jul 09, 2022 at 06:06 AM
-- Server version: 10.3.27-MariaDB
-- PHP Version: 7.2.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `epiz_32115695_henil_code`
--

-- --------------------------------------------------------

--
-- Table structure for table `mongodb_command`
--

CREATE TABLE `mongodb_command` (
  `CODE_ID` int(11) NOT NULL,
  `CODE_TITLE` text NOT NULL,
  `CODE_SYNTAX` text NOT NULL,
  `CODE_DESCRIPTION` text NOT NULL,
  `TIMESTAMP` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mongodb_command`
--

INSERT INTO `mongodb_command` (`CODE_ID`, `CODE_TITLE`, `CODE_SYNTAX`, `CODE_DESCRIPTION`, `TIMESTAMP`) VALUES
(1, 'show dbs', 'show dbs', 'use command list out all database in mongodb serevr', '2022-07-07 15:26:40'),
(2, 'db', 'db', 'use command find currently working database', '2022-07-07 15:28:08'),
(3, 'dropDatabase()', 'db.dropDatabase()', 'that command use drop current working database', '2022-07-07 15:38:24'),
(4, 'use', 'use henilcode', 'that command use create database and also switch existing database', '2022-07-07 15:40:19'),
(5, 'createCollection( )', 'db.createCollection(\"name\",options)', 'In the command, <b>name<b> is name of collection to be created. Options is a document and is used to specify configuration of collection.', '2022-07-08 01:46:40'),
(6, 'show collections', 'show collections', 'that command use for display all collections in working database', '2022-07-08 01:49:41'),
(7, 'drop()', 'db.henilcode.drop()', 'use for complete <b>delete</b> collections in working database', '2022-07-08 01:52:18'),
(8, 'insert', 'db.table.insert({Name:\"Henil\",Age:19})', 'that code in table is collection and use insert method create single document. ', '2022-07-08 12:46:55'),
(9, 'insertMany( )', 'db.table.insertMany([{Name:\"Henil\",Age:19},{Name:\"Nayan\",Age:20}])', 'use insertMany method we can create multi document at a time.', '2022-07-08 12:50:52'),
(10, 'find()', 'db.users.find({ field1 : value })', 'Optional Specifies the fields to return in the documents that match the query filter. To return all fields in the matching documents, omit this parameter.', '2022-07-08 13:07:23'),
(11, 'pretty()', 'db.users.find().pretty()', 'pretty method is display the Mongo query results in an easy-to-read attractive format.', '2022-07-08 13:34:13'),
(12, 'distinct()', 'db.user.distinct(\"Name\")', 'Finds the distinct values for a specified field across a single collection or view and returns the results in an array.', '2022-07-09 01:59:57');

-- --------------------------------------------------------

--
-- Table structure for table `TERMINAL_COMMAND`
--

CREATE TABLE `TERMINAL_COMMAND` (
  `CODE_ID` int(11) NOT NULL,
  `CODE_TITLE` text NOT NULL,
  `CODE_SYNTAX` text NOT NULL,
  `CODE_DESCRIPTION` text NOT NULL,
  `TIME_STAMP` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `TERMINAL_COMMAND`
--

INSERT INTO `TERMINAL_COMMAND` (`CODE_ID`, `CODE_TITLE`, `CODE_SYNTAX`, `CODE_DESCRIPTION`, `TIME_STAMP`) VALUES
(1, 'mkdir', 'mkdir [ directory name ] ', 'that command use for make directory or folder.', '2022-07-07 11:03:35'),
(2, 'cd', 'cd [ directory address ]', 'cd command use for change directory ', '2022-07-07 11:35:00'),
(3, 'ls', 'ls', 'ls command use for list out all file in current directory ', '2022-07-07 15:33:34'),
(4, 'cal', 'cal  [option 1]  [option 2]', 'that command is display current month and year calendar by default, if you display custom calendar you fill 2 options in 1 option <u> month </u> & 2 option <u> year </u>use', '2022-07-07 15:48:02'),
(5, 'date', 'date [OPTION]... [+FORMAT]', 'date command have many options if you with out option use date command that display current system date and time. you can use data command <a href=\"https://www.geeksforgeeks.org/date-command-linux-examples/\" >option</a> you can see.', '2022-07-08 02:00:51'),
(6, 'pwd', 'pwd', 'that command is display print working directory', '2022-07-08 13:35:47');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
