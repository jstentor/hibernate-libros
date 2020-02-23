CREATE TABLE `autores_libros` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `autor_id` int(10) unsigned NOT NULL,
  `libro_id` int(10) unsigned NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  
  PRIMARY KEY (`id`),
  
  KEY `autores_libros_autor_id_index` (`autor_id`),
  KEY `autores_libros_libro_id_index` (`libro_id`),
  
  CONSTRAINT `autores_libros_autor_id_foreign` 
  FOREIGN KEY (`autor_id`) 
  REFERENCES `autores` (`id`)
  ON DELETE NO ACTION ON UPDATE NO ACTION,
  
  CONSTRAINT `autores_libros_libro_id_foreign` 
  FOREIGN KEY (`libro_id`) 
  REFERENCES `libros` (`id`)
  ON DELETE NO ACTION ON UPDATE NO ACTION
  
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


