package sistema;

import interfacce.iluminosita;
import interfacce.iriproduzione;

public class video extends multimediale implements iriproduzione, iluminosita{

	public int durata;
	public int volume = 0;
	public int luminosita = 0;
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		for (int i=0;i<this.durata; i++) {
			System.out.println(this.titolo);
		}
		for (int i=0;i<this.luminosita; i++) {
			System.out.println(" -*- ");
		}
		for (int i=0;i<this.volume; i++) {
			System.out.println(" -!- ");
		}
		
	}

	
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

	@Override
	public int piuAudio() {
		// TODO Auto-generated method stub
		if (this.volume == 10) {
			System.out.println("Massimo volume");
			return this.volume = 10;
		}else {return this.volume++;}
		
	}
	

	@Override
	public int menoAudio() {
		// TODO Auto-generated method stub
		if (this.volume == 0) {
			System.out.println("Niente volume");
			return this.volume = 0;
		}else {return this.volume--;}
		
	}


	public video(int durata, String titolo) {
		super();
		this.durata = durata;
		this.titolo = titolo;
	}
	
	

}
