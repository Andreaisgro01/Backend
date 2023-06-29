package cicli;

import java.util.Scanner;

public class main_cicli {
    public static void main(String[] args) {
        String stringa = "par";
        boolean stringaPari = stringaPari(stringa);
        System.out.println("la stringa è pari? " + stringaPari);
        
        int anno = 2019;
        boolean bisestile = bisestileControllo(anno);
        System.out.println("L'anno " + anno + " è bi\\sestile? " + bisestile);
        
        int numero = 4;
        String numeroInLettere = convertiNumeroInLettere(numero);
        if (numeroInLettere != null) {
            System.out.println("Il numero " + numero + " in lettere è: " + numeroInLettere);
        } else {
            System.out.println("Errore: Numero non valido.");
        }
      
        Scanner scanner = new Scanner(System.in);
        String input = "";
        
        while (true) {
            System.out.print("inserisci una stringa:");
            input = scanner.nextLine();
            
            if (input.equals(":q")) {
                break;
            }
            
            String[] characters = input.split("");
            String result = String.join(",", characters);
            
            System.out.println("Risultato: " + result);
        }
        
        System.out.println("Programma terminato.");
    }
        

    
    public static boolean stringaPari(String str) {
        int lunghezza = str.length();
        return lunghezza % 2 == 0;
    }
    public static boolean bisestileControllo(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                return anno % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    
    public static String convertiNumeroInLettere(int numero) {
        if (numero >= 0 && numero <= 3) {
            switch (numero) {
                case 0:
                    return "Zero";
                case 1:
                    return "Uno";
                case 2:
                    return "Due";
                case 3:
                    return "Tre";
            }
        }
        return null;
    }
}
