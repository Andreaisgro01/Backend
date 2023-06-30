package Exercise;

public class Main_class {
    public static void main(String[] args) {
        // Creazione di un'istanza di Dipendente utilizzando il primo costruttore
        Dipendenti dipendente1 = new Dipendenti("M1234", "PRODUZIONE");
        Dipendenti dipendente2 = new Dipendenti("M1235", "PRODUZIONE");
        // Stampa dei dati del dipendente
        dipendente1.stampaDatiDipendente();
        dipendente2.stampaDatiDipendente();

        // Promozione del dipendente
        String nuovoLivello = dipendente1.promuovi();
        System.out.println("Nuovo livello: " + nuovoLivello);
    }
}

