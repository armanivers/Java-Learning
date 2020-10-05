package VL07_JavaBean_PropertiesBindings_Observer_JavaFX.A36A;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Control;


public class EingabeFeld extends Control{

	private StringProperty text;
	
	public EingabeFeld(String text) {
		super();
		this.text = new SimpleStringProperty(text);
	}
	
	public StringProperty textProperty() {
		return text;
	}
	
	public void setText(String text) {
		this.text.set(text);
	}
	
	public String getText() {
		return text.get();
	}
}
