package com.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Rivista extends Autore{
	
   @Enumerated(EnumType.STRING)	
   private Periodicita periodicita;

   public Rivista() {
	  super();
	  // TODO Auto-generated constructor stub
   }

   public Rivista(String titolo,Integer annoPubblicazione, 
		          Integer pagine , Periodicita periodicita) {
	  super( titolo, annoPubblicazione,pagine );
	  this.periodicita = periodicita;
   }
      
   public Periodicita getPeriodicita() {
	   return periodicita;
   }

   public void setPeriodicita(Periodicita periodicita) {
	  this.periodicita = periodicita;
   }

@Override
   public String toString() {
	     return "Rivista [ " + super.toString()+ " periodicita=" + periodicita + "]";
   }
   
   
   
   
   
}