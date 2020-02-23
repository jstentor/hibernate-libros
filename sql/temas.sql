CREATE TABLE `temas` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tema` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `parent_id` int(10) unsigned DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `temas_parent_id_foreign` (`parent_id`),
  CONSTRAINT `temas_parent_id_foreign` FOREIGN KEY (`parent_id`) REFERENCES `temas` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=144 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
