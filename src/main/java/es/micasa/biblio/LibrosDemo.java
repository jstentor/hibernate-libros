package es.micasa.biblio;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import es.micasa.biblio.model.Autor;
import es.micasa.biblio.model.Libro;

public class LibrosDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
				.configure("/hibernate.cfg.xml")
				.addAnnotatedClass(Autor.class)
				.addAnnotatedClass(Libro.class)
				.buildSessionFactory();
		
		// create a session
		Session session = factory.getCurrentSession();

		try {
			
			// start a transaction
			session.beginTransaction();

			// Autor
			int theId = 3;
			Autor elAutor = session.get(Autor.class, theId);
			System.out.println("Autor: " + elAutor);

			// Libro
			theId = 1888;
			Libro elLibro = session.get(Libro.class, theId);
			System.out.println("Libro: " + elLibro);
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("¡Listo!");
		}  finally {
			session.close();
			factory.close();
		}
	}

}
