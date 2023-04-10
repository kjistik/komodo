-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 10, 2023 at 02:04 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Database: `komodo_test`
--

-- --------------------------------------------------------

--
-- Table structure for table `clients`
--

CREATE TABLE `clients` (
  `id_clients` bigint(20) NOT NULL,
  `active` bit(1) DEFAULT NULL,
  `client_address` varchar(255) DEFAULT NULL,
  `client_city` varchar(255) DEFAULT NULL,
  `client_lastName` varchar(255) DEFAULT NULL,
  `client_mail` varchar(255) DEFAULT NULL,
  `client_name` varchar(255) DEFAULT NULL,
  `client_phone` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `clients`
--

INSERT INTO `clients` (`id_clients`, `active`, `client_address`, `client_city`, `client_lastName`, `client_mail`, `client_name`, `client_phone`) VALUES
(1, b'1', 'Calle 123', 'Los Quirquinchos', 'Coronel', 'client@example.com', 'Martín', 3462698422);

-- --------------------------------------------------------

--
-- Table structure for table `movement`
--

CREATE TABLE `movement` (
  `id_movement` bigint(20) NOT NULL,
  `confirmed` bit(1) DEFAULT NULL,
  `current_ppu` float DEFAULT NULL,
  `movement_date` date DEFAULT NULL,
  `movement_value` float DEFAULT NULL,
  `movement_product` bigint(20) DEFAULT NULL,
  `order_backlog` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `movement`
--

INSERT INTO `movement` (`id_movement`, `confirmed`, `current_ppu`, `movement_date`, `movement_value`, `movement_product`, `order_backlog`) VALUES
(1, b'1', 650, '2023-04-05', 1300, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `order_backlog`
--

CREATE TABLE `order_backlog` (
  `id_order` bigint(20) NOT NULL,
  `order_date` date DEFAULT NULL,
  `order_total_value` float DEFAULT NULL,
  `order_clients` bigint(20) DEFAULT NULL,
  `order_provider` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `order_backlog`
--

INSERT INTO `order_backlog` (`id_order`, `order_date`, `order_total_value`, `order_clients`, `order_provider`) VALUES
(1, '2023-04-06', NULL, 1, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id_product` bigint(20) NOT NULL,
  `active` bit(1) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `product_ppu` float DEFAULT NULL,
  `product_quantity` int(11) DEFAULT NULL,
  `product_unit` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id_product`, `active`, `product_name`, `product_ppu`, `product_quantity`, `product_unit`) VALUES
(1, b'1', 'Product A', 650, 100, 3);

-- --------------------------------------------------------

--
-- Table structure for table `provider`
--

CREATE TABLE `provider` (
  `id_provider` bigint(20) NOT NULL,
  `active` bit(1) DEFAULT NULL,
  `provider_address` varchar(255) DEFAULT NULL,
  `provider_city` varchar(255) DEFAULT NULL,
  `provider_mail` varchar(255) DEFAULT NULL,
  `provider_name` varchar(255) DEFAULT NULL,
  `provider_phone` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `provider`
--

INSERT INTO `provider` (`id_provider`, `active`, `provider_address`, `provider_city`, `provider_mail`, `provider_name`, `provider_phone`) VALUES
(1, b'1', 'Calle 456', 'Venado Tuerto', 'provider@example.com', 'Gecko', 3462698422);

-- --------------------------------------------------------

--
-- Table structure for table `units`
--

CREATE TABLE `units` (
  `id_units` bigint(20) NOT NULL,
  `unitsName` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `units`
--

INSERT INTO `units` (`id_units`, `unitsName`) VALUES
(1, 'l'),
(2, 'kg'),
(3, 'unidades');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`id_clients`);

--
-- Indexes for table `movement`
--
ALTER TABLE `movement`
  ADD PRIMARY KEY (`id_movement`),
  ADD KEY `FKtealftj4ft8t5w1lr9pcahak7` (`movement_product`),
  ADD KEY `FK7lt6ftk2wwxqioh26gcxlfddx` (`order_backlog`);

--
-- Indexes for table `order_backlog`
--
ALTER TABLE `order_backlog`
  ADD PRIMARY KEY (`id_order`),
  ADD KEY `FK2594vhgdihlxork8hjd5sfxd4` (`order_clients`),
  ADD KEY `FKc87n51tde4yw3bpx1i1g0y8kq` (`order_provider`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id_product`),
  ADD KEY `FK8ciqlnqmvfkc856vkjrhlrm71` (`product_unit`);

--
-- Indexes for table `provider`
--
ALTER TABLE `provider`
  ADD PRIMARY KEY (`id_provider`);

--
-- Indexes for table `units`
--
ALTER TABLE `units`
  ADD PRIMARY KEY (`id_units`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clients`
--
ALTER TABLE `clients`
  MODIFY `id_clients` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `movement`
--
ALTER TABLE `movement`
  MODIFY `id_movement` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `order_backlog`
--
ALTER TABLE `order_backlog`
  MODIFY `id_order` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id_product` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `provider`
--
ALTER TABLE `provider`
  MODIFY `id_provider` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `units`
--
ALTER TABLE `units`
  MODIFY `id_units` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `movement`
--
ALTER TABLE `movement`
  ADD CONSTRAINT `FK7lt6ftk2wwxqioh26gcxlfddx` FOREIGN KEY (`order_backlog`) REFERENCES `order_backlog` (`id_order`),
  ADD CONSTRAINT `FKtealftj4ft8t5w1lr9pcahak7` FOREIGN KEY (`movement_product`) REFERENCES `products` (`id_product`);

--
-- Constraints for table `order_backlog`
--
ALTER TABLE `order_backlog`
  ADD CONSTRAINT `FK2594vhgdihlxork8hjd5sfxd4` FOREIGN KEY (`order_clients`) REFERENCES `clients` (`id_clients`),
  ADD CONSTRAINT `FKc87n51tde4yw3bpx1i1g0y8kq` FOREIGN KEY (`order_provider`) REFERENCES `provider` (`id_provider`);

--
-- Constraints for table `products`
--
ALTER TABLE `products`
  ADD CONSTRAINT `FK8ciqlnqmvfkc856vkjrhlrm71` FOREIGN KEY (`product_unit`) REFERENCES `units` (`id_units`);
COMMIT;
