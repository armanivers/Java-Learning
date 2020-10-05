package VL09_EventHandlin_3SchichtenArchitektur.A40.normaleKlasseMitEventHandler;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MyEventHandler implements EventHandler<ActionEvent>{

	Rectangle target;
	
	public MyEventHandler(Rectangle target) {
		this.target = target;
	}
	
	@Override
	public void handle(ActionEvent event) {
		target.setFill(Color.rgb((int)(Math.random()*(255-0)+0),(int) (Math.random()*(255-0)+0),(int) (Math.random()*(255-0)+0)));
		
	}

}
