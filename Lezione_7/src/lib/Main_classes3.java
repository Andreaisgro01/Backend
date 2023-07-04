package lib;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main_classes3 {
	private static Map<String, String> rubrica = new HashMap<String,String>(); 
	
	public static void main(String[] args) throws Exception {
		try {
		aggiungiContatto("Mario","345 653 7542");
		aggiungiContatto("Sara", "443 653 7682");
		aggiungiContatto("Lucia","345 677 3242");
		
		}
	 }
	// inserimento di una coppia <nome,telefono>
	public static void aggiungiContatto(String nome, String telefono) throws Exception {
		rubrica.put(nome, telefono);
		if(rubrica.containsKey(nome)) {
			throw new Exception ("Chiave gia presente in rubrica!!");
		} else {
			rubrica.put(nome, telefono);
		}
	}
	// cancellazione di una coppia <nome,telefono> partendo dal nome
	public void eliminaContatto(String nome) throws Exception {
		if (rubrica.containsKey(nome)){
			rubrica.remove(nome);
		} else {
			throw new Exception ("Chiave NON presente in rubrica!!");
		}
	}
	// trova numero di telefono dal nome
	public String trovaContatto(String nome) {
		return rubrica.get(nome);
	}
	
	public String ricercaContattoDaNumero(String numero) {
		Set<String> key = rubrica.keySet();
		for (String k : key) {
			if (numero.equals(rubrica.get(k)));
			return k;	
		}
		return null;
		
		
	}
	
	// stampa tutti contatti con nome e numero
	
	public String stampaContatti() {
		System.out.println("**contatti**");
		Set<String> key = rubrica.keySet();
		return rubrica.get(key);
	}
		}
	

