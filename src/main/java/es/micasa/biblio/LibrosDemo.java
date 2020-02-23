package es.micasa.biblio;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import es.micasa.biblio.model.Autor;
import es.micasa.biblio.model.Libro;
import es.micasa.biblio.model.Tema;

public class LibrosDemo {

	public static void main(String[] args) {
		
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

			// Libro
			theId = 1888;
			Libro elLibro = session.get(Libro.class, theId);
			System.out.println("\nLibro: " + elLibro);
			
			// Tema
			theId = 5;
			Tema elTema = session.get(Tema.class, theId);
			System.out.println("\nTema: " + elTema);
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("¡Listo!");
		}  finally {
			session.close();
			factory.close();
		}
	}

}
