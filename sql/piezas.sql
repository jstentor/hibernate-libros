CREATE TABLE `piezas` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pieza` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `compositor` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3774 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
