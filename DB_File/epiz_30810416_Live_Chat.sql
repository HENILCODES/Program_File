-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: sql203.byetcluster.com
-- Generation Time: Jun 24, 2022 at 05:22 AM
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
-- Database: `epiz_30810416_Live_Chat`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Name` text NOT NULL,
  `Password` text NOT NULL,
  `Time_Stamp` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Name`, `Password`, `Time_Stamp`) VALUES
('Henil', '@1510@henil', '2022-05-18 13:55:07');

-- --------------------------------------------------------

--
-- Table structure for table `message`
--

CREATE TABLE `message` (
  `ID` bigint(20) NOT NULL,
  `User_Name` text NOT NULL,
  `Message` text NOT NULL DEFAULT 'NL',
  `file` varchar(500) NOT NULL,
  `File_Name` text NOT NULL,
  `Time_Stamps` text NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `message`
--

INSERT INTO `message` (`ID`, `User_Name`, `Message`, `file`, `File_Name`, `Time_Stamps`) VALUES
(1, 'Henil Code', 'Hello Welcome to Live chat.', '', '', '10:48 pm'),
(2, 'Henil Code', 'website in add some features.', '', '', '10:49 pm'),
(3, 'Henil Code', 'now you can see name of message sender.', '', '', '10:49 pm'),
(40, 'Surya', 'Hii', '', '', '08:40 pm'),
(41, 'Henil Code', 'hi\r\n', '', '', '08:41 pm'),
(43, 'Henil Code', 'ohh nice\r\n', '', '', '08:42 pm'),
(47, 'Henil Code', 'hi\r\n', '', '', '5:15 pm'),
(48, 'Henil Code', 'he', '', '', '5:16 pm'),
(49, 'Sir_premji', 'Hlo', '', '', '10:57 am'),
(50, 'Henil Code', 'hi', '', '', '10:57 am'),
(51, 'Henil Code', 'welcome bro', '', '', '10:57 am'),
(52, 'Sir_premji', 'Thxs', '', '', '10:59 am'),
(54, 'Henil Code', 'hmm', '', '', '10:59 am'),
(56, 'Henil Code', 'Hi', '', '', '11:14 am'),
(60, 'Surya', 'Hii', '', '', '11:45 am'),
(61, 'henil code', 'hello surya', '', '', '12:01 pm'),
(62, 'henil code', 'hello', '', '', '18-May-2022 7:28 pm'),
(63, 'Henil code', 'Hi', '', '', '19-May-2022 10:06 pm'),
(64, 'Henil code', 'Hi', '', '', '22-May-2022 4:40 pm'),
(65, 'henil code', 'Hi', '1653397624Photo_.jpg', 'Photo_.jpg', '24-May-2022 6:37 pm'),
(66, 'henil code', 'hello', '1654695534', '', '08-Jun-2022 7:08 pm'),
(67, 'henil code', '{ED7BA470-8E54-465E-825C-99712043E01C}', '1655280013', '', '15-Jun-2022 1:30 pm');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `message`
--
ALTER TABLE `message`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `message`
--
ALTER TABLE `message`
  MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=74;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
