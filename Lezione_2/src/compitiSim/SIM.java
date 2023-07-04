package compitiSim;
import java.util.List;
import java.util.ArrayList;


public class SIM {
	public int nTelefono;
	public double credito;
	public  List<Chiamate>registro;
	
	public SIM(int nTelefono, double credito) {
		this.nTelefono = nTelefono;
		this.credito = credito;
		this.registro = new ArrList<>();
		
	}
	public int getNumero() {
		return nTelefono;
	}
	public dobule getCredito() {
		return credito;
	}
	public List<Chiamate> getRegistro(){
		return registro;
	}

}
