package VL10_Threads.GartenThreadBeispiel;

public class Main {

	public static void main(String[] args) {
		Counter c = new Counter();
		
		Thread west = new Thread(new Turnstile(c,100));
		Thread east = new Thread(new Turnstile(c,100));

		west.start();
		east.start();
		
		System.out.println("Ende Main");
		
	}

}
