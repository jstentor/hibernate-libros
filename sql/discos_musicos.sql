CREATE TABLE `discos_musicos` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `disco_id` int(10) unsigned NOT NULL,
  `musico_id` int(10) unsigned NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `discos_musicos_disco_id_index` (`disco_id`),
  KEY `discos_musicos_musico_id_index` (`musico_id`),
  CONSTRAINT `discos_musicos_disco_id_foreign` FOREIGN KEY (`disco_id`) REFERENCES `discos` (`id`),
  CONSTRAINT `discos_musicos_musico_id_foreign` FOREIGN KEY (`musico_id`) REFERENCES `musicos` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5349 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
