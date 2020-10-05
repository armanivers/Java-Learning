package VL06_Serialisierung_AnonymeKlassen.AnonymeKlasen;

public class AnonymTest {
	public static void druckeWertetabelle(Berechnung b) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("f(" + i * 1.0 + ") = " + b.berechne((double) i));
		}
	}
}
