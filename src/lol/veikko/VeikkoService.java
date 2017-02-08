package lol.veikko;

import java.util.Random;

public class VeikkoService {
	public Weather saaPalvelu () { // Random sää testausta varten
		Random random = new Random();
		return new Weather(random.nextInt(200)-100, random.nextInt(100)+10);
	}
	
	public Vinkki vinkkiPalvelu () {
		String vinkki = "Etu-Ly�tty, ei Etu-L�ytty!";
		return new Vinkki(vinkki);
	}

	public Hello helloVeikko () {
		String hello = "Meid�n Veikko version 2.0!";
		return new Hello(hello);
	}
}


