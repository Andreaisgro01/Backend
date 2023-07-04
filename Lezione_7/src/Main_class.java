import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di parole da inserire: ");
        int numeroParole = scanner.nextInt();

        Set<String> parole = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        System.out.println("Inserisci le parole una alla volta:");

        for (int i = 0; i < numeroParole; i++) {
            String parola = scanner.next();

            if (!parole.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("Parole duplicate:");
        for (String parola : paroleDuplicate) {
            System.out.println(parola);
        }

        System.out.println("Numero di parole distinte: " + parole.size());

        System.out.println("Elenco delle parole distinte:");
        for (String parola : parole) {
            System.out.println(parola);
        }
        
    }
}

