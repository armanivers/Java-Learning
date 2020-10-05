package KlausurAufgaben.JavaFX;

import KlausurAufgaben.Threads.Prime;
import javafx.concurrent.Task;

public class PrimeTask extends Task<Integer>{
	private int n;
	public PrimeTask(int n) {
		this.n = n;
	}
	
	@Override
	protected Integer call() throws Exception{
		int p = 1;
		int i = 0;
		while(i < n) {
			p++;
			if(Prime.isPrime(p)) {
				i++;
				updateProgress((double) i/n,1.0);
			}
		}
		return Integer.valueOf(p);
	}
}
