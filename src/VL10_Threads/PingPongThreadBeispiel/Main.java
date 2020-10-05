package VL10_Threads.PingPongThreadBeispiel;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new PingPong("Ping",500);
		Thread t2 = new PingPong("Pong",500);
		
		t1.start();
		t2.start();
		
		System.out.println("Ende Main");

	}

}
