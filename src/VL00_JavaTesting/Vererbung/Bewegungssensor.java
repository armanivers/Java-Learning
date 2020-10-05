package VL00_JavaTesting.Vererbung;

public class Bewegungssensor extends Sensor{

	private int MinBewegungsgesch;
	private int MaxBewegungsgesch;
	
	public Bewegungssensor() {
		super("Bewegungssensor");
		//default min/max werte
		this.MinBewegungsgesch = 1;
		this.MaxBewegungsgesch = 15;
	}
	
	@Override
	public void einstellen(int wertMin, int wertMax) {
		this.MinBewegungsgesch = wertMin;
		this.MaxBewegungsgesch = wertMax;
	}
	
	public void prezisionsZustand() {
		this.MinBewegungsgesch = 1;
		this.MaxBewegungsgesch = 3;
	}

}
