-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Jul 22, 2019 at 12:27 AM
-- Server version: 5.7.23
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `wonka`
--

-- --------------------------------------------------------

--
-- Table structure for table `oompaloompas`
--

CREATE TABLE `oompaloompas` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `job` varchar(50) NOT NULL,
  `height` float DEFAULT NULL,
  `weight` float DEFAULT NULL,
  `Description` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `oompaloompas`
--

INSERT INTO `oompaloompas` (`id`, `name`, `age`, `job`, `height`, `weight`, `Description`) VALUES
(1, 'Papa Oompa Loompa', 163, 'El jefe', 20, 40, 'Es el jefe de los Oompa Loompas, su mision es coordinar la produccion de chocolatinas'),
(2, 'Torpe', 13, 'Transportista', 20, 29, 'Es el Oompa Loompa destinado a transportar los envases de vidrio, la mayoria suelen romperse'),
(3, 'Gruñon', 23, 'Revisor', 20, 49, 'Es el encargado de revisar la produccion de chocolate es correcta, aunque siempre se queja por todo'),
(4, 'Fortachon', 25, 'Chocolatero', 20, 63, 'Se dedica a mezclar chocolate las 24 horas del dia'),
(5, 'Gloton', 17, 'Control de calidad', 20, 150, 'Se encarga de verificar la calidad del producto, el pobre tiene un poco de sobrepeso');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `oompaloompas`
--
ALTER TABLE `oompaloompas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `oompaloompas`
--
ALTER TABLE `oompaloompas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
