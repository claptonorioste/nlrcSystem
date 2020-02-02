-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 04, 2019 at 04:27 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nlrc`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee_info`
--

CREATE TABLE `employee_info` (
  `EID` int(11) NOT NULL,
  `Name` text NOT NULL,
  `Surename` text NOT NULL,
  `Username` text NOT NULL,
  `Password` text NOT NULL,
  `userType` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee_info`
--

INSERT INTO `employee_info` (`EID`, `Name`, `Surename`, `Username`, `Password`, `userType`) VALUES
(2, 'Nelpots', 'Joy', 'admin', '1234', 'admin'),
(5, '123', '123', '123', '123', 'Editor');

-- --------------------------------------------------------

--
-- Table structure for table `loginhistory`
--

CREATE TABLE `loginhistory` (
  `id` int(75) NOT NULL,
  `login` varchar(75) NOT NULL,
  `logout` varchar(75) DEFAULT NULL,
  `account_name` varchar(75) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `nlrc_data`
--

CREATE TABLE `nlrc_data` (
  `id` int(11) NOT NULL,
  `Cnum` varchar(1000) NOT NULL,
  `Title` varchar(1000) NOT NULL,
  `Date_app_nlrc` varchar(255) NOT NULL,
  `Date_rec_oecc` date NOT NULL,
  `Date_rec_com` varchar(255) NOT NULL,
  `Date_app_prom` varchar(255) NOT NULL,
  `Date_mr_filed` varchar(255) NOT NULL,
  `date_mr_prom` varchar(1000) NOT NULL,
  `ind_code` varchar(255) NOT NULL,
  `nature_case` varchar(255) NOT NULL,
  `nature_award` varchar(255) NOT NULL,
  `amm_award` varchar(1000) NOT NULL,
  `com` varchar(255) NOT NULL,
  `male` varchar(1000) NOT NULL,
  `female` varchar(1000) NOT NULL,
  `la` varchar(255) NOT NULL,
  `date_mailed` varchar(255) NOT NULL,
  `appeal_fee` varchar(8000) NOT NULL,
  `bond` varchar(255) NOT NULL,
  `entry_judgment` varchar(255) NOT NULL,
  `date_entry_judg_issued` varchar(255) NOT NULL,
  `date_forwarded` varchar(255) NOT NULL,
  `courier_airbill_no` varchar(8000) NOT NULL,
  `remarks` varchar(8000) NOT NULL,
  `app_date_or` varchar(75) NOT NULL,
  `bond_date_or` varchar(75) NOT NULL,
  `case_type` varchar(8000) NOT NULL,
  `nlrc_case_num` varchar(1000) NOT NULL,
  `ofw_type` varchar(255) NOT NULL,
  `complainant` varchar(255) NOT NULL,
  `respondent` varchar(255) NOT NULL,
  `rab_type` varchar(255) NOT NULL,
  `appellant` varchar(255) NOT NULL,
  `date_prom` varchar(255) NOT NULL,
  `other` varchar(255) NOT NULL,
  `appeal_or` varchar(255) NOT NULL,
  `ap_date` varchar(255) NOT NULL,
  `full_cnum` varchar(255) NOT NULL,
  `full_rab` varchar(255) NOT NULL,
  `bond_amount` varchar(255) NOT NULL,
  `date_bnd_new` varchar(255) NOT NULL,
  `surety` varchar(255) NOT NULL,
  `bnd_num_new` varchar(255) NOT NULL,
  `bndm_new` varchar(255) NOT NULL,
  `app_curr` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `amm_curr` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `ponente` varchar(255) NOT NULL,
  `decision_on_appeal` varchar(255) NOT NULL,
  `mr_filed_by1` varchar(255) NOT NULL,
  `decision_on_mr1` varchar(255) NOT NULL,
  `date_mr_filed2` varchar(255) NOT NULL,
  `mr_filed_by2` varchar(255) NOT NULL,
  `decision_on_mr2` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nlrc_data`
--

INSERT INTO `nlrc_data` (`id`, `Cnum`, `Title`, `Date_app_nlrc`, `Date_rec_oecc`, `Date_rec_com`, `Date_app_prom`, `Date_mr_filed`, `date_mr_prom`, `ind_code`, `nature_case`, `nature_award`, `amm_award`, `com`, `male`, `female`, `la`, `date_mailed`, `appeal_fee`, `bond`, `entry_judgment`, `date_entry_judg_issued`, `date_forwarded`, `courier_airbill_no`, `remarks`, `app_date_or`, `bond_date_or`, `case_type`, `nlrc_case_num`, `ofw_type`, `complainant`, `respondent`, `rab_type`, `appellant`, `date_prom`, `other`, `appeal_or`, `ap_date`, `full_cnum`, `full_rab`, `bond_amount`, `date_bnd_new`, `surety`, `bnd_num_new`, `bndm_new`, `app_curr`, `amm_curr`, `ponente`, `decision_on_appeal`, `mr_filed_by1`, `decision_on_mr1`, `date_mr_filed2`, `mr_filed_by2`, `decision_on_mr2`) VALUES
(1, '09-05-10024-12', 'Complainant vs Respondent', '2019-3-3', '2019-11-30', '2019-12-31', '2012-12-1', '1994-12-31', '2019-12-31', 'code', 'case ', 'Computation of complaints award for the purpose of exection', '10000', 'ELA', '4', '4', 'Los Angeles', '2018-11-25', '5000', '50000', '2019-12-31', '2019-11-1', '2019-12-25', '1', 'this is a remarks', '2019-12-5', 'bond orioste', 'MAC No.', '016198-2019', 'OFW', 'Complainant', 'Respondent', 'RAB', 'Complainant', '2019-7-7', 'DD:OK', 'Orioste', '2018-12-31', 'MAC No. 016198-2019-OFW', 'RAB 09-05-10024-12', '500', '2019-3-3', 'surety ni', 'BOND NUMBER ni sya', '1997-5-5', '₱', '₱', 'ponente', 'this is a Decision on appeal', 'clapton', 'MR 1 decision', '2019-12-20', 'ORIOSTE', 'MR 2 decision');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee_info`
--
ALTER TABLE `employee_info`
  ADD PRIMARY KEY (`EID`);

--
-- Indexes for table `loginhistory`
--
ALTER TABLE `loginhistory`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `nlrc_data`
--
ALTER TABLE `nlrc_data`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee_info`
--
ALTER TABLE `employee_info`
  MODIFY `EID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `loginhistory`
--
ALTER TABLE `loginhistory`
  MODIFY `id` int(75) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1361;
--
-- AUTO_INCREMENT for table `nlrc_data`
--
ALTER TABLE `nlrc_data`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
