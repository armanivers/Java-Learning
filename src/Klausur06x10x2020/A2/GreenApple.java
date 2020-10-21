package Klausur06x10x2020.A2;

import java.util.function.Predicate;

public class GreenApple implements Predicate<Apfel>{

	@Override
	public boolean test(Apfel a) {
		if(a.getFarbe().equals("green")) {
			return true;
		}
		return false;
	}

}
