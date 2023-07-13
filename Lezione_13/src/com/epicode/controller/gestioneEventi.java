package com.epicode.controller;

import java.time.LocalDate;
import java.util.Date;

import com.epicode.Model.Evento;
import com.epicode.Model.EventoDAO;
import com.epicode.Model.tipoEvento;

public class gestioneEventi {

	public static void main(String[] args) {
		
	}
	private static Evento saveEvento() {
		Evento ev = new Evento();
		ev.setDataEvento(new Date());
		ev.setTitolo("Partita");
		ev.setDescrizione("Finale di coppa");
		ev.setNumeroMassimoPartecipanti(10);
		ev.setTipoEvento(tipoEvento.PUBBLICO);
		
		EventoDAO evDao = new EventoDAO();
		evDao.save(ev);
		return ev;
	}
}
