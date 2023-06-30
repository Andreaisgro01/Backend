package Exercise;


	public class Dipendenti {
	    private static double stipendioBase = 1000;
	    private String matricola;
	    private double stipendio;
	    private double importoOrarioStraordinario;
	    private String livello;
	    private String dipartimento;

	    public Dipendenti(String matricola, String dipartimento) {
	        this.matricola = matricola;
	        this.dipartimento = dipartimento;
	        this.stipendio = stipendioBase;
	        this.importoOrarioStraordinario = 30;
	        this.livello = "OPERAIO";
	    }

	    public Dipendenti(String matricola, double stipendio, double importoOrarioStraordinario, String livello, String dipartimento) {
	        this.matricola = matricola;
	        this.stipendio = stipendio;
	        this.importoOrarioStraordinario = importoOrarioStraordinario;
	        this.livello = livello;
	        this.dipartimento = dipartimento;
	    }

	    public void stampaDatiDipendente() {
	        System.out.println("Matricola: " + matricola);
	        System.out.println("Stipendio: " + stipendio);
	        System.out.println("Importo Orario Straordinario: " + importoOrarioStraordinario);
	        System.out.println("Livello: " + livello);
	        System.out.println("Dipartimento: " + dipartimento);
	    }

	    public String promuovi() {
	        if (livello.equals("OPERAIO")) {
	            livello = "IMPIEGATO";
	            stipendio = stipendioBase * 1.2;
	        } else if (livello.equals("IMPIEGATO")) {
	            livello = "QUADRO";
	            stipendio = stipendioBase * 1.5;
	        } else if (livello.equals("QUADRO")) {
	            livello = "DIRIGENTE";
	            stipendio = stipendioBase * 2;
	        } else {
	            System.out.println("Errore: Il dipendente è già un dirigente.");
	        }

	        return livello;
	    }

	    public static double calcolaPaga(Dipendenti dipendente) {
	        return dipendente.stipendio;
	    }

	    public static double calcolaPaga(Dipendenti dipendente, int oreStraordinario) {
	        double stipendio = dipendente.stipendio;

	        if (oreStraordinario > 0) {
	            stipendio += dipendente.importoOrarioStraordinario * oreStraordinario;
	        }

	        return stipendio;
	    }
	}


