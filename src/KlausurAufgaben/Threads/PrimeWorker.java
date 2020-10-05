package KlausurAufgaben.Threads;

import java.util.Collection;

public class PrimeWorker implements Runnable{
	
	private int n;
	private Collection<Integer> primes;
	
	public PrimeWorker(int n,Collection<Integer> primes) {
		this.n = n;
		this.primes = primes;
	}
	
	@Override
	public void run() {
		if(Prime.isPrime(n)) {
			primes.add(n);
		}
	}

}
