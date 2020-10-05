package VL06_Serialisierung_AnonymeKlassen.InnereKlassen;

public class OuterClass_2 {
	private int i = 0;

	public void printIt() {
		InnerClass ic = new InnerClass();
		ic.doIt();
		System.out.println(i);
	}

	private class InnerClass {
		int i;

		void doIt() {
			OuterClass_2.this.i = 22;
		}
	}

	public static void main(String[] args) {
		new OuterClass_2().printIt();
	}
}

//Syntax
//class OuterClass {
//	class InnerClass {
//		void doIt() {
//		}
//	}
//}
