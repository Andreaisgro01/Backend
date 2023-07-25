package configBeans;

public class Franchise {
	private String indumento;
	private double prezzo;
	public Franchise(String indumento, double prezzo) {
		super();
		this.indumento = indumento;
		this.prezzo = prezzo;
	}
	public String getIndumento() {
		return indumento;
	}
	public void setIndumento(String indumento) {
		this.indumento = indumento;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
}
