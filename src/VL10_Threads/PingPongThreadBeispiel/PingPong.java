package VL10_Threads.PingPongThreadBeispiel;

public class PingPong extends Thread{

	private String text;
	private int delay;
	
	public PingPong(String text, int delay) {
		this.text = text;
		this.delay = delay;
	}
	
	public void run() {
		while(true) {
			System.out.println(text);
			try {
				sleep(delay);
			} catch(InterruptedException e) {
				break;
			}
		}
	}
}
