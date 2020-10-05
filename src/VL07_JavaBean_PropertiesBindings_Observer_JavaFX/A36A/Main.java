package VL07_JavaBean_PropertiesBindings_Observer_JavaFX.A36A;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Main {

	public static void main(String[] args) {
		AngestellerBean a = new AngestellerBean("John",1234);
		EingabeFeld feld = new EingabeFeld("John");

//		feld.textProperty().addListener(new ChangeListener() {
//			@Override
//			public void changed(ObservableValue observable, Object oldValue, Object newValue) {
//				StringProperty s = (StringProperty) observable;
//				System.out.println("Property  = " +s.get());
//				System.out.println("Old value = " +oldValue.toString());
//				System.out.println("new value = " +newValue.toString());
//			}
//		});
		
		feld.textProperty().addListener(new InvalidationListener() {
			@Override
			public void invalidated(Observable observable) {
				StringProperty s = (StringProperty) observable;
				System.out.println("Property  = " +s.get());
			}
		});
		
		feld.setText("John2");
	}
}
