CREATE TABLE `discos_piezas` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `disco_id` int(10) unsigned NOT NULL,
  `pieza_id` int(10) unsigned NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `discos_piezas_disco_id_index` (`disco_id`),
  KEY `discos_piezas_pieza_id_index` (`pieza_id`),
  CONSTRAINT `discos_piezas_disco_id_foreign` FOREIGN KEY (`disco_id`) REFERENCES `discos` (`id`),
  CONSTRAINT `discos_piezas_pieza_id_foreign` FOREIGN KEY (`pieza_id`) REFERENCES `piezas` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4667 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
