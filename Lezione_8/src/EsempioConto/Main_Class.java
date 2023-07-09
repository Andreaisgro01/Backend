package EsempioConto;

public class Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContoCorrente Rossi = new ContoCorrente("famiglia Rossi");
		ContoCorrente Ross = new ContoCorrente("famiglia Ross");
		Rossi.deposito(400);
		Ross.deposito(300);
		
		Bancomat.b1 = new Bancomat(Rossi);
		Bancomat.b2 = new Bancomat(Ross);
		Bancomat.b3 = new Bancomat(Rossi);
	
		b1.start();
		b2.start();
		b3.start();
	}

}
