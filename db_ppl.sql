-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 03, 2017 at 08:03 AM
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
  `id_bobot` int(10) NOT NULL,
  `kriteria_bobot` varchar(10) NOT NULL,
  `nilai_bobot` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_bobot`
--

INSERT INTO `tb_bobot` (`id_bobot`, `kriteria_bobot`, `nilai_bobot`) VALUES
(1, 'Super', '> 30 gr'),
(2, 'Baik', '15 - 29 gr'),
(3, 'Minimal', '6 - 14 gr '),
(4, 'Gagal', '< 6 gr');

-- --------------------------------------------------------

--
-- Table structure for table `tb_cacat`
--

CREATE TABLE `tb_cacat` (
  `id_cacat` int(10) NOT NULL,
  `kriteria_cacat` varchar(10) NOT NULL,
  `nilai_cacat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_cacat`
--

INSERT INTO `tb_cacat` (`id_cacat`, `kriteria_cacat`, `nilai_cacat`) VALUES
(1, 'Normal', '< 5%'),
(2, 'Cacat Keci', '> 5-9%'),
(3, 'Cacat', '10%'),
(4, 'Gagal', '> 10%');

-- --------------------------------------------------------

--
-- Table structure for table `tb_kontrak`
--

CREATE TABLE `tb_kontrak` (
  `id_kontrak` int(10) NOT NULL,
  `id_user` int(10) NOT NULL,
  `luas` int(10) DEFAULT NULL,
  `jumlah_bibit` double DEFAULT NULL,
  `jumlah_pupuk` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_kontrak`
--

INSERT INTO `tb_kontrak` (`id_kontrak`, `id_user`, `luas`, `jumlah_bibit`, `jumlah_pupuk`) VALUES
(1, 3, 1, 87.75, 83.3499984741211),
(2, 2, 4, 351, 332),
(3, 4, 2, 175.5, 166),
(9, 5, 3, 263.25, 248.99999999999997);

-- --------------------------------------------------------

--
-- Table structure for table `tb_kualitas`
--

CREATE TABLE `tb_kualitas` (
  `id_kualitas` int(10) NOT NULL,
  `id_varietas` int(10) NOT NULL,
  `id_matang` int(10) NOT NULL,
  `id_bobot` int(10) NOT NULL,
  `id_cacat` int(10) NOT NULL,
  `id_mutu` int(10) NOT NULL,
  `id_user` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_kualitas`
--

INSERT INTO `tb_kualitas` (`id_kualitas`, `id_varietas`, `id_matang`, `id_bobot`, `id_cacat`, `id_mutu`, `id_user`) VALUES
(1, 1, 1, 1, 1, 1, 1),
(2, 1, 1, 1, 2, 1, 1),
(3, 1, 1, 1, 3, 1, 1),
(4, 1, 1, 1, 4, 2, 1),
(5, 1, 1, 2, 1, 1, 1),
(6, 1, 1, 2, 2, 1, 1),
(7, 1, 1, 2, 3, 1, 1),
(8, 1, 1, 2, 4, 1, 1),
(9, 1, 1, 3, 1, 2, 1),
(10, 1, 1, 3, 2, 2, 1),
(11, 1, 1, 3, 3, 2, 1),
(12, 1, 1, 3, 4, 2, 1),
(13, 1, 1, 4, 1, 2, 1),
(14, 1, 1, 4, 2, 3, 1),
(15, 1, 1, 4, 3, 3, 1),
(16, 1, 1, 4, 4, 3, 1),
(17, 1, 2, 1, 1, 2, 1),
(18, 1, 2, 1, 2, 2, 1),
(19, 1, 2, 1, 3, 3, 1),
(20, 1, 2, 1, 4, 3, 1),
(21, 1, 2, 2, 1, 2, 1),
(22, 1, 2, 2, 2, 2, 1),
(23, 1, 2, 2, 3, 2, 1),
(24, 1, 2, 2, 4, 2, 1),
(25, 1, 2, 3, 1, 2, 1),
(26, 1, 2, 3, 2, 2, 1),
(27, 1, 2, 3, 3, 2, 1),
(28, 1, 2, 3, 4, 3, 1),
(29, 1, 2, 4, 1, 3, 1),
(30, 1, 2, 4, 2, 3, 1),
(31, 1, 2, 4, 3, 3, 1),
(32, 1, 2, 4, 4, 3, 1),
(33, 1, 3, 1, 1, 2, 1),
(34, 1, 3, 1, 2, 2, 1),
(35, 1, 3, 1, 3, 2, 1),
(36, 1, 3, 1, 4, 3, 1),
(37, 1, 3, 2, 1, 2, 1),
(38, 1, 3, 2, 2, 2, 1),
(39, 1, 3, 2, 3, 3, 1),
(40, 1, 3, 2, 4, 3, 1),
(41, 1, 3, 3, 1, 3, 1),
(42, 1, 3, 3, 2, 3, 1),
(43, 1, 3, 3, 3, 3, 1),
(44, 1, 3, 3, 4, 3, 1),
(45, 1, 3, 4, 1, 3, 1),
(46, 1, 3, 4, 2, 3, 1),
(47, 1, 3, 4, 3, 4, 1),
(48, 1, 3, 4, 4, 4, 1),
(49, 1, 4, 1, 1, 2, 1),
(50, 1, 4, 1, 2, 2, 1),
(51, 1, 4, 1, 3, 2, 1),
(52, 1, 4, 1, 4, 3, 1),
(53, 1, 4, 2, 1, 2, 1),
(54, 1, 4, 2, 2, 2, 1),
(55, 1, 4, 2, 3, 3, 1),
(56, 1, 4, 2, 4, 3, 1),
(57, 1, 4, 3, 1, 3, 1),
(58, 1, 4, 3, 2, 3, 1),
(59, 1, 4, 3, 3, 3, 1),
(60, 1, 4, 3, 4, 3, 1),
(61, 1, 4, 4, 1, 3, 1),
(62, 1, 4, 4, 2, 3, 1),
(63, 1, 4, 4, 3, 3, 1),
(64, 1, 4, 4, 4, 3, 1),
(65, 2, 1, 1, 1, 1, 1),
(66, 2, 1, 1, 2, 1, 1),
(67, 2, 1, 1, 3, 1, 1),
(68, 2, 1, 1, 4, 2, 1),
(69, 2, 1, 2, 1, 1, 1),
(70, 2, 1, 2, 2, 2, 1),
(71, 2, 1, 2, 3, 2, 1),
(72, 2, 1, 2, 4, 2, 1),
(73, 2, 1, 3, 1, 2, 1),
(74, 2, 1, 3, 2, 2, 1),
(75, 2, 1, 3, 3, 2, 1),
(76, 2, 1, 3, 4, 3, 1),
(77, 2, 1, 4, 1, 3, 1),
(78, 2, 1, 4, 2, 3, 1),
(79, 2, 1, 4, 3, 3, 1),
(80, 2, 1, 4, 4, 3, 1),
(81, 2, 2, 1, 1, 2, 1),
(82, 2, 2, 1, 2, 2, 1),
(83, 2, 2, 1, 3, 2, 1),
(84, 2, 2, 1, 4, 2, 1),
(85, 2, 2, 2, 1, 2, 1),
(86, 2, 2, 2, 2, 2, 1),
(87, 2, 2, 2, 3, 2, 1),
(88, 2, 2, 2, 4, 3, 1),
(89, 2, 2, 3, 1, 2, 1),
(90, 2, 2, 3, 2, 2, 1),
(91, 2, 2, 3, 3, 3, 1),
(92, 2, 2, 3, 4, 3, 1),
(93, 2, 2, 4, 1, 2, 1),
(94, 2, 2, 4, 2, 2, 1),
(95, 2, 2, 4, 3, 3, 1),
(96, 2, 2, 4, 4, 3, 1),
(97, 2, 3, 1, 1, 2, 1),
(98, 2, 3, 1, 2, 2, 1),
(99, 2, 3, 1, 3, 2, 1),
(100, 2, 3, 1, 4, 3, 1),
(101, 2, 3, 2, 1, 2, 1),
(102, 2, 3, 2, 2, 2, 1),
(103, 2, 3, 2, 3, 3, 1),
(104, 2, 3, 2, 4, 3, 1),
(105, 2, 3, 3, 1, 3, 1),
(106, 2, 3, 3, 2, 3, 1),
(107, 2, 3, 3, 3, 3, 1),
(108, 2, 3, 3, 4, 4, 1),
(109, 2, 3, 4, 1, 3, 1),
(110, 2, 3, 4, 2, 3, 1),
(111, 2, 3, 4, 3, 3, 1),
(112, 2, 3, 4, 4, 4, 1),
(113, 2, 4, 1, 1, 2, 1),
(114, 2, 4, 1, 2, 2, 1),
(115, 2, 4, 1, 3, 3, 1),
(116, 2, 4, 1, 4, 3, 1),
(117, 2, 4, 2, 1, 2, 1),
(118, 2, 4, 2, 2, 3, 1),
(119, 2, 4, 2, 3, 3, 1),
(120, 2, 4, 2, 4, 3, 1),
(121, 2, 4, 3, 1, 3, 1),
(122, 2, 4, 3, 2, 3, 1),
(123, 2, 4, 3, 3, 3, 1),
(124, 2, 4, 3, 4, 4, 1),
(125, 2, 4, 4, 1, 3, 1),
(126, 2, 4, 4, 2, 3, 1),
(127, 2, 4, 4, 3, 4, 1),
(128, 2, 4, 4, 4, 4, 1),
(129, 3, 1, 1, 1, 1, 1),
(130, 3, 1, 1, 2, 2, 1),
(131, 3, 1, 1, 3, 2, 1),
(132, 3, 1, 1, 4, 2, 1),
(133, 3, 1, 2, 1, 1, 1),
(134, 3, 1, 2, 2, 2, 1),
(135, 3, 1, 2, 3, 2, 1),
(136, 3, 1, 2, 4, 3, 1),
(137, 3, 1, 3, 1, 2, 1),
(138, 3, 1, 3, 2, 2, 1),
(139, 3, 1, 3, 3, 3, 1),
(140, 3, 1, 3, 4, 4, 1),
(141, 3, 1, 4, 1, 3, 1),
(142, 3, 1, 4, 2, 3, 1),
(143, 3, 1, 4, 3, 3, 1),
(144, 3, 1, 4, 4, 4, 1),
(145, 3, 2, 1, 1, 1, 1),
(146, 3, 2, 1, 2, 2, 1),
(147, 3, 2, 1, 3, 3, 1),
(148, 3, 2, 1, 4, 3, 1),
(149, 3, 2, 2, 1, 2, 1),
(150, 3, 2, 2, 2, 2, 1),
(151, 3, 2, 2, 3, 3, 1),
(152, 3, 2, 2, 4, 3, 1),
(153, 3, 2, 3, 1, 2, 1),
(154, 3, 2, 3, 2, 3, 1),
(155, 3, 2, 3, 3, 3, 1),
(156, 3, 2, 3, 4, 3, 1),
(157, 3, 2, 4, 1, 3, 1),
(158, 3, 2, 4, 2, 3, 1),
(159, 3, 2, 4, 3, 4, 1),
(160, 3, 2, 4, 4, 4, 1),
(161, 3, 3, 1, 1, 3, 1),
(162, 3, 3, 1, 2, 3, 1),
(163, 3, 3, 1, 3, 3, 1),
(164, 3, 3, 1, 4, 3, 1),
(165, 3, 3, 2, 1, 3, 1),
(166, 3, 3, 2, 2, 3, 1),
(167, 3, 3, 2, 3, 3, 1),
(168, 3, 3, 2, 4, 4, 1),
(169, 3, 3, 3, 1, 3, 1),
(170, 3, 3, 3, 2, 3, 1),
(171, 3, 3, 3, 3, 3, 1),
(172, 3, 3, 3, 4, 4, 1),
(173, 3, 3, 4, 1, 3, 1),
(174, 3, 3, 4, 2, 4, 1),
(175, 3, 3, 4, 3, 4, 1),
(176, 3, 3, 4, 4, 4, 1),
(177, 3, 4, 1, 1, 3, 1),
(178, 3, 4, 1, 2, 3, 1),
(179, 3, 4, 1, 3, 3, 1),
(180, 3, 4, 1, 4, 4, 1),
(181, 3, 4, 2, 1, 3, 1),
(182, 3, 4, 2, 2, 3, 1),
(183, 3, 4, 2, 3, 4, 1),
(184, 3, 4, 2, 4, 4, 1),
(185, 3, 4, 3, 1, 3, 1),
(186, 3, 4, 3, 2, 4, 1),
(187, 3, 4, 3, 3, 4, 1),
(188, 3, 4, 3, 4, 4, 1),
(189, 3, 4, 4, 1, 4, 1),
(190, 3, 4, 4, 2, 4, 1),
(191, 3, 4, 4, 3, 4, 1),
(192, 3, 4, 4, 4, 4, 1),
(193, 4, 1, 1, 1, 2, 1),
(194, 4, 1, 1, 2, 2, 1),
(195, 4, 1, 1, 3, 3, 1),
(196, 4, 1, 1, 4, 3, 1),
(197, 4, 1, 2, 1, 2, 1),
(198, 4, 1, 2, 2, 2, 1),
(199, 4, 1, 2, 3, 3, 1),
(200, 4, 1, 2, 4, 3, 1),
(201, 4, 1, 3, 1, 2, 1),
(202, 4, 1, 3, 2, 3, 1),
(203, 4, 1, 3, 3, 3, 1),
(204, 4, 1, 3, 4, 4, 1),
(205, 4, 1, 4, 1, 3, 1),
(206, 4, 1, 4, 2, 3, 1),
(207, 4, 1, 4, 3, 4, 1),
(208, 4, 1, 4, 4, 4, 1),
(209, 4, 2, 1, 1, 2, 1),
(210, 4, 2, 1, 2, 2, 1),
(211, 4, 2, 1, 3, 3, 1),
(212, 4, 2, 1, 4, 3, 1),
(213, 4, 2, 2, 1, 2, 1),
(214, 4, 2, 2, 2, 2, 1),
(215, 4, 2, 2, 3, 3, 1),
(216, 4, 2, 2, 4, 3, 1),
(217, 4, 2, 3, 1, 3, 1),
(218, 4, 2, 3, 2, 3, 1),
(219, 4, 2, 3, 3, 3, 1),
(220, 4, 2, 3, 4, 4, 1),
(221, 4, 2, 4, 1, 3, 1),
(222, 4, 2, 4, 2, 3, 1),
(223, 4, 2, 4, 3, 4, 1),
(224, 4, 2, 4, 4, 4, 1),
(225, 4, 3, 1, 1, 2, 1),
(226, 4, 3, 1, 2, 3, 1),
(227, 4, 3, 1, 3, 3, 1),
(228, 4, 3, 1, 4, 4, 1),
(229, 4, 3, 2, 1, 3, 1),
(230, 4, 3, 2, 2, 3, 1),
(231, 4, 3, 2, 3, 4, 1),
(232, 4, 3, 2, 4, 4, 1),
(233, 4, 3, 3, 1, 3, 1),
(234, 4, 3, 3, 2, 4, 1),
(235, 4, 3, 3, 3, 4, 1),
(236, 4, 3, 3, 4, 4, 1),
(237, 4, 3, 4, 1, 3, 1),
(238, 4, 3, 4, 2, 4, 1),
(239, 4, 3, 4, 3, 4, 1),
(240, 4, 3, 4, 4, 4, 1),
(241, 4, 4, 1, 1, 3, 1),
(242, 4, 4, 1, 2, 3, 1),
(243, 4, 4, 1, 3, 3, 1),
(244, 4, 4, 1, 4, 3, 1),
(245, 4, 4, 2, 1, 3, 1),
(246, 4, 4, 2, 2, 3, 1),
(247, 4, 4, 2, 3, 4, 1),
(248, 4, 4, 2, 4, 4, 1),
(249, 4, 4, 3, 1, 4, 1),
(250, 4, 4, 3, 2, 4, 1),
(251, 4, 4, 3, 3, 4, 1),
(252, 4, 4, 3, 4, 4, 1),
(253, 4, 4, 4, 1, 4, 1),
(254, 4, 4, 4, 2, 4, 1),
(255, 4, 4, 4, 3, 4, 1),
(256, 4, 4, 4, 4, 4, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_matang`
--

CREATE TABLE `tb_matang` (
  `id_matang` int(10) NOT NULL,
  `kriteria_matang` varchar(10) NOT NULL,
  `nilai_matang` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_matang`
--

INSERT INTO `tb_matang` (`id_matang`, `kriteria_matang`, `nilai_matang`) VALUES
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
-- Table structure for table `tb_penyakit`
--

CREATE TABLE `tb_penyakit` (
  `id_penyakit` int(10) NOT NULL,
  `nama_penyakit` varchar(20) NOT NULL,
  `vaksin` varchar(20) NOT NULL,
  `status_penyakit` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_penyakit`
--

INSERT INTO `tb_penyakit` (`id_penyakit`, `nama_penyakit`, `vaksin`, `status_penyakit`) VALUES
(1, 'Ulat', 'Profenofos', 'Disetujui'),
(2, 'Trips', 'Alfametrin', 'Disetujui'),
(3, 'Aphids', 'Metamidofos', 'Disetujui'),
(4, 'Bimesia', 'Tiodikarb', 'Disetujui'),
(5, 'Kepik', 'Fentoat', 'Disetujui'),
(6, 'Karat Daun', 'Kaptan', 'Disetujui'),
(7, 'Cercospora', 'Mankozeb', 'Disetujui'),
(8, 'Anthraxnose', 'Propinep', 'Disetujui'),
(9, 'Fusarium', 'Metiltiofanat', 'Disetujui'),
(10, 'Phytium', 'Metiltiofanat', 'Disetujui'),
(11, 'Ayan', 'Oralit', 'Ditolak'),
(12, 'Humu', 'Haha', 'Ditolak'),
(13, 'Rindu', 'Mitha', 'Ditolak'),
(14, 'cacar', 'obat', 'Ditolak');

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
(4, 'Cristian', 'Sukijan', 'Laki-laki', 'Petani', 'sukijan', 'Sumenep', '67182', '087654262722', 'sukijan'),
(5, 'haris', 'sohares', 'Laki-laki', 'Petani', 'haris', 'Madura', '09876', '0987656789', 'haris');

-- --------------------------------------------------------

--
-- Table structure for table `tb_varietas`
--

CREATE TABLE `tb_varietas` (
  `id_varietas` int(10) NOT NULL,
  `kriteria_varietas` varchar(10) NOT NULL,
  `nilai_varietas` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_varietas`
--

INSERT INTO `tb_varietas` (`id_varietas`, `kriteria_varietas`, `nilai_varietas`) VALUES
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
  ADD PRIMARY KEY (`id_bobot`);

--
-- Indexes for table `tb_cacat`
--
ALTER TABLE `tb_cacat`
  ADD PRIMARY KEY (`id_cacat`);

--
-- Indexes for table `tb_kontrak`
--
ALTER TABLE `tb_kontrak`
  ADD PRIMARY KEY (`id_kontrak`),
  ADD UNIQUE KEY `petani` (`id_user`);

--
-- Indexes for table `tb_kualitas`
--
ALTER TABLE `tb_kualitas`
  ADD PRIMARY KEY (`id_kualitas`),
  ADD UNIQUE KEY `id_varietas` (`id_varietas`,`id_matang`,`id_bobot`,`id_cacat`,`id_mutu`,`id_user`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_cacat` (`id_cacat`),
  ADD KEY `id_matang` (`id_matang`),
  ADD KEY `id_mutu` (`id_mutu`),
  ADD KEY `id_bobot` (`id_bobot`);

--
-- Indexes for table `tb_matang`
--
ALTER TABLE `tb_matang`
  ADD PRIMARY KEY (`id_matang`);

--
-- Indexes for table `tb_mutu`
--
ALTER TABLE `tb_mutu`
  ADD PRIMARY KEY (`id_mutu`);

--
-- Indexes for table `tb_penyakit`
--
ALTER TABLE `tb_penyakit`
  ADD PRIMARY KEY (`id_penyakit`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `nama_depan` (`nama_depan`),
  ADD UNIQUE KEY `nama_belakang` (`nama_belakang`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `password` (`password`);

--
-- Indexes for table `tb_varietas`
--
ALTER TABLE `tb_varietas`
  ADD PRIMARY KEY (`id_varietas`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_bobot`
--
ALTER TABLE `tb_bobot`
  MODIFY `id_bobot` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `tb_cacat`
--
ALTER TABLE `tb_cacat`
  MODIFY `id_cacat` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `tb_kontrak`
--
ALTER TABLE `tb_kontrak`
  MODIFY `id_kontrak` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `tb_kualitas`
--
ALTER TABLE `tb_kualitas`
  MODIFY `id_kualitas` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=257;
--
-- AUTO_INCREMENT for table `tb_matang`
--
ALTER TABLE `tb_matang`
  MODIFY `id_matang` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `tb_mutu`
--
ALTER TABLE `tb_mutu`
  MODIFY `id_mutu` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `tb_penyakit`
--
ALTER TABLE `tb_penyakit`
  MODIFY `id_penyakit` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `id_user` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `tb_varietas`
--
ALTER TABLE `tb_varietas`
  MODIFY `id_varietas` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_kontrak`
--
ALTER TABLE `tb_kontrak`
  ADD CONSTRAINT `tb_kontrak_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `tb_user` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tb_kualitas`
--
ALTER TABLE `tb_kualitas`
  ADD CONSTRAINT `tb_kualitas_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `tb_user` (`id_user`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `tb_kualitas_ibfk_2` FOREIGN KEY (`id_varietas`) REFERENCES `tb_varietas` (`id_varietas`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `tb_kualitas_ibfk_3` FOREIGN KEY (`id_cacat`) REFERENCES `tb_cacat` (`id_cacat`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `tb_kualitas_ibfk_4` FOREIGN KEY (`id_matang`) REFERENCES `tb_matang` (`id_matang`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `tb_kualitas_ibfk_5` FOREIGN KEY (`id_mutu`) REFERENCES `tb_mutu` (`id_mutu`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `tb_kualitas_ibfk_6` FOREIGN KEY (`id_bobot`) REFERENCES `tb_bobot` (`id_bobot`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
