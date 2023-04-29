-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 06, 2022 at 06:47 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `HMS`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctorRecord`
--

CREATE TABLE `doctorRecord` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Age` varchar(5) NOT NULL,
  `Specialization` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctorRecord`
--

INSERT INTO `doctorRecord` (`id`, `user_id`, `Name`, `Gender`, `Age`, `Specialization`) VALUES
(1, 1, 'Tayyub Naveed', 'Male', '25', 'Child specialist'),
(2, 2, 'Ali Khan', 'Male', '36', 'Dermatologist'),
(3, 123, 'Wasim Akram', 'Male', '52', 'Allergy and immunology'),
(4, 222, 'Adil Khan', 'Male', '38', 'Family medicine'),
(5, 12, 'Jawad Khan', 'Male', '21', 'Nothing');

-- --------------------------------------------------------

--
-- Table structure for table `Login`
--

CREATE TABLE `Login` (
  `id` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `user_type` enum('Doctor','Patient','Admin','Receptionist','Nurse') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Login`
--

INSERT INTO `Login` (`id`, `username`, `password`, `user_type`) VALUES
(1, 'tayyub', 'tayyub123', 'Doctor'),
(2, 'ali', 'ali123', 'Patient'),
(3, 'admin', 'admin123', 'Admin'),
(4, 'usman', 'usman123', 'Receptionist'),
(5, 'nurse', 'nurse123', 'Nurse');

-- --------------------------------------------------------

--
-- Table structure for table `patientCheckup`
--

CREATE TABLE `patientCheckup` (
  `id` int(11) NOT NULL,
  `patient_id` int(11) NOT NULL,
  `prescription` varchar(100) NOT NULL,
  `is_paid` tinyint(4) NOT NULL DEFAULT 0,
  `doctor_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `patientRecord`
--

CREATE TABLE `patientRecord` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Age` int(11) NOT NULL,
  `perscription` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patientRecord`
--

INSERT INTO `patientRecord` (`id`, `user_id`, `Name`, `Gender`, `Age`, `perscription`) VALUES
(1, 1, 'Ali', 'Male', 12, 'akjsdnknds'),
(5, 222, 'Ali Ahmed', 'Male', 18, 'Panadol. . . . . ');

-- --------------------------------------------------------

--
-- Table structure for table `pharmacy`
--

CREATE TABLE `pharmacy` (
  `id` int(11) NOT NULL,
  `medicine` varchar(25) NOT NULL,
  `price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctorRecord`
--
ALTER TABLE `doctorRecord`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Login`
--
ALTER TABLE `Login`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `patientCheckup`
--
ALTER TABLE `patientCheckup`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `patientRecord`
--
ALTER TABLE `patientRecord`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pharmacy`
--
ALTER TABLE `pharmacy`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `doctorRecord`
--
ALTER TABLE `doctorRecord`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `Login`
--
ALTER TABLE `Login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT for table `patientCheckup`
--
ALTER TABLE `patientCheckup`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `patientRecord`
--
ALTER TABLE `patientRecord`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `pharmacy`
--
ALTER TABLE `pharmacy`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
