  package sistema;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static multimediale[] Array = new multimediale[5];
	public static void main (String[] args) {
		generaMultimediale();
		generaContenutoMultimediali();
	}
	
	public static void generaMultimediale() {

		int i= 0; 
		
		System.out.println(" *** Segli con un numero il media da generare 1: Audio , 2: Video , 3: Immagine ***");
		
		do {
		
		System.out.println("Inserisci il tipo di media: ");
        int contenuto = scan.nextInt();
        
        
       
        switch (contenuto) {
        case 1 :
        	i++;
        	System.out.println("Inserisci il titolo: ");
        	String titoloAudio = scan.next();
        	System.out.println("Inserisci la durata: ");
        	int durataAudio = scan.nextInt();
        	
        	new video (durataAudio,titoloAudio);
        	Array[i-1] = new audio(durataAudio,titoloAudio);
        	break;
        	
        	
        case 2 :
        	i++;
        	System.out.println("Inserisci il titolo: ");
        	String titoloVideo = scan.next();
        	System.out.println("Inserisci la durata: ");
        	int durataVideo = scan.nextInt();
        	
        	new video (durataVideo,titoloVideo);
        	
        	Array[i-1] = new video(durataVideo,titoloVideo);
        	
        	break;
        
        case 3 :
        	i++;
        	System.out.println("Inserisci il titolo: ");
        	String titoloImmagine = scan.next();
        	
        	new immagine (titoloImmagine);
        	
        	Array[i-1] = new immagine(titoloImmagine);
        	
        	break;
        
        
        default: System.out.println("errore media già presente");
        }  
        }while (i<=4);
	}
	public static void generaContenutoMultimediali() {
		int i = 0;
		while(i==0) {
			System.out.println("immetti un numero tra 1 e 5: ");
			int contenuto = scan.nextInt();
			switch(contenuto) {
			case 1: i=0;
				break;
			default:
				if (Array[contenuto-1] instanceof audio) {
					audio a = (audio)Array[contenuto-1];
					System.out.println("Inserisci un valore da 1 a 5 per impostare il volume: ");
					int volume = scan.nextInt();
					for(int x=0;x<volume;x++);{
					a.piuAudio();
					}
					a.play();
				}
				else if(Array[contenuto-1]instanceof video){
					video v = (video)Array[contenuto-1];
					System.out.println("Inserisci un valore da 1 a 5 per impostare il volume: ");
					int volume = scan.nextInt();
					for(int x=0;x<volume;x++);{
					v.piuAudio();
					}
					System.out.println("Inserisci un valore da 1 a 5 per impostare la luminosità: ");
					int l =scan.nextInt();
					for(int x=0;x<l;x++);{
						v.aumentaLuminosita();
					}
					v.play();
			}else if(Array[contenuto-1] instanceof immagine) {
				immagine im = (immagine)Array(contenuto-1);
				System.out.println("Inserisci un valore da 1 a 5 per impostare la luminosità: ");
				int l = scan.nextInt();
				for(int x=0;x<l;x++);{
					im.aumentaLuminosita();
			}
		}
		break;	
		}
	}
	
}

	private static immagine Array(int i) {
		// TODO Auto-generated method stub
		return null;}
	}

