package KlausurAufgaben.Threads19x8x19;

public class PrimeUtilConcurrent extends PrimeUtil implements Runnable{

	private PrimeListener ipl;
	private int n;
	
	public PrimeUtilConcurrent(PrimeListener ipl) {
		this.ipl = ipl;
	}
	
	public PrimeUtilConcurrent() {
		//leer?
	}
	
	@Override
	public void calcPrime(int n) {
		this.n = n;
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		super.calcPrime(n);
		ipl.nextPrime();
		
	}

}
