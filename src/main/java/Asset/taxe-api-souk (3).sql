-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  mar. 12 mars 2019 à 09:42
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

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

CREATE TABLE `categorie` (
  `id` bigint(20) NOT NULL,
  `reference` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `categorie`
--

INSERT INTO `categorie` (`id`, `reference`) VALUES
(0, 'categorie1');

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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

-- --------------------------------------------------------

--
-- Structure de la table `local`
--

CREATE TABLE `local` (
  `id` bigint(20) NOT NULL,
  `dernier_annee_paye` double DEFAULT NULL,
  `dernier_montant_paye` double DEFAULT NULL,
  `dernier_trimestre_paye` double DEFAULT NULL,
  `ref_proprietaire` varchar(255) DEFAULT NULL,
  `ref_redevable` varchar(255) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  `surface` double DEFAULT NULL,
  `categorie` bigint(20) DEFAULT NULL,
  `souk` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `local`
--

INSERT INTO `local` (`id`, `dernier_annee_paye`, `dernier_montant_paye`, `dernier_trimestre_paye`, `ref_proprietaire`, `ref_redevable`, `reference`, `surface`, `categorie`, `souk`) VALUES
(0, NULL, NULL, NULL, 'prop1', 'prop2', 'local1', 200, 0, 0);

-- --------------------------------------------------------

--
-- Structure de la table `souk`
--

CREATE TABLE `souk` (
  `id` bigint(20) NOT NULL,
  `ref_rue` varchar(255) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `souk`
--

INSERT INTO `souk` (`id`, `ref_rue`, `reference`) VALUES
(0, 'rue1', 'souk1');

-- --------------------------------------------------------

--
-- Structure de la table `taux_annuel`
--

CREATE TABLE `taux_annuel` (
  `id` bigint(20) NOT NULL,
  `date_debut` datetime DEFAULT NULL,
  `date_fin` datetime DEFAULT NULL,
  `majoration` double DEFAULT NULL,
  `penalite` double DEFAULT NULL,
  `pourcentage` double DEFAULT NULL,
  `categorie` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `taux_trimestriel`
--

CREATE TABLE `taux_trimestriel` (
  `id` bigint(20) NOT NULL,
  `date_debut` date DEFAULT NULL,
  `date_fin` date DEFAULT NULL,
  `majoration` double DEFAULT NULL,
  `penalite` double DEFAULT NULL,
  `pourcentage` double DEFAULT NULL,
  `categorie` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `taxe_annuelle`
--

CREATE TABLE `taxe_annuelle` (
  `id` bigint(20) NOT NULL,
  `categorie` tinyblob,
  `date_paiment` double DEFAULT NULL,
  `local` tinyblob,
  `ref_redevable` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `taxe_trimestrielle`
--

CREATE TABLE `taxe_trimestrielle` (
  `id` bigint(20) NOT NULL,
  `date_paiment` date DEFAULT NULL,
  `date_presentation` date DEFAULT NULL,
  `montant_de_base` double DEFAULT NULL,
  `montant_majoration` double DEFAULT NULL,
  `montant_penalité` double DEFAULT NULL,
  `montant_taxe` double DEFAULT NULL,
  `nb_mois_retard` int(11) NOT NULL,
  `ref_redevable` varchar(255) DEFAULT NULL,
  `local` bigint(20) DEFAULT NULL,
  `taxe_annuelle` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `categorie`
--
ALTER TABLE `categorie`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `local`
--
ALTER TABLE `local`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKt4qku07o486tix4pmcol143s4` (`categorie`),
  ADD KEY `FKp51jn901qe6de6m5o01durg7q` (`souk`);

--
-- Index pour la table `souk`
--
ALTER TABLE `souk`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `taux_annuel`
--
ALTER TABLE `taux_annuel`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKjobsdin3prwqok7xqy9qtvsn6` (`categorie`);

--
-- Index pour la table `taux_trimestriel`
--
ALTER TABLE `taux_trimestriel`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK8je0q0g592fwq6dxn1a6fm027` (`categorie`);

--
-- Index pour la table `taxe_annuelle`
--
ALTER TABLE `taxe_annuelle`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `taxe_trimestrielle`
--
ALTER TABLE `taxe_trimestrielle`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKs48yskm17lbj8j36gcmqp2st3` (`local`),
  ADD KEY `FKfa7ghv31lradc7d3rb2mpdlh2` (`taxe_annuelle`);
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
