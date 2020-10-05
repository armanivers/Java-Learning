package VL06_Serialisierung_AnonymeKlassen.A33;

import java.io.Serializable;

public class Kunde implements Serializable{

	@Override
	public String toString() {
		return "Kunde [nachname=" + nachname + ", konto=" + konto + "]";
	}

	private static final long serialVersionUID = -7429888777159904692L;
	
	private String nachname;
	private Konto konto;
	
	public Kunde(String nachname) {
		this.nachname = nachname;
		this.konto = new Konto(200);
	}
	
	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Konto getKonto() {
		return konto;
	}

	public void setKonto(Konto konto) {
		this.konto = konto;
	}

	public void druckeDaten() {
		System.out.println("Kunde "+nachname +" Kontostand = "+konto.getGuthaben());
	}
}
