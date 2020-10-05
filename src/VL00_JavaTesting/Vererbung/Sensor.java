package VL00_JavaTesting.Vererbung;

public abstract class Sensor {
	private String sensorTyp;
	private int sensorId;
	private boolean status;
	
	public Sensor(String typ) {
		this.sensorTyp = typ;
		this.sensorId = 23;  //randomzahl;
		this.status = true; //default an
	}
	
	public void aktivieren() {
		this.status = true;
	}
	
	public void deaktivieren() {
		this.status = false;
	}
	
	public void werteLesen() {
		System.out.println("Temperatur = 24 Grad");
	}
	
	public abstract void einstellen(int wertMin, int wertMax);
}
