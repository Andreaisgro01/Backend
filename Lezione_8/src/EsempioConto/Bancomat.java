package EsempioConto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bancomat extends Thread {
	
	

	public static Bancomat b1;

	public static Bancomat b2;

	public static Bancomat b3;

	private ContoCorrente conto;
	
	private Logger log = LoggerFactory.getLogger(ContoCorrente.class);

	public Bancomat(ContoCorrente conto) {
		super();
		this.conto = conto;
		
	}
	
	public void preleva(double denaro) {
		if(conto.controlloSaldo(denaro)) {
			conto.prelievo(denaro);
		log.info("Prelievo effettuato: " + this.conto);
		}
	}

	@Override
	public void run() {
		for (int i=0; i<5; i++) {
			this.preleva(100);
		}
	}
}