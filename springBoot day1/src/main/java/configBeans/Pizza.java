package configBeans;

public class Pizza {
	private String nome;
	private int kCal;
	private double prezzo;
	public Pizza(String nome, int kcal, double prezzo) {
		super();
		this.nome = nome;
		this.kCal = kcal;
		this.prezzo = prezzo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getKcal() {
		return kCal;
	}
	public void setKcal(int kcal) {
		this.kCal = kcal;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
}