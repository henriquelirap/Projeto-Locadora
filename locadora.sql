-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 10-Dez-2021 às 20:42
-- Versão do servidor: 10.4.21-MariaDB
-- versão do PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `locadora`
--

CREATE DATABASE IF NOT EXISTS `locadora` 
DEFAULT CHARSET=utf8mb4;
USE `locadora`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `caixa`
--

CREATE TABLE `caixa` (
  `data` varchar(30) NOT NULL,
  `locacao_id` int(11) NOT NULL,
  `cliente_id` int(11) NOT NULL,
  `nome_cliente` varchar(50) NOT NULL,
  `dinheiro` varchar(20) DEFAULT NULL,
  `cartao` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `caixa`
--

INSERT INTO `caixa` (`data`, `locacao_id`, `cliente_id`, `nome_cliente`, `dinheiro`, `cartao`) VALUES
('10-12-2021', 29, 17, 'Marcos Luan Calebe Figueiredo', '1000', NULL),
('10-12-2021', 41, 17, 'Marcos Luan Calebe Figueiredo', NULL, '500'),
('10-12-2021', 42, 17, 'Marcos Luan Calebe Figueiredo', NULL, '500'),
('10-12-2021', 43, 13, 'Marlon da Silva', NULL, '300'),
('10-12-2021', 45, 13, 'Marlon da Silva', '1000.0', NULL),
('10-12-2021', 46, 13, 'Marlon da Silva', NULL, '600.0'),
('10-12-2021', 47, 13, 'Marlon da Silva', '300.0', NULL),
('09-12-2021', 35, 15, 'Isabela Rosa Duarte', '300', NULL),
('09-12-2021', 34, 15, 'Isabela Rosa Duarte', NULL, '500'),
('10-12-2021', 51, 13, 'Marlon da Silva', '150.0', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `cliente_id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `rg` varchar(20) DEFAULT NULL,
  `rua` varchar(40) DEFAULT NULL,
  `numero_residencia` int(10) UNSIGNED DEFAULT NULL,
  `complemento` varchar(30) DEFAULT NULL,
  `bairro` varchar(40) DEFAULT NULL,
  `cep` varchar(15) DEFAULT NULL,
  `cidade` varchar(40) NOT NULL,
  `estado` varchar(30) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `senha` varchar(50) NOT NULL,
  `email` varchar(60) NOT NULL,
  `nivel` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`cliente_id`, `nome`, `telefone`, `cpf`, `rg`, `rua`, `numero_residencia`, `complemento`, `bairro`, `cep`, `cidade`, `estado`, `usuario`, `senha`, `email`, `nivel`) VALUES
(13, 'Marlon da Silva', '(45)98405-3785', 'Teste', '12345', 'General Rondon', 1010, 'Apto 01', 'Centro', '85901000', 'Toledo', 'Paraná (PR)', 'cli', '123', 'henriquelirapavao@hotmail.com', 'Cliente'),
(14, 'Vitor Sebastião César Rocha', '(65) 99372-5480', '361.773.232-19', '12.435.185-2', 'Rua Nossa Senhora do Carmo', 524, '', 'São Matheus', '78152-060', 'Várzea Grande', 'Mato Grosso (MT)', '36177323219', '123', 'vitorsebastiaocesarrocha@hotmail.com', 'Cliente'),
(15, 'Isabela Rosa Duarte', '(27) 98349-5711', '156.971.362-69', '24.806.976-7', 'Rua Presidente Vargas', 784, 'Apto 209 ', 'Santa Cruz', '29199-506', 'Aracruz', 'Espírito Santo (ES)', '15697136269', '123', 'isabelarosaduarte@hotmail.com', 'Cliente'),
(16, 'Felipe Bernardo Renato da Rosa', '(79) 99172-6733', '677.073.894-50', '49.288.081-5', 'Rua C', 640, 'Casa dos Fundos', 'Zona de Expansão (Aruana)', '49001081', 'Aracaju', 'Sergipe (SE)', '67707389450', '123', 'felipebernardorenatodarosa@hotmail.com', 'Cliente'),
(17, 'Marcos Luan Calebe Figueiredo', '(21) 99230-1323', '304.120.854-70', '12.566.642-1', 'Rua Setenta e Quatro', 635, 'Condominio Porto Belo', 'Campo Grande', '23097495', 'Rio de Janeiro', 'Rio de Janeiro (RJ)', '30412085470', '123', 'marcosluancalebefigueiredo@hotmail.com', 'Cliente'),
(18, 'Benício Raimundo da Cunha', '(85) 99288-4091', '886.899.036-90', '34.722.833-1', 'Rua 18', 464, 'Apto 1', 'Jangurussu', '60876452', 'Fortaleza', 'Ceará (CE)', '88689903690', '123', 'benicioraimundodacunha@hotmail.com', 'Cliente'),
(19, 'Anderson Severino Rodrigues', '(69) 98233-7060', '356.230.221-54', '21.409.289-6', 'Rua Recife', 748, 'Casa Amarela', 'Setor 03', '76870490', 'Ariquemes', 'Rondônia (RO)', '35623022154', '123', 'andersonseverinorodrigues@hotmail.com', 'Cliente'),
(20, 'Yago Diego Calebe Silva', '(81) 98784-1311', '504.941.901-83', '10.930.521-8', 'Rua Cristóvão Colombo', 425, '', 'Morro do Bom Jesus', '55008290', 'Caruaru', 'Pernambuco (PE)', '50494190183', '123', 'yagodiegocalebesilva@hotmail.com', 'Cliente'),
(22, 'Bruna Melissa Andreia Nunes', '(42) 99718-2368', '863.026.045-91', '18.165.607-3', 'Rua Assunção', 854, 'Fundos', 'Santana', '85070470', 'Guarapuava', 'Paraná (PR)', '86302604591', '123', 'brunamelissaandreianunes@hotmail.com', 'Cliente'),
(23, 'Bárbara Adriana Melissa Sales', '(51) 99542-0074', '605.787.156-19', '42.231.748-2', 'Praça São Geraldo', 107, '', 'São Geraldo', '90230280', 'Porto Alegre', 'Rio Grande do Sul (RS)', '60578715619', '123', 'barbaraadrianamelissasales@hotmail.com', 'Cliente');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `funcionario_id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `senha` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  `nivel` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`funcionario_id`, `nome`, `telefone`, `cpf`, `usuario`, `senha`, `email`, `nivel`) VALUES
(1, 'hen', '45984053785', '1234', 'adm', '123', '123@hotmail.com', 'Admin'),
(2, 'henrique ', '45984053710', '123', 'fun', '123', '123@hotmail.com', 'Funcionário'),
(7, 'Laura Rayssa Giovana Moreira', '(45) 99142-6188', '706.473.989-58', '70647398958', '123', 'laurarayssagiovanamoreira@hotmail.com', 'Funcionário'),
(8, 'André Pietro Benedito Porto', '(66) 98655-5981', '979.131.024-62', '97913102462', '123', 'andrepietrobeneditoporto@hotmail.com', 'Funcionário'),
(9, 'Francisca Alessandra Mendes', '(45) 99789-9555', '925.485.200-72', '92548520072', '123', 'franciscaalessandramendes@hotmail.com', 'Funcionário'),
(10, 'Luiza Marcela Brito', '(45) 99924-6540', '295.184.630-42', '29518463042', '123', 'lluizamarcelabrito@hotmail.com', 'Funcionário'),
(11, 'Cauê Diogo Rocha', '(45) 98332-0552', '071.317.867-13', '07131786713', '123', 'cauediogorocha2@hotmail.com', 'Funcionário');

-- --------------------------------------------------------

--
-- Estrutura da tabela `locacao`
--

CREATE TABLE `locacao` (
  `locacao_id` int(11) NOT NULL,
  `cliente_id` int(11) NOT NULL,
  `nome_cliente` varchar(50) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `veiculo_id` int(11) NOT NULL,
  `nome_veiculo` varchar(30) NOT NULL,
  `valor_diaria` double NOT NULL,
  `data_locacao` varchar(30) NOT NULL,
  `data_devolucao` varchar(30) NOT NULL,
  `valor_total` double NOT NULL,
  `pagamento` varchar(30) DEFAULT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `locacao`
--

INSERT INTO `locacao` (`locacao_id`, `cliente_id`, `nome_cliente`, `usuario`, `veiculo_id`, `nome_veiculo`, `valor_diaria`, `data_locacao`, `data_devolucao`, `valor_total`, `pagamento`, `status`) VALUES
(29, 17, 'Marcos Luan Calebe Figueiredo', '30412085470', 12, 'S10 ', 500, '09-12-2021', '10-12-2021', 1000, 'Dinheiro', 'Finalizado'),
(34, 15, 'Isabela Rosa Duarte', '15697136269', 12, 'S10 ', 500, '09-12-2021', '09-12-2021', 500, 'Cartao', 'Finalizado'),
(35, 15, 'Isabela Rosa Duarte', '15697136269', 10, 'Cerato ', 300, '09-12-2021', '09-12-2021', 300, 'Dinheiro', 'Finalizado'),
(37, 13, 'Marlon da Silva', 'cli', 11, 'Fiesta', 150, '09-12-2021', '10-12-2021', 300, 'Dinheiro', 'Finalizado'),
(38, 13, 'Marlon da Silva', 'cli', 10, 'Cerato ', 300, '09-12-2021', '10-12-2021', 600, 'Cartao', 'Finalizado'),
(39, 13, 'Marlon da Silva', 'cli', 13, 'A4', 500, '09-12-2021', '10-12-2021', 1000, 'Dinheiro', 'Finalizado'),
(40, 13, 'Marlon da Silva', 'cli', 10, 'Cerato ', 300, '10-12-2021', '10-12-2021', 300, 'Cartao', 'Finalizado'),
(41, 17, 'Marcos Luan Calebe Figueiredo', '30412085470', 12, 'S10 ', 500, '10-12-2021', '10-12-2021', 500, 'Cartao', 'Finalizado'),
(42, 17, 'Marcos Luan Calebe Figueiredo', '30412085470', 12, 'S10 ', 500, '10-12-2021', '10-12-2021', 500, 'Cartao', 'Finalizado'),
(51, 13, 'Marlon da Silva', 'cli', 11, 'Fiesta', 150, '10-12-2021', '10-12-2021', 150, 'Dinheiro', 'Finalizado');

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculos`
--

CREATE TABLE `veiculos` (
  `veiculo_id` int(11) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `ano` varchar(20) NOT NULL,
  `marca` varchar(25) NOT NULL,
  `valor_diaria` double NOT NULL,
  `status` varchar(30) NOT NULL,
  `cliente_em_posse` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `veiculos`
--

INSERT INTO `veiculos` (`veiculo_id`, `nome`, `modelo`, `ano`, `marca`, `valor_diaria`, `status`, `cliente_em_posse`) VALUES
(8, 'HB20', 'LX 1.6', '2020', 'Hyundai', 400, 'Disponível', ''),
(9, 'C4 LOUNGE', 'Exclusive 1.6 Turbo 4p Aut.', '2014', 'Citroen', 300, 'Disponível', ''),
(10, 'Cerato ', '1.6 16V  Flex  Aut.', '2013', 'Kia Motors', 300, 'Disponível', ''),
(11, 'Fiesta', 'Sed. Personnalit 1.4', '2005', 'Ford', 150, 'Disponível', ''),
(12, 'S10 ', 'H.Country 2.8 4x4 CD Dies.Aut', '2016', 'GM - Chevrolet', 500, 'Disponível', ''),
(13, 'A4', '2.0 16V TFSI Quattro Stronic', '2013', 'Audi', 500, 'Disponível', '');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cliente_id`),
  ADD UNIQUE KEY `cpf` (`cpf`),
  ADD UNIQUE KEY `usuario` (`usuario`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`funcionario_id`),
  ADD UNIQUE KEY `cpf` (`cpf`),
  ADD UNIQUE KEY `usuario` (`usuario`);

--
-- Índices para tabela `locacao`
--
ALTER TABLE `locacao`
  ADD PRIMARY KEY (`locacao_id`);

--
-- Índices para tabela `veiculos`
--
ALTER TABLE `veiculos`
  ADD PRIMARY KEY (`veiculo_id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `cliente_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `funcionario_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de tabela `locacao`
--
ALTER TABLE `locacao`
  MODIFY `locacao_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT de tabela `veiculos`
--
ALTER TABLE `veiculos`
  MODIFY `veiculo_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
