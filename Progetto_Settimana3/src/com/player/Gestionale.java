package com.player;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.models.AutoreDaO;
import com.models.UtenteDaO;
import com.models.Autore;
import com.models.Libro;
import com.models.Periodicita;
import com.models.Rivista;
import com.models.Utente;
import com.utils.Jpa_Utils;


public class Gestionale {
	
private static EntityManagerFactory emf = Jpa_Utils.getEntityManagerFactory();
	
public static void main(String[] args) {
	
	EntityManager em = emf.createEntityManager();
	
	AutoreDaO ed = new AutoreDaO(em);
	UtenteDaO ud = new UtenteDaO(em);		
    
	Utente utente1 = new Utente("Marco", "Rossi", LocalDate.of(2001, 12, 02));
	Utente utente2 = new Utente("Luca", "Verdi", LocalDate.of(1987, 2, 13));
	Utente utente3 = new Utente("Salvatore", "Mele", LocalDate.of(1988, 11, 07));
	
	Libro libro1 = new Libro("Il silenzio degli innocenti", 1994, 522, " Thomas Harris", "Thriller");
    Libro libro2 = new Libro("Harry Potter e la pietra filosofale", 1997, 645, "J. K. Rowling'", "Fantasy");
	Libro libro3 = new Libro("L'arte della guerra ", 2002, 297, "Michael Cordley", "Drammatico");
	Libro libro4 = new Libro("Lo Hobbit", 1937 , 859, " J.R.R. Tolkien", "Fantasy");
	
	
	Rivista rivista1 = new Rivista("Vanity Fair", 2023, 40, Periodicita.MENSILE);
	Rivista rivista2 = new Rivista("La gazzetta dello sport", 2023, 250, Periodicita.MENSILE);
	Rivista rivista3 = new Rivista("Focus", 2023, 36, Periodicita.SETTIMANALE);

					
	
	/*
    ed.save(libro1);
	ed.save(libro2);
	ed.save(libro3);
    ed.save(libro4);
  
   
    ed.save(rivista1);
    ed.save(rivista2);
	ed.save(rivista3);
	
	
	
	ud.save(utente1);
    ud.save(utente2);
	ud.save(utente3);
	
	*/
	
	
     ed.removeFromISBN(1);
	
	/*
	Autore a = ed.searchByISBN(8L);
	System.out.println(a);
	System.out.println("Il libro cercato per ISBN è: " + ed.searchByISBN(8L));
	*/

	//List<Libro> listaAutore = ed.searchByAuthor("J. K. Rowling");
	//listaAutore.forEach( a -> System.out.println(a));
	
	
	/*
	List<Autore> listaTitolo = ed.searchByTitle("Harry Potter e la pietra filosofale");
    listaTitolo.forEach( a -> System.out.println(a));
    ("Il libro è: " + ed.searchByTitle("Harry Potter e la pietra filosofale").toString());
	*/
	
    /*
 	List<Autore> listaAnno = ed.searchByYear(2019);
 	listaAnno.forEach( a -> System.out.println(a));
 	System.out.println("Il libro cercato per anno è: " + ed.searchByYear(2023).toString());
 	*/
	
	/*
	List<Autore> listaScad = pd.getLateActive();
    listaScad.forEach( a -> System.out.println(a));
	*/
	
	em.close();
	emf.close();
   

	
   }

}