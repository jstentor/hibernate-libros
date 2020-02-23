CREATE TABLE `discos` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `autor` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `titulo` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `coleccion` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estilo` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `localizacion` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `interpretes` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `formato` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `calificacion` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `volumenes` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `anio_grabacion` int(11) DEFAULT NULL,
  `anio_edicion` int(11) DEFAULT NULL,
  `sello` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `productor` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `caratula` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  
  PRIMARY KEY (`id`),
  
  KEY `discos_autor_index` (`autor`),
  KEY `discos_titulo_index` (`titulo`)
  
) ENGINE=InnoDB AUTO_INCREMENT=1141 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
SELECT * FROM lbiblio.libros;