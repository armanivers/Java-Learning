package VL06_Serialisierung_AnonymeKlassen.InnereKlassen;


public class OuterClass_3 {
	private int i = 0;

	public void printIt() {
		InnerClass ic = new InnerClass();
		ic.doIt();
		System.out.println(i);
	}

	public class InnerClass {
		int i;

		void doIt() {
			System.out.println("Methode der Innere Klasse");
		}
	}

}

//Syntax
//class OuterClass {
//	class InnerClass {
//		void doIt() {
//		}
//	}
//}
