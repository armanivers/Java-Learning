package Klausur06x10x2020.A3;

import java.util.LinkedList;

public class Timer implements Runnable{
	private LinkedList<TimeListener> tl;
	private int ms;
	
	public Timer(int ms) {
		this.ms = ms;
		tl = new LinkedList<TimeListener>();
	}
	
	public void register(TimeListener t) {
		tl.add(t);
	}
	
	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted()) {
			try {
				for(TimeListener t: tl) {
					tl.signal();
				}
				sleep(ms);
			} catch(InterruptedException e) {
			}
		}
	}
}
