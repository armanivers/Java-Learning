package VL07_JavaBean_PropertiesBindings_Observer_JavaFX.A36A;

import java.io.Serializable;

public class AngestellerBean implements Serializable{

	private static final long serialVersionUID = 990825306054737491L;
	
	private String name;
	private double monatsgehalt;
	
	public AngestellerBean(String name, double monatsgehalt) {
		this.name = name;
		this.monatsgehalt = monatsgehalt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonatsgehalt() {
		return monatsgehalt;
	}

	public void setMonatsgehalt(double monatsgehalt) {
		this.monatsgehalt = monatsgehalt;
	}
	
	
}

