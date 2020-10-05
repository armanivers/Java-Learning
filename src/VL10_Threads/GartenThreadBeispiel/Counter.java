package VL10_Threads.GartenThreadBeispiel;

public class Counter {

	private int c;
	
	public Counter() {
		this.c = 0;
	}
	
	public void inc() {
		c=c+1;
		System.out.println("Anzahl = "+c);
	}
}
