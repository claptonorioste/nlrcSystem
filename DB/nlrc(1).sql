-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 05, 2020 at 03:26 PM
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

--
-- Dumping data for table `loginhistory`
--

INSERT INTO `loginhistory` (`id`, `login`, `logout`, `account_name`) VALUES
(1361, '2019-12-04 at 11:40 PM', NULL, '123 123'),
(1362, '2019-12-04 at 11:42 PM', '2019-12-04 at 11:43 PM', '123 123'),
(1363, '2019-12-04 at 11:43 PM', NULL, 'Nelpots Joy'),
(1364, '2019-12-05 at 11:04 AM', NULL, 'Nelpots Joy'),
(1365, '2019-12-05 at 11:12 AM', NULL, 'Nelpots Joy'),
(1366, '2019-12-05 at 11:35 AM', NULL, '123 123'),
(1367, '2019-12-05 at 11:39 AM', NULL, 'Nelpots Joy'),
(1368, '2019-12-05 at 11:43 AM', NULL, 'Nelpots Joy'),
(1369, '2019-12-05 at 11:53 AM', NULL, 'Nelpots Joy'),
(1370, '2019-12-05 at 11:53 AM', NULL, 'Nelpots Joy'),
(1371, '2019-12-05 at 11:54 AM', NULL, 'Nelpots Joy'),
(1372, '2019-12-05 at 11:54 AM', NULL, 'Nelpots Joy'),
(1373, '2019-12-05 at 11:54 AM', NULL, 'Nelpots Joy'),
(1374, '2019-12-08 at 6:06 PM', NULL, 'Nelpots Joy'),
(1375, '2019-12-08 at 6:47 PM', NULL, 'Nelpots Joy'),
(1376, '2019-12-08 at 6:53 PM', NULL, 'Nelpots Joy'),
(1377, '2019-12-08 at 6:53 PM', NULL, 'Nelpots Joy'),
(1378, '2019-12-08 at 6:54 PM', NULL, 'Nelpots Joy'),
(1379, '2020-02-02 at 6:23 PM', NULL, '123 123'),
(1380, '2020-02-02 at 6:44 PM', NULL, 'Nelpots Joy'),
(1381, '2020-02-02 at 6:44 PM', NULL, 'Nelpots Joy'),
(1382, '2020-02-02 at 6:45 PM', NULL, 'Nelpots Joy'),
(1383, '2020-02-02 at 6:45 PM', NULL, 'Nelpots Joy'),
(1384, '2020-02-02 at 6:46 PM', NULL, 'Nelpots Joy'),
(1385, '2020-02-02 at 6:46 PM', NULL, 'Nelpots Joy'),
(1386, '2020-02-02 at 6:47 PM', NULL, 'Nelpots Joy'),
(1387, '2020-02-02 at 6:47 PM', NULL, 'Nelpots Joy'),
(1388, '2020-02-02 at 6:51 PM', NULL, 'Nelpots Joy'),
(1389, '2020-02-02 at 6:51 PM', NULL, 'Nelpots Joy'),
(1390, '2020-02-02 at 6:53 PM', NULL, 'Nelpots Joy'),
(1391, '2020-02-02 at 6:57 PM', NULL, 'Nelpots Joy'),
(1392, '2020-02-02 at 10:28 PM', NULL, 'Nelpots Joy'),
(1393, '2020-02-02 at 10:31 PM', NULL, 'Nelpots Joy'),
(1394, '2020-02-02 at 10:32 PM', NULL, 'Nelpots Joy'),
(1395, '2020-02-02 at 10:38 PM', NULL, 'Nelpots Joy'),
(1396, '2020-02-02 at 10:39 PM', NULL, 'Nelpots Joy'),
(1397, '2020-02-02 at 10:43 PM', NULL, 'Nelpots Joy'),
(1398, '2020-02-02 at 10:44 PM', NULL, 'Nelpots Joy'),
(1399, '2020-02-02 at 10:47 PM', NULL, 'Nelpots Joy'),
(1400, '2020-02-02 at 10:48 PM', NULL, 'Nelpots Joy'),
(1401, '2020-02-02 at 10:48 PM', NULL, 'Nelpots Joy'),
(1402, '2020-02-02 at 10:49 PM', NULL, 'Nelpots Joy'),
(1403, '2020-02-02 at 10:51 PM', NULL, 'Nelpots Joy'),
(1404, '2020-02-02 at 10:53 PM', NULL, 'Nelpots Joy'),
(1405, '2020-02-02 at 10:56 PM', NULL, 'Nelpots Joy'),
(1406, '2020-02-02 at 11:14 PM', NULL, 'Nelpots Joy'),
(1407, '2020-02-02 at 11:16 PM', NULL, 'Nelpots Joy'),
(1408, '2020-02-02 at 11:18 PM', NULL, 'Nelpots Joy'),
(1409, '2020-02-02 at 11:19 PM', NULL, 'Nelpots Joy'),
(1410, '2020-02-02 at 11:20 PM', NULL, 'Nelpots Joy'),
(1411, '2020-02-02 at 11:21 PM', NULL, 'Nelpots Joy'),
(1412, '2020-02-02 at 11:30 PM', NULL, 'Nelpots Joy'),
(1413, '2020-02-02 at 11:30 PM', NULL, 'Nelpots Joy'),
(1414, '2020-02-02 at 11:39 PM', NULL, 'Nelpots Joy'),
(1415, '2020-02-02 at 11:39 PM', NULL, 'Nelpots Joy'),
(1416, '2020-02-02 at 11:41 PM', NULL, 'Nelpots Joy'),
(1417, '2020-02-02 at 11:41 PM', NULL, 'Nelpots Joy'),
(1418, '2020-02-02 at 11:45 PM', NULL, 'Nelpots Joy'),
(1419, '2020-02-02 at 11:49 PM', NULL, 'Nelpots Joy'),
(1420, '2020-02-02 at 11:50 PM', NULL, 'Nelpots Joy'),
(1421, '2020-02-02 at 11:53 PM', NULL, 'Nelpots Joy'),
(1422, '2020-02-02 at 11:54 PM', NULL, 'Nelpots Joy'),
(1423, '2020-02-03 at 12:06 AM', NULL, 'Nelpots Joy'),
(1424, '2020-02-03 at 12:11 AM', NULL, 'Nelpots Joy'),
(1425, '2020-02-03 at 12:23 AM', NULL, '123 123'),
(1426, '2020-02-05 at 9:42 PM', NULL, 'Nelpots Joy'),
(1427, '2020-02-05 at 9:52 PM', NULL, 'Nelpots Joy'),
(1428, '2020-02-05 at 9:55 PM', NULL, 'Nelpots Joy'),
(1429, '2020-02-05 at 10:06 PM', NULL, 'Nelpots Joy'),
(1430, '2020-02-05 at 10:08 PM', NULL, 'Nelpots Joy'),
(1431, '2020-02-05 at 10:09 PM', NULL, 'Nelpots Joy'),
(1432, '2020-02-05 at 10:13 PM', NULL, 'Nelpots Joy'),
(1433, '2020-02-05 at 10:14 PM', NULL, 'Nelpots Joy'),
(1434, '2020-02-05 at 10:14 PM', NULL, 'Nelpots Joy'),
(1435, '2020-02-05 at 10:15 PM', NULL, 'Nelpots Joy'),
(1436, '2020-02-05 at 10:15 PM', NULL, 'Nelpots Joy'),
(1437, '2020-02-05 at 10:16 PM', NULL, 'Nelpots Joy'),
(1438, '2020-02-05 at 10:17 PM', NULL, 'Nelpots Joy'),
(1439, '2020-02-05 at 10:19 PM', NULL, 'Nelpots Joy'),
(1440, '2020-02-05 at 10:19 PM', NULL, 'Nelpots Joy'),
(1441, '2020-02-05 at 10:20 PM', NULL, 'Nelpots Joy'),
(1442, '2020-02-05 at 10:22 PM', NULL, 'Nelpots Joy'),
(1443, '2020-02-05 at 10:22 PM', NULL, 'Nelpots Joy'),
(1444, '2020-02-05 at 10:24 PM', NULL, 'Nelpots Joy');

-- --------------------------------------------------------

--
-- Table structure for table `nlrc_data`
--

CREATE TABLE `nlrc_data` (
  `id` int(11) NOT NULL,
  `Cnum` text NOT NULL,
  `Title` text NOT NULL,
  `Date_app_nlrc` varchar(255) NOT NULL,
  `Date_rec_oecc` date NOT NULL,
  `Date_rec_com` varchar(255) NOT NULL,
  `Date_app_prom` varchar(255) NOT NULL,
  `Date_mr_filed` varchar(255) NOT NULL,
  `date_mr_prom` text NOT NULL,
  `ind_code` varchar(255) NOT NULL,
  `nature_case` varchar(255) NOT NULL,
  `nature_award` varchar(255) NOT NULL,
  `amm_award` varchar(1000) NOT NULL,
  `com` varchar(255) NOT NULL,
  `male` text NOT NULL,
  `female` varchar(1000) NOT NULL,
  `la` varchar(255) NOT NULL,
  `date_mailed` varchar(255) NOT NULL,
  `appeal_fee` text NOT NULL,
  `bond` varchar(255) NOT NULL,
  `entry_judgment` varchar(255) NOT NULL,
  `date_entry_judg_issued` varchar(255) NOT NULL,
  `date_forwarded` varchar(255) NOT NULL,
  `courier_airbill_no` varchar(8000) NOT NULL,
  `remarks` varchar(8000) NOT NULL,
  `app_date_or` varchar(75) NOT NULL,
  `bond_date_or` varchar(75) NOT NULL,
  `case_type` text NOT NULL,
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
  `decision_on_mr2` varchar(255) NOT NULL,
  `curr` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nlrc_data`
--

INSERT INTO `nlrc_data` (`id`, `Cnum`, `Title`, `Date_app_nlrc`, `Date_rec_oecc`, `Date_rec_com`, `Date_app_prom`, `Date_mr_filed`, `date_mr_prom`, `ind_code`, `nature_case`, `nature_award`, `amm_award`, `com`, `male`, `female`, `la`, `date_mailed`, `appeal_fee`, `bond`, `entry_judgment`, `date_entry_judg_issued`, `date_forwarded`, `courier_airbill_no`, `remarks`, `app_date_or`, `bond_date_or`, `case_type`, `nlrc_case_num`, `ofw_type`, `complainant`, `respondent`, `rab_type`, `appellant`, `date_prom`, `other`, `appeal_or`, `ap_date`, `full_cnum`, `full_rab`, `bond_amount`, `date_bnd_new`, `surety`, `bnd_num_new`, `bndm_new`, `app_curr`, `amm_curr`, `ponente`, `decision_on_appeal`, `mr_filed_by1`, `decision_on_mr1`, `date_mr_filed2`, `mr_filed_by2`, `decision_on_mr2`, `curr`) VALUES
(1, '123123123123123', '123 vs 123', '2019-12-1', '2019-11-05', '-----0---', '-----0---', '-----0---', '2019-3-11', '', '', '', '', '--', '', '', '', '-----0---', '', '', '-----0---', '-----0---', '-----0---', '', '', '-----0---', '', 'MAC No.', '123123', '--', '123', '123', 'RAB', '------', '-----0---', '', '', '-----0---', 'MAC No. 123123 ', 'RAB 123123123123123', '100', '-----0---', '', '', '-----0---', '--', '--', '', '', '', '', '-----0---', '', '', 'PHP ₱'),
(8, '123', '123 vs 123', '1978-01-1', '2019-11-02', '-----0---', '-----0---', '-----0---', '1978-2-2', '', '', '', '', '--', '', '', '', '-----0---', '', '', '-----0---', '-----0---', '-----0---', '', '', '-----0---', '', 'MAC No.', '123', '--', '123', '123', 'RAB', '------', '-----0---', '', '', '-----0---', 'MAC No. 123 ', 'RAB 123', '', '-----0---', '', '', '-----0---', '--', '--', '', '', '', '', '-----0---', '', '', '--'),
(9, '234', '234 vs 234', '2019-01-31', '2019-10-05', '-----0---', '-----0---', '-----0---', '-----0---', '', '', '', '', '--', '', '', '', '-----0---', '', '', '-----0---', '-----0---', '-----0---', '', '', '-----0---', '', 'MAC No.', '234', '--', '234', '234', 'RAB', '------', '-----0---', '', '', '-----0---', 'MAC No. 234 ', 'RAB 234', '', '-----0---', '', '', '-----0---', '--', '--', '', '', '', '', '-----0---', '', '', '--');

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
  MODIFY `id` int(75) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1445;
--
-- AUTO_INCREMENT for table `nlrc_data`
--
ALTER TABLE `nlrc_data`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
