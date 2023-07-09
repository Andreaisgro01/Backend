package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainProject {

	static List<String> lista1 = new ArrayList<String>();
	static List<String> lista2 = Arrays.asList("Test1","Test2","Test3");
	
	public static void main(String[] args) {
		
		lista1.add("Angular");
		lista1.add("React");
		lista1.add("JavaScript");
		lista1.add("TypeScript");
		lista1.add("Java");
		//Stream
		//trasforma lista1 in un flusso continuo di dati, su questo stream 
		Stream<String> s = lista1.stream();//Trasforma una collection in uno Stream(flusso) di dati
		Stream <String> sFilter = s.filter(elements -> elements.length() >= 6);//  prendimi gli elementi uno per uno e tornami solo quelli con almeno 6 caratteri di lunghezza       
		// restituisce una NUOVA collection filtrata, NON modifica l'originale
		Stream<String> sMod = sFilter.map(elements -> elements + "^");   // Map permette di modificare i dati agigugendo ^ a tutti gli elementi filtrati in precedenza
		sMod.forEach(ele -> System.out.println(ele));
		List<String> st = lista1.stream()
										.filter(elements -> elements.length()>=6)
										.map(elements-> elements + "^")
										.sorted()
										.collect(Collectors.toList());
		String stConc = lista1.stream()
				.filter(elements -> elements.length()>=6)
				.map(elements-> elements + "^") // modifica ogni elemento in base ad una condizione
				.reduce("", (accumulatore, elements)-> accumulatore + elements + "#");//REDUCE prende un flusso di dati e restituisce un solo valore, i suoi parametri sono 2: il valore iniziale dell'accumulatore e la lamda che gestisce la logica per il risultato finale da ottenere
	
		System.out.println(stConc);
		
		// STREAM.BUILDER
		// Creo direttamente uno stream di dati da manipolare senza creare una lista e poi trasformarla in Stream come accaduto in precedenza
				//List<Integer> listaNum = new ArrayList<Integer>();
				//List<Integer> listaNum = Arrays.asList(25,12,23,65,86,34,11);
				//Stream<Integer> streamBuilder = listaNum.stream();
		Stream<Integer> streamBuilder = Stream.<Integer>builder()
													.add(25)
													.add(12)
													.add(27)
													.add(65)
													.add(86)
													.add(34)
													.add(11)
													.build();
		
			//long count = streamBuilder.count();   //mi da il totale degli elementi presenti nello streamBuilder
			//System.out.println("Count StreamBuilder:" + count);
			
			//Integer max =streamBuilder.max(Integer::compare).get(); //mi torna il valore integer più grande all'interno dello streamBuilder
			//System.out.println("Max StreamBuilder:" + max);
			
			//Integer min =streamBuilder.min(Integer::compare).get(); // valore più basso (minimo)
			//System.out.println("Min StreamBuilder:" + min);
		
		streamBuilder.sorted().limit(3).forEach(elements -> System.out.println(elements)); // prende i tre valori più bassi
		
	
	}

}
