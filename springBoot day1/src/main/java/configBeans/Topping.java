package configBeans;

public class Topping {
	private String nome;
	private int kCal;
	private double prezzo;
	public Topping(String nome, int kCal, double prezzo) {
		super();
		this.nome = nome;
		this.kCal = kCal;
		this.prezzo = prezzo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getkCal() {
		return kCal;
	}
	public void setkCal(int kCal) {
		this.kCal = kCal;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
}
