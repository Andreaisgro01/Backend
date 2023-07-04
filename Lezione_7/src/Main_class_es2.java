import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main_class_es2 {
    public static void main(String[] args) {
        // Test delle funzioni
        int N = 10;
        List<Integer> listaNumeri = generaListaCasuale(N);
        System.out.println("Lista generata: " + listaNumeri);

        List<Integer> listaInvertita = invertiLista(listaNumeri);
        System.out.println("Lista invertita: " + listaInvertita);

        boolean stampaPari = true;
        System.out.print("Stampa valori in posizioni ");
        if (stampaPari) {
            System.out.println("pari:");
        } else {
            System.out.println("dispari:");
        }
        stampaPosizioni(listaNumeri, stampaPari);
    }

    private static List<Integer> generaListaCasuale(int N) {
        List<Integer> listaCasuale = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            int numeroCasuale = random.nextInt(101); // Genera un numero casuale da 0 a 100
            listaCasuale.add(numeroCasuale);
        }

        return listaCasuale;
    }

    private static List<Integer> invertiLista(List<Integer> lista) {
        List<Integer> listaInvertita = new ArrayList<>(lista);
        Collections.reverse(listaInvertita);
        listaInvertita.addAll(lista);
        return listaInvertita;
    }

    private static void stampaPosizioni(List<Integer> lista, boolean stampaPari) {
        for (int i = 0; i < lista.size(); i++) {
            if (stampaPari && i % 2 == 0) {
                System.out.println(lista.get(i));
            } else if (!stampaPari && i % 2 != 0) {
                System.out.println(lista.get(i));
            }
        }
    }
}
