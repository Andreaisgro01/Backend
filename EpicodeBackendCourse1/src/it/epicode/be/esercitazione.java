package it.epicode.be;

import java.util.Arrays;

public class esercitazione {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 10;
        
        int prodotto = calcolaProdotto(numero1, numero2);
        System.out.println("Il prodotto dei due numeri è: " + prodotto);
        
        String testo = "Fa ";
        int numero = prodotto;
        
        String risultato = concatenaStringa(testo, numero);
        System.out.println("Risultato: " + risultato);
        
        String[] arrayStringhe = {"Uno", "Due", "Quattro", "Cinque", "Sei"};
        String nuovaStringa = "Tre";
        
        String[] nuovoArray = inserisciStringaInArray(arrayStringhe, nuovaStringa);
        System.out.println("Nuovo array: " + Arrays.toString(nuovoArray));
    }
    
    public static int calcolaProdotto(int num1, int num2) {
        return num1 * num2;
    }
    
    public static String concatenaStringa(String stringa, int numero) {
        return stringa + numero;
    }
    public static String[] inserisciStringaInArray(String[] array, String nuovaStringa) {
        String[] nuovoArray = new String[array.length + 1];
        
        for (int i = 0; i < array.length + 1; i++) {
            if (i < 2) {
                nuovoArray[i] = array[i];
            } else if (i == 2) {
                nuovoArray[i] = nuovaStringa;
            } else {
                nuovoArray[i] = array[i - 1];
            }
        }
        
        return nuovoArray;
    }
}



