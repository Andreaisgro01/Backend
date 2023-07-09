import java.util.ArrayList;
import java.util.List;

public class Main_Project  {
	
	public static List<String> lista = new ArrayList<String>();
	

	public static void main(String[] args) {
	/*
	lista.add("Primo valore");
	lista.add("Secondo valore");	
	lista.add("Terzo valore");
	
	for(String a : lista){
		System.out.println(a);
	}
	
	lista.forEach ( b-> System.out.println(b));
	*/
	
	/*soluzione1	
	classeConcreta cc = new classeConcreta();
	stampaMessaggio(cc);
	*/
	
	//soluzione2
	//stampaMessaggio(new classeConcreta());
	
	//soluzione3
		stampaMessaggio (new Imessage() {
			@Override
			public String getMessage() {
			return "Classe concreta message";
			}
		});
	
	}
	public static void stampaMessaggio(Imessage c) {
		System.out.println(c.getMessage());
		
	}
}
