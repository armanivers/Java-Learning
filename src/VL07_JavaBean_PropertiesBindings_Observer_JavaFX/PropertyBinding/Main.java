package VL07_JavaBean_PropertiesBindings_Observer_JavaFX.PropertyBinding;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Main {

	public static void main(String[] args) {
		
		IntegerProperty a = new SimpleIntegerProperty();
		IntegerProperty b = new SimpleIntegerProperty();
		
		b.bind(a);
		
		a.set(256);
		
		System.out.println(b.get());
		
		//mit unbding() bindung aufheben
		//Bindung in beide Richtungen mit bindBidirectional
	}
}
