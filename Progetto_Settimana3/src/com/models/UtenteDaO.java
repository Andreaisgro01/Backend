package com.models;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.models.Autore;
import com.models.Utente;

public class UtenteDaO {
	
	private final EntityManager em;
	

	public UtenteDaO (EntityManager em) {
		super();
		this.em = em;
	}

	public void save( Utente u) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(u);
		transaction.commit(); 
		System.out.println("Utente Salvato");
	}

}
