package EsempioConto;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContoCorrente {
	private double saldo;
	private String titolare;
	private Logger log = LoggerFactory.getLogger(ContoCorrente.class);

	public ContoCorrente(String titolare) {
		this.titolare = titolare;
		this.saldo = 0;
	}
	public double deposito(double versamento) {
		this.saldo += versamento;
		return this.saldo;
		}
	public synchronized double prelievo(double denaroDaPrelevare) {
		if (controlloSaldo(denaroDaPrelevare)) {
			log.info("Prelievo di " + this.titolare + "$" + denaroDaPrelevare);
			 this.saldo -= denaroDaPrelevare;	
		}
		return this.saldo;
	}
	public boolean controlloSaldo(double denaroDaPrelevare) {
		
		return this.saldo >= denaroDaPrelevare;
	}
}
