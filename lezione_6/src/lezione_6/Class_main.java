package lezione_6;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Class_main {

	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(Class_main.class);
		int[] arr = new int[] { 5, 39, 11, 45, 99 };
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Numeri:");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.print("Quale posizione vuoi modificare? ");

			try {
				String input = sc.nextLine();
				int InputInt = Integer.parseInt(input);
				if (InputInt == 0) {
					System.out.println("Programma terminato");
					break;
				} else {
					System.out.print("inserisci un nuovo valore nella posizione " + input + ": ");
					String value = sc.nextLine();
					arr[InputInt - 1] = Integer.parseInt(value);
				}

			} catch (NumberFormatException ex) {
				log.debug("Hai inserito un input non valido!");
			} catch (ArrayIndexOutOfBoundsException ex) {
				log.debug("La posizione inserita non esiste");
			} catch (Exception ex) {
				log.debug("Bho");
			}
		}
	}
}

