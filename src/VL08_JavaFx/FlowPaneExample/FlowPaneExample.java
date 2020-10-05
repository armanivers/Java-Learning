package VL08_JavaFx.FlowPaneExample;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application{

	@Override
	public void start(Stage stage) throws Exception{
		
		//FlowPane(double hgap,double vgap), (double v, double h, Node n1...n), (Node n1...n) wobei v+hgap = 0, 
		//FlowPane(Orientation orientation), (Orientation o, double h, double v), (Orientation o, double h, double v, Node n1...n) oder ohne v+h
		
		FlowPane fp = new FlowPane();
		
		//Constraints
		
		//V+H gap => (Abstand zw. Elemente (Buttons) zu einander oben/unten und links/rechts)
		fp.setHgap(10);
		fp.setVgap(10);
		
		//Orientation (default = Orientation.HORIZONTAL) => sollen Elemente links<->rechts (horizontal) angeordnet werden oder oben<->unten (vertical)
		fp.setOrientation(Orientation.VERTICAL);
		
		Button[] blist = {new Button("Button 1"), new Button("Button 2"), new Button("Button 3"),new Button("Button 4")};
		
		for(Button b: blist){
			fp.getChildren().add(b);
		}
		
		/*
 		Button b1 = new Button("Button 1");
		Button b2 = new Button("Button 2");
		Button b3 = new Button("Button 3");
		Button b4 = new Button("Button 4");
		fp.getChildren().addAll(b1,b2,b3,b4);
		*/
		
		Scene s = new Scene(fp,150.0,300.0);
		stage.setScene(s);
		stage.setTitle("FlowPane Example");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}
