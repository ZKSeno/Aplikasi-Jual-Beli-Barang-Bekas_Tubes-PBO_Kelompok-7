-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 08, 2024 at 11:42 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubespbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `list_barang`
--

CREATE TABLE `list_barang` (
  `BarangID` int(11) NOT NULL,
  `nama_barang` varchar(30) NOT NULL,
  `kuantitas` int(11) NOT NULL,
  `harga` double NOT NULL,
  `kondisi` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `list_barang`
--

INSERT INTO `list_barang` (`BarangID`, `nama_barang`, `kuantitas`, `harga`, `kondisi`) VALUES
(1, 'Charger', 1, 5000, 'baik'),
(2, 'Handuk', 2, 4000, 'baik'),
(4, 'Kipas', 1, 20000, 'baik'),
(5, 'Lampu', 2, 1250, 'baik sekali'),
(6, 'Sapu', 2, 2000, 'baik'),
(23, 'Sepatu', 3, 1500, 'baik');

-- --------------------------------------------------------

--
-- Table structure for table `penilaian`
--

CREATE TABLE `penilaian` (
  `nilai` int(11) NOT NULL,
  `review` varchar(50) NOT NULL,
  `UserID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penilaian`
--

INSERT INTO `penilaian` (`nilai`, `review`, `UserID`) VALUES
(3, 'amn', 22),
(5, '', 22),
(2, '', 22),
(4, '', 34);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `alamat` varchar(50) NOT NULL,
  `metode_pembayaran` varchar(50) NOT NULL,
  `waktu` varchar(50) NOT NULL,
  `UserID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`alamat`, `metode_pembayaran`, `waktu`, `UserID`) VALUES
('-', 'Tunai', '2024-01-08T10:40:54.450483300', 22),
('-', 'Tunai', '2024-01-08T10:52:34.798533600', 22),
('-', 'Tunai', '2024-01-08T10:58:18.672580', 26),
('-', 'Tunai', '2024-01-08T11:08:02.034507600', 22),
('-', 'Tunai', '2024-01-08T11:12:45.064001600', 22),
('-', 'Tunai', '2024-01-08T11:32:02.029517700', 22),
('-', 'Tunai', '2024-01-08T12:15:23.644721600', 22),
('-', 'Tunai', '2024-01-08T12:28:56.477439', 22),
('-', 'Tunai', '2024-01-08T12:31:50.736054200', 22),
('-', 'Tunai', '2024-01-08T12:34:11.136466200', 22),
('-', 'Tunai', '2024-01-08T13:36:43.666947500', 22),
('-', 'Tunai', '2024-01-08T13:52:25.096982100', 22),
('-', 'Tunai', '2024-01-08T14:00:31.330698200', 22),
('-', 'Tunai', '2024-01-08T15:50:41.633120800', 34);

-- --------------------------------------------------------

--
-- Table structure for table `user_pembeli`
--

CREATE TABLE `user_pembeli` (
  `UserID` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `password` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_pembeli`
--

INSERT INTO `user_pembeli` (`UserID`, `nama`, `password`, `email`) VALUES
(20, 'Seno2', 'mm', 'mm'),
(21, 'Seno3', 'mm', 'mm'),
(22, 'Seno4', 'mm', 'mm'),
(23, 'Seno', 'mm', 'seno'),
(24, 'Seno2', 'mm', 'seno'),
(25, 'Seno5', '12345678', 'mm'),
(26, 'Seno6', 'mm', 'mm'),
(27, 'Seno7', 'mm', '123'),
(28, 'Seno4', 'mm', 'mm@gmail.com'),
(29, 'Seno5', 'mm', 'mm2@gmail.com'),
(30, 'Seno7', 'mm', 'an@gmail.com'),
(31, 'Seno8', 'mm', 'an2@gmail.com'),
(32, 'Seno', 'mm2', 'mm'),
(33, 'Seno12', 'mm', 'aa@gmail.com'),
(34, 'Ghoffar', 'seno123', 'mon@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `user_penjual`
--

CREATE TABLE `user_penjual` (
  `UserID` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `jabatan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_penjual`
--

INSERT INTO `user_penjual` (`UserID`, `nama`, `password`, `email`, `jabatan`) VALUES
(2, 'mm', 'mm', 'mm', 'Pegawai'),
(3, 'Seno', 'seno123', 'mm', 'Pegawai'),
(4, 'Seno4', 'mm', 'mm', 'Manajer'),
(5, 'Seno2', 'seno123', 'a@gmail.com', 'Manajer');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `list_barang`
--
ALTER TABLE `list_barang`
  ADD PRIMARY KEY (`BarangID`);

--
-- Indexes for table `penilaian`
--
ALTER TABLE `penilaian`
  ADD KEY `UserID` (`UserID`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD KEY `UserID` (`UserID`);

--
-- Indexes for table `user_pembeli`
--
ALTER TABLE `user_pembeli`
  ADD PRIMARY KEY (`UserID`);

--
-- Indexes for table `user_penjual`
--
ALTER TABLE `user_penjual`
  ADD PRIMARY KEY (`UserID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `list_barang`
--
ALTER TABLE `list_barang`
  MODIFY `BarangID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `user_pembeli`
--
ALTER TABLE `user_pembeli`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT for table `user_penjual`
--
ALTER TABLE `user_penjual`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `penilaian`
--
ALTER TABLE `penilaian`
  ADD CONSTRAINT `penilaian_ibfk_1` FOREIGN KEY (`UserID`) REFERENCES `user_pembeli` (`UserID`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`UserID`) REFERENCES `user_pembeli` (`UserID`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`UserID`) REFERENCES `user_pembeli` (`UserID`),
  ADD CONSTRAINT `transaksi_ibfk_3` FOREIGN KEY (`UserID`) REFERENCES `user_pembeli` (`UserID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
