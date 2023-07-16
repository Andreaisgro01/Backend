package com.models;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "prestiti")
@NamedQuery(name = "findActiveByCode", query = "SELECT p.elementoPrestato FROM Prestito p JOIN p.utente u WHERE u.cartaId = :cartaId AND p.dataRestituzioneEffettiva IS NULL")
@NamedQuery(name = "findLateActive", query = "SELECT p.elementoPrestato FROM Prestito p WHERE p.dataRestituzionePrevista < p.dataRestituzioneEffettiva")
public class Prestito {
	
	@Id
	@GeneratedValue
    private Integer idPrestito;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Utente utente;
	@ManyToOne(cascade = CascadeType.ALL)
	private Autore elementoPrestato;
	
	private LocalDate dataInizioPrestito;
	private LocalDate dataRestituzionePrevista; 
	private LocalDate dataRestituzioneEffettiva;
	
	public Prestito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prestito(Utente utente, Autore elementoPrestato, LocalDate dataInizioPrestito,
			LocalDate dataRestituzionePrevista, LocalDate dataRestituzioneEffettiva) {
		super();
		this.utente = utente;
		this.elementoPrestato = elementoPrestato;
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataRestituzionePrevista = dataInizioPrestito.plusDays(30);
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
   }
}

	

	