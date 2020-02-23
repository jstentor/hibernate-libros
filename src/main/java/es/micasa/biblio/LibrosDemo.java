package es.micasa.biblio;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jboss.logging.Logger;

import es.micasa.biblio.libros.model.Autor;
import es.micasa.biblio.libros.model.Libro;
import es.micasa.biblio.libros.model.Tema;

public class LibrosDemo {

	public static void main(String[] args) {
		
		final Logger logger = Logger.getLogger(LibrosDemo.class);
		// create session factory
		SessionFactory factory = new Configuration()
				.configure("/hibernate.cfg.xml")
				.addAnnotatedClass(Autor.class)
				.addAnnotatedClass(Libro.class)
				.addAnnotatedClass(Tema.class)
				.buildSessionFactory();
		
		// create a session
		Session session = factory.getCurrentSession();

		try {
			
			// start a transaction
			session.beginTransaction();

			// Autor
			int theId = 3;
			Autor elAutor = session.get(Autor.class, theId);
			System.out.println("\nAutor: " + elAutor);
			System.out.println("Libros: " + elAutor.getLibros());

			// Libro
			theId = 1888;
			Libro elLibro = session.get(Libro.class, theId);
			System.out.println("\nLibro: " + elLibro);
			System.out.println("Autores: " + elLibro.getAutores());
			
			// Tema
			theId = 88;
			Tema elTema = session.get(Tema.class, theId);
			System.out.println("\nTema: " + elTema);
			System.out.println("Libros del Tema: " + elTema.getLibros());
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("\n¡Listo!");
		}  finally {
			session.close();
			factory.close();
		}
	}

}
