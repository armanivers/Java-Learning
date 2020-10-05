package VL06_Serialisierung_AnonymeKlassen.AnonymeKlasen;

public class Main {

	public static void main(String[] args) {
		AnonymTest.druckeWertetabelle(new Berechnung() {
			public double berechne(double x) {
				return (x * x);
			}
		});
	}

}
