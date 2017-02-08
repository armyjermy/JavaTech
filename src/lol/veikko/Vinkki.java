package lol.veikko;

import java.io.Serializable;

public class Vinkki implements Serializable {

	public String getVinkki() {
		return vinkki;
	}
	public void setVinkki(String vinkki) {
		this.vinkki = vinkki;
	}
	
	public Vinkki(String vinkki) {
		this.vinkki = vinkki;
	}
	String vinkki;
	
}