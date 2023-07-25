package configBeans;

public class Bevande {
	private String nome;
	private int kCal;
	private  double prezzo;
	public Bevande(String nome, int calorie, double prezzo) {
		super();
		this.nome = nome;
		this.kCal = calorie;
		this.prezzo = prezzo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCalorie() {
		return kCal;
	}
	public void setCalorie(int calorie) {
		this.kCal = calorie;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
}
