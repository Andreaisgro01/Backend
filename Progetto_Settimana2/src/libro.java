public class libro extends articoloGenerico {
	
	private  String autore;
	private  String genere;
	
	public libro(String isbn, String titolo, Integer annoPubblicazione, Integer numeroPagine, String autore,
			String genere) {
		super(isbn, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}
    
	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", genere=" + genere + "]";
	}
	
	public static String toStringFile(libro libro) {
		return libro.class.getSimpleName()  
				+ "@" + libro.isbn
				+ "@" + libro.titolo
				+ "@" + libro.annoPubblicazione
				+ "@" + libro.numeroPagine
				+ "@" + libro.autore
				+ "@" + libro.genere;
	}
	
	public static libro fromStringFile(String stringFile) {
		String[] split = stringFile.split("@");
		
		return new libro(split[1], split[2], Integer.valueOf(split[3]), Integer.valueOf(split[4]), split[5], split[6]);
	}

	
	
	
	
	
	

}
