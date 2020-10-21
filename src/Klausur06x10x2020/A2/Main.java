package Klausur06x10x2020.A2;

import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {


	public static Optional<Apfel> maximalesGewicht(LinkedList<Apfel> list) {
		return list.stream().max((a, b) -> Double.compare(a.getGewicht(), b.getGewicht()));
		
		//return list.stream().map(a -> a.getGewicht()).max((a,b) -> Double.compare(a, b));
	}
	
	public static double gesamtGewicht(LinkedList<Apfel> list) {
		return list.stream().map(a -> a.getGewicht()).reduce(0.0, (a, b) -> a + b);
	}
	
	public static long count(Predicate<Apfel> p, LinkedList<Apfel> list) {
		return list.stream().filter(p).count();
	}
}

