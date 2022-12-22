-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 11, 2021 at 03:43 PM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `shoppingcart`
--

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE IF NOT EXISTS `items` (
  `ID` int(100) NOT NULL AUTO_INCREMENT,
  `List_ID` int(100) NOT NULL,
  `Items` varchar(100) NOT NULL,
  `Price` int(100) NOT NULL,
  `Quantity` int(100) NOT NULL,
  `Total_Price` int(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=43 ;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`ID`, `List_ID`, `Items`, `Price`, `Quantity`, `Total_Price`) VALUES
(36, 6, 'item 2', 100, 1, 100),
(37, 6, 'item 3', 500, 3, 1500),
(38, 7, 'abc', 100, 2, 200),
(39, 7, 'abcd', 234, 1, 234),
(41, 8, 'Shoes', 500, 3, 1500),
(42, 8, 'Tshirt', 699, 1, 699);

-- --------------------------------------------------------

--
-- Table structure for table `list`
--

CREATE TABLE IF NOT EXISTS `list` (
  `ID` int(100) NOT NULL,
  `List_Name` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `list`
--

INSERT INTO `list` (`ID`, `List_Name`) VALUES
(6, 'New list'),
(7, 'list 2'),
(8, 'Flipkart''s Wishlist');
