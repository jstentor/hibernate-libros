CREATE TABLE `musicos` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nombre_completo` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `fecha_nac` date DEFAULT NULL,
  `instrumento` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estilos` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `comentario` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `biografia` text COLLATE utf8mb4_unicode_ci,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `musicos_nombre_index` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=3835 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
