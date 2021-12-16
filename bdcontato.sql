-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 24-Nov-2021 às 19:00
-- Versão do servidor: 10.4.20-MariaDB
-- versão do PHP: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bdcontato`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbpessoa`
--

CREATE TABLE `tbpessoa` (
  `idPessoa` int(11) NOT NULL,
  `nomePessoa` varchar(40) DEFAULT NULL,
  `enderecoPessoa` varchar(40) DEFAULT NULL,
  `cidadePessoa` varchar(40) DEFAULT NULL,
  `estadoPessoa` varchar(40) DEFAULT NULL,
  `cepPessoa` varchar(40) DEFAULT NULL,
  `rgPessoa` varchar(40) DEFAULT NULL,
  `cpfPessoa` varchar(40) DEFAULT NULL,
  `telefonePessoa` varchar(40) DEFAULT NULL,
  `celularPessoa` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tbpessoa`
--
ALTER TABLE `tbpessoa`
  ADD PRIMARY KEY (`idPessoa`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tbpessoa`
--
ALTER TABLE `tbpessoa`
  MODIFY `idPessoa` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
