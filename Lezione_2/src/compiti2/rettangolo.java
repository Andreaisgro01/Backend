package compiti2;

public class rettangolo {
	public int altezza;
	public int base;
	
	
	public rettangolo(int altezza, int base) {
		this.altezza= altezza;
		this.base= base;
	}
	public int Area() {
		return base*altezza;
	}
	public int Perimetro() {
		return (base+altezza)*2;
	}
}
