package sistema;

import interfacce.iluminosita;

public class immagine extends multimediale implements iluminosita {
	int luminosita = 0;
	@Override
	public int aumentaLuminosita() {
		// TODO Auto-generated method stub
		if (this.luminosita == 10) {
			System.out.println("Massima luminosità");
			return this.luminosita = 10;
		}else {return this.luminosita++;}
	}

	@Override
	public int riduciLuminosita() {
		// TODO Auto-generated method stub
		if (this.luminosita == 0) {
			System.out.println("Niente luminosità");
			return this.luminosita = 0;
		}else {return this.luminosita--;}
	}
	public immagine(String titolo) {
		super();
		this.titolo = titolo;
	}

}
