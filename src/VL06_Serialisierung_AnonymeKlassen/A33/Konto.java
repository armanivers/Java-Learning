package VL06_Serialisierung_AnonymeKlassen.A33;

import java.io.Serializable;

public class Konto implements Serializable{
	
	private static final long serialVersionUID = -1043799996983377430L;

	@Override
	public String toString() {
		return "Konto [guthaben=" + guthaben + "]";
	}

	private double guthaben;
	
	public Konto(int guthaben) {
		this.guthaben = guthaben;
	}
	
	public double getGuthaben() {
		return guthaben;
	}
}
