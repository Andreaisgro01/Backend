package com.models;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.models.Autore;
import com.models.Libro;

public class AutoreDaO {
   
	private final EntityManager em;

	public AutoreDaO(EntityManager em) {
		this.em = em;
	}
	
	public void save( Autore ed) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(ed);
		transaction.commit(); 
	}
	
	public void removeFromISBN(long isbn) {
		Autore foundPubblicazione = em.find(Autore.class, isbn);
		if(foundPubblicazione != null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.remove(foundPubblicazione);
			transaction.commit();
			System.out.println("Pubblicazione" + isbn + "eliminata da database");
		}else {
			System.out.println("Could not delete a non-existent pubblicazione");
		}
	}
	
	public Autore searchByISBN(Long isbn){
		Query q = em.createNamedQuery("searchByISBN");
		q.setParameter("isbn", isbn);
		return (Autore) q.getSingleResult();
	}
	
	public List<Autore> searchByYear(Integer annoPubblicazione) {
		Query query = em.createNamedQuery("searchByYear");
		query.setParameter("annoPubblicazione", annoPubblicazione);
		return query.getResultList();
	}
	
	public List <Autore> searchByTitle(String titolo) {
		Query query = em.createNamedQuery("searchByTitle");
		query.setParameter("titolo", titolo);
		return (List<Autore>) query.getResultList();
	}
	
	public List<Libro> searchByAuthor(String autore) {
		Query query = em.createNamedQuery("searchByAuthor");
		query.setParameter("autore", autore);
		return query.getResultList();
	}
}