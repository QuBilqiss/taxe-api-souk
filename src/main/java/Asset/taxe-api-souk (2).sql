-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  mar. 12 mars 2019 à 09:41
-- Version du serveur :  10.1.36-MariaDB
-- Version de PHP :  7.2.11

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `taxe-api-souk`
--

--
-- Déchargement des données de la table `categorie`
--

INSERT INTO `categorie` (`id`, `reference`) VALUES
(0, 'categorie1');

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1),
(1),
(1),
(1),
(1),
(1);

--
-- Déchargement des données de la table `local`
--

INSERT INTO `local` (`id`, `dernier_annee_paye`, `dernier_montant_paye`, `dernier_trimestre_paye`, `ref_proprietaire`, `ref_redevable`, `reference`, `surface`, `categorie`, `souk`) VALUES
(0, NULL, NULL, NULL, 'prop1', 'prop2', 'local1', 200, 0, 0);

--
-- Déchargement des données de la table `souk`
--

INSERT INTO `souk` (`id`, `ref_rue`, `reference`) VALUES
(0, 'rue1', 'souk1');
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
