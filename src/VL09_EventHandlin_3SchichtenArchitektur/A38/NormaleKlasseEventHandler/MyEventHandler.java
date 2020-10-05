package VL09_EventHandlin_3SchichtenArchitektur.A38.NormaleKlasseEventHandler;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MyEventHandler implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent event) {
		System.out.println("Hallo FX");
	}

}
