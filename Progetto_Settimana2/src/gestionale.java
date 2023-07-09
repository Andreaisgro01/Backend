
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class gestionale {
	
	private static Logger log = LoggerFactory.getLogger(gestionale.class);
	
	private static String filePath = "doc/archivio.txt";
	
	private Map<String, articoloGenerico> archivio;
	
	public gestionale() {
		this.archivio = new HashMap<String, articoloGenerico>();
	}
	
	public void aggiungiArticolo(articoloGenerico nuovoElemento) {
		archivio.put(nuovoElemento.getIsbn(), nuovoElemento);
		log.info("Articolo aggiunto {Titolo}: " + nuovoElemento.getTitolo());
	}
	
	public void rimuoviArticolo(String isbn) {
		articoloGenerico elementoRimosso = archivio.remove(isbn);
		log.info("Articolo rimosso {Titolo}: " + elementoRimosso.getTitolo());
	}
	
	public articoloGenerico ricercaPerIsbn(String isbn) {
		return archivio.get(isbn);
	}
	
	public List<articoloGenerico> ricercaPerAnno(Integer annoPubblicazione) {
		return archivio.values().stream()
				.filter(e -> annoPubblicazione.equals(e.getAnnoPubblicazione()))
				.collect(Collectors.toList());
	}
	
	public List<articoloGenerico> ricercaPerAutore(String autore) {
		return archivio.values().stream()
				.filter(e -> e instanceof libro)
				.map(e -> (libro) e)
				.filter(e -> autore.equals(e.getAutore()))
				.collect(Collectors.toList());
	}
	
	public void salvaSuFile() throws IOException {
		String txt = "";
		for(articoloGenerico articolo : archivio.values()) {
			if(txt.length() != 0) {
				txt += "#";
			}
			if(articolo instanceof libro) {
				txt += libro.toStringFile((libro)articolo);
			} else if(articolo instanceof rivista) {
				txt += rivista.toStringFile((rivista) articolo);
			}
		}
		
		File file = new File(filePath);
		
		FileUtils.writeStringToFile(file, txt, "UTF-8", true);
		log.info("Dati salvati correttamente: " + file);
		
	}
	
	public void caricaDaFile() throws IOException {
		this.archivio.clear();
		
		File file = new File(filePath);

		String fileString = FileUtils.readFileToString(file, "UTF-8");

		List<String> arraySplittato = Arrays.asList(fileString.split("#"));

		for (String curString : arraySplittato) {
			articoloGenerico elemento = null;
			if ( curString.startsWith(libro.class.getSimpleName()) ) {
				elemento = libro.fromStringFile(curString);
			} else if ( curString.startsWith(rivista.class.getSimpleName()) ) {
				elemento= rivista.fromStringFile(curString);
			}
			this.archivio.put(elemento.getIsbn(), elemento);
			log.info(elemento.toString());
		}
		
		
		
		
		log.info("Dati caricati correttamente: " + file);
	
	}
	
	

	public static void main(String[] args) {
		
		gestionale catalogo = new gestionale();
		
		libro l1 = new libro("A01", "Il silenzio degli innocenti", 1991, 388 , "Thomas Harris", "Crime");
		libro l2 = new libro("A02", "50 sfumature di grigio", 2001, 523, "E. L. James", "Romanzo");
		rivista r1 = new rivista("A04", "Vanity Fair", 2023, 45, Periodicita.MENSILE);
		rivista r2 = new rivista("A05", "Gazzetta dello sport", 2023, 13, Periodicita.SETTIMANALE);
		
		
		
		catalogo.aggiungiArticolo(l1);
		catalogo.aggiungiArticolo(l2);
		catalogo.aggiungiArticolo(r1);
		catalogo.aggiungiArticolo(r2);
		
		try {
			catalogo.salvaSuFile();
			catalogo.caricaDaFile();
			
			
			articoloGenerico cercaIsbn = catalogo.ricercaPerIsbn("A01");
			log.info("il codice di A01 è :" + cercaIsbn);
			
			List<articoloGenerico> cercaAutore = catalogo.ricercaPerAutore("Thomas Harris");
			cercaAutore.forEach(e -> log.info("Un libro di Thomas Harris è: " + e.getTitolo()));
			
			
			
			List<articoloGenerico> cercaAnno = catalogo.ricercaPerAnno(2023);
			cercaAnno.forEach(e -> log.info("Articolo pubblicato nel anno corrente: " + e.getTitolo()));
			
		} catch(IOException e) {
			log.error("Ops qualcosa è andato storto!!");
		} 
		

	}

}
