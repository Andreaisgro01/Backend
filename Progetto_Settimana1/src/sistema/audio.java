package sistema;

import interfacce.iriproduzione;

public class audio extends multimediale implements iriproduzione {

	public int durata;
	public int volume = 0;
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
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



	public audio(int durata, String titolo) {
		super();
		this.durata = durata;
		this.titolo = titolo;
	}
	

}
