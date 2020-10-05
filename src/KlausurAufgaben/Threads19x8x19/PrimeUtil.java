package KlausurAufgaben.Threads19x8x19;

import java.io.IOException;
import java.io.OutputStream;

import KlausurAufgaben.Threads.Prime;

public class PrimeUtil {
	private OutputStream os;
	
	protected void calcPrime(int n) {
		int p = 1;
		int i = 0;
		while(i < n) {
			p++;
			if(Prime.isPrime(p)) {
				i++;
			}
		}
		try {
			os.write(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}