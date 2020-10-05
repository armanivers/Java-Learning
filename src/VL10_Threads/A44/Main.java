package VL10_Threads.A44;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new Thread(new PingPong("Ping",500));
		Thread t2 = new Thread(new PingPong("Pong", 500));
		
		t1.start();
		t2.start();
		
		System.out.println("Ende Main");

	}

}
