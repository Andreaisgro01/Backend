package compiti2;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("altezza:");
		String h = scan.nextLine();
		int altezza =Integer.parseInt(h);
		System.out.print("base:");
		String b = scan.nextLine();
		int base =Integer.parseInt(b);
		
		
		rettangolo r1= new rettangolo(10,20);
		stampaRettangolo(r1);
		rettangolo r2= new rettangolo(5,10);
		stampaDueRettangoli(r1,r2);
		
	}
	
	public static void stampaRettangolo(rettangolo r) {
		int area= r.Area();
		int perimetro= r.Perimetro();
		System.out.println("L'area è:" + area);
		System.out.println("Il perimetro è:" + perimetro);
	}
	public static void stampaDueRettangoli(rettangolo r1,rettangolo r2) {
		int area= r1.Area();
		int perimetro= r1.Perimetro();
		int area2= r2.Area();
		int perimetro2=r2.Perimetro();
		int sommaAree= area+area2;
		int sommaPerimetri=perimetro+perimetro2;
		
		System.out.println("il perimetro di r1 è di:" + perimetro);
		System.out.println("l'area di r1 è di:" + area);
		System.out.println("il perimetro di r2 è di:" + perimetro2);
		System.out.println("la somma delle aree è di:" + sommaAree);
		System.out.println("la somma dei perimetri è di:" + sommaPerimetri);
	}
	
	

}
