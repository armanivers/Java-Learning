package KlausurAufgaben.Threads;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> zahlen = new LinkedList<Integer>();
		
		for(int i = 0; i<10000; i++) {
			zahlen.add(i);
		}
		
		System.out.println("Data Size = "+zahlen.size());
		
		
				
		long startTime = System.currentTimeMillis();
		LinkedList<Integer> resultMultiThreaded = filterPrimesMultiThreading(zahlen);
		long endTime = System.currentTimeMillis();
		
		long result2 = endTime-startTime;
		
		startTime = System.currentTimeMillis();
		LinkedList<Integer> resultSingleThread = filterPrimesSingleThreaded(zahlen);
		endTime = System.currentTimeMillis();
		
		long result1 = endTime-startTime;
		
		
		startTime = System.currentTimeMillis();
		Collection<Integer> result3 = filterPrimesMt(zahlen);
		endTime = System.currentTimeMillis();
		
		long result3t = endTime-startTime;
		
		System.out.println("Single Threaded time: "+result1);
//		for(Integer i: resultSingleThread) {
//			System.out.print(i+", ");
//		}
		System.out.println();
		System.out.println("Multi Threaded time: "+result2);
//		for(Integer i: resultMultiThreaded) {
//			System.out.print(i+", ");
//		}
		System.out.println();
		System.out.println("Multi Threaded  Stream time: "+result3t);
//		for(Integer i: result3) {
//			System.out.print(i+", ");
//		}
		
		
		
		
	}
	
	public static LinkedList<Integer> filterPrimesMultiThreading(Collection<Integer> list) {
		LinkedList<Thread> threads = new LinkedList<Thread>();
		LinkedList<Integer> primes = new LinkedList<Integer>();
		
		for(Integer i: list) {
			Thread t = new Thread(new PrimeWorker(i, primes));
			threads.add(t);
			t.start();
		}
		
		for(Thread t: threads) {
			try {
				t.join();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		return primes;
	}
			
	public static Collection<Integer> filterPrimesMt(Collection<Integer> list){
		return list.stream().parallel().filter(a -> Prime.isPrime(a)).collect(Collectors.toList());
	}
	
	public static LinkedList<Integer> filterPrimesSingleThreaded(Collection<Integer> list){
		LinkedList<Integer> primes = new LinkedList<Integer>();
		for(Integer i: list) {
			if(Prime.isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}
}
