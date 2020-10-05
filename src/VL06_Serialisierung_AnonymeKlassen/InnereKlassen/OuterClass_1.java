package VL06_Serialisierung_AnonymeKlassen.InnereKlassen;

public class OuterClass_1 {
	private int i = 0;

	public void printIt() {
		InnerClass ic = new InnerClass();
		ic.doIt();
		System.out.println(i);
	}

	private class InnerClass {
		void doIt() {
			i = 22;
		}
	}

	public static void main(String[] args) {
		new OuterClass_1().printIt();
	}
}

//Syntax
//class OuterClass {
//	class InnerClass {
//		void doIt() {
//		}
//	}
//}
