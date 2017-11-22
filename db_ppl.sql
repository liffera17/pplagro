-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 21, 2017 at 07:29 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_ppl`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_bobot`
--

CREATE TABLE `tb_bobot` (
  `id_kondisi` int(10) NOT NULL,
  `kriteria` varchar(10) NOT NULL,
  `nilai` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_bobot`
--

INSERT INTO `tb_bobot` (`id_kondisi`, `kriteria`, `nilai`) VALUES
(1, 'Super', '> 30 gr'),
(2, 'Baik', '15 - 29 gr'),
(3, 'Minimal', '6 - 14 gr '),
(4, 'Gagal', '< 6 gr');

-- --------------------------------------------------------

--
-- Table structure for table `tb_cacat`
--

CREATE TABLE `tb_cacat` (
  `id_kondisi` int(10) NOT NULL,
  `kriteria` varchar(10) NOT NULL,
  `nilai` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_cacat`
--

INSERT INTO `tb_cacat` (`id_kondisi`, `kriteria`, `nilai`) VALUES
(1, 'Normal', '< 5%'),
(2, 'Cacat Keci', '> 5-9%'),
(3, 'Cacat', '10%'),
(4, 'Gagal', '> 10%');

-- --------------------------------------------------------

--
-- Table structure for table `tb_jadwalbibit`
--

CREATE TABLE `tb_jadwalbibit` (
  `id_jadwal` int(10) NOT NULL,
  `nama` varchar(10) NOT NULL,
  `tanggal` date DEFAULT NULL,
  `luas` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_jadwalbibit`
--

INSERT INTO `tb_jadwalbibit` (`id_jadwal`, `nama`, `tanggal`, `luas`) VALUES
(5, 'Muhtar', '2017-11-20', 1),
(6, 'Muhtar', '2018-03-18', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_jadwalpupuk`
--

CREATE TABLE `tb_jadwalpupuk` (
  `id_jadwal` int(10) NOT NULL,
  `nama` varchar(10) DEFAULT NULL,
  `tanggal` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_jadwalpupuk`
--

INSERT INTO `tb_jadwalpupuk` (`id_jadwal`, `nama`, `tanggal`) VALUES
(4, 'Muhtar', '2017-11-21');

-- --------------------------------------------------------

--
-- Table structure for table `tb_kontrak`
--

CREATE TABLE `tb_kontrak` (
  `id_kontrak` int(10) NOT NULL,
  `petani` varchar(10) DEFAULT NULL,
  `luas` int(10) DEFAULT NULL,
  `jumlah_bibit` double DEFAULT NULL,
  `jumlah_pupuk` double DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_kontrak`
--

INSERT INTO `tb_kontrak` (`id_kontrak`, `petani`, `luas`, `jumlah_bibit`, `jumlah_pupuk`) VALUES
(1, 'Darius', 1, 87.75, 83.3499984741211),
(2, 'Muhtar', 1, 87.75, 83),
(3, 'Cristian', 3, 263.25, 248.99999999999997);

-- --------------------------------------------------------

--
-- Table structure for table `tb_matang`
--

CREATE TABLE `tb_matang` (
  `id_kondisi` int(10) NOT NULL,
  `kriteria` varchar(10) NOT NULL,
  `nilai` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_matang`
--

INSERT INTO `tb_matang` (`id_kondisi`, `kriteria`, `nilai`) VALUES
(1, 'Matang', '< 25%'),
(2, 'Sedikit Tu', '25 - 50%'),
(3, 'Tua', '51 - 75%'),
(4, 'Gagal', '> 75%');

-- --------------------------------------------------------

--
-- Table structure for table `tb_mutu`
--

CREATE TABLE `tb_mutu` (
  `id_mutu` int(10) NOT NULL,
  `status` varchar(10) NOT NULL,
  `tindakan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_mutu`
--

INSERT INTO `tb_mutu` (`id_mutu`, `status`, `tindakan`) VALUES
(1, 'Mutu Super', 'Kualitas Hasil Panen Super, Panen Layak Ekspor. Kontrak Petani Diperpanjang.'),
(2, 'Mutu I', 'Kualitas Hasil Panen Baik, Panen Tidak Layak Ekspor Namun Masuk Pasar Nasional. Kontrak Diperpanjang'),
(3, 'Mutu II', 'Kualitas Hasil Panen Kurang, Panen Hanya Layak Dipasaran Lokal. Kontrak Petani Dipertimbangkan.'),
(4, 'Mutu III', 'Kualitas Hasil Panen Buruk, Panen Gagal. Putuskan Kontrak Petani.');

-- --------------------------------------------------------

--
-- Table structure for table `tb_user`
--

CREATE TABLE `tb_user` (
  `id_user` int(10) NOT NULL,
  `nama_depan` varchar(10) DEFAULT NULL,
  `nama_belakang` varchar(10) DEFAULT NULL,
  `jenis_kelamin` varchar(10) DEFAULT NULL,
  `status_user` varchar(10) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `alamat` varchar(20) DEFAULT NULL,
  `kode_pos` varchar(10) DEFAULT NULL,
  `no_telp` varchar(13) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_user`
--

INSERT INTO `tb_user` (`id_user`, `nama_depan`, `nama_belakang`, `jenis_kelamin`, `status_user`, `email`, `alamat`, `kode_pos`, `no_telp`, `password`) VALUES
(1, 'Gavin', 'Liffera', 'Laki-laki', 'admin', 'admin', 'Jember', '68124', '085257724473', 'admin'),
(2, 'Muhtar', 'Amin', 'Laki-laki', 'Petani', 'petani', 'Madura', '69122', '089752272538', 'petani'),
(3, 'Darius', 'Sukoco', 'Laki-laki', 'Petani', 'darius', 'Jambi', '61929', '083847281221', 'darius'),
(4, 'Cristian', 'Sukijan', 'Laki-laki', 'Petani', 'sukijan', 'Sumenep', '67182', '087654262722', 'sukijan');

-- --------------------------------------------------------

--
-- Table structure for table `tb_varietas`
--

CREATE TABLE `tb_varietas` (
  `id_kondisi` int(10) NOT NULL,
  `kriteria` varchar(10) NOT NULL,
  `nilai` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_varietas`
--

INSERT INTO `tb_varietas` (`id_kondisi`, `kriteria`, `nilai`) VALUES
(1, 'Super', '< 5%'),
(2, 'Baik', '>= 5-10%'),
(3, 'Minimal', '10%'),
(4, 'Gagal', '> 10%');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_bobot`
--
ALTER TABLE `tb_bobot`
  ADD PRIMARY KEY (`id_kondisi`);

--
-- Indexes for table `tb_cacat`
--
ALTER TABLE `tb_cacat`
  ADD PRIMARY KEY (`id_kondisi`);

--
-- Indexes for table `tb_jadwalbibit`
--
ALTER TABLE `tb_jadwalbibit`
  ADD PRIMARY KEY (`id_jadwal`);

--
-- Indexes for table `tb_jadwalpupuk`
--
ALTER TABLE `tb_jadwalpupuk`
  ADD PRIMARY KEY (`id_jadwal`);

--
-- Indexes for table `tb_kontrak`
--
ALTER TABLE `tb_kontrak`
  ADD PRIMARY KEY (`id_kontrak`);

--
-- Indexes for table `tb_matang`
--
ALTER TABLE `tb_matang`
  ADD PRIMARY KEY (`id_kondisi`);

--
-- Indexes for table `tb_mutu`
--
ALTER TABLE `tb_mutu`
  ADD PRIMARY KEY (`id_mutu`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `tb_varietas`
--
ALTER TABLE `tb_varietas`
  ADD PRIMARY KEY (`id_kondisi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_bobot`
--
ALTER TABLE `tb_bobot`
  MODIFY `id_kondisi` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `tb_cacat`
--
ALTER TABLE `tb_cacat`
  MODIFY `id_kondisi` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `tb_jadwalbibit`
--
ALTER TABLE `tb_jadwalbibit`
  MODIFY `id_jadwal` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `tb_jadwalpupuk`
--
ALTER TABLE `tb_jadwalpupuk`
  MODIFY `id_jadwal` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `tb_kontrak`
--
ALTER TABLE `tb_kontrak`
  MODIFY `id_kontrak` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `tb_matang`
--
ALTER TABLE `tb_matang`
  MODIFY `id_kondisi` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `tb_mutu`
--
ALTER TABLE `tb_mutu`
  MODIFY `id_mutu` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `id_user` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `tb_varietas`
--
ALTER TABLE `tb_varietas`
  MODIFY `id_kondisi` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
