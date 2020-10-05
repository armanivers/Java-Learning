package VL06_Serialisierung_AnonymeKlassen.InnereKlassen;

public class Main {

	public static void main(String[] args) {
		// Der folgende Code liegt auﬂerhalb von OuterClass
		//Innerklasse ist nicht private!
		OuterClass_3 oc = new OuterClass_3();
		OuterClass_3.InnerClass ic = oc.new InnerClass();
		ic.doIt();
	}
}
