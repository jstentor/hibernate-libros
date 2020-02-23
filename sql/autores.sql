CREATE TABLE `zautores` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apellidos` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `autores_ape_nom_index` (`apellidos`, `nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=1314 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
