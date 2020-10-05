package VL08_JavaFx.GridPaneExample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application{

	@Override
	public void start(Stage stage) throws Exception{
		
		//default konstruktor, hat keine Parameter, hgap+vgap = 0 
		GridPane gp = new GridPane();
		
		Button b1 = new Button("Button 1");
		Button b2 = new Button("Button 2");
		Button b3 = new Button("Button 3");
		Button b4 = new Button("Button 4");
		
		Button[] blist = {b1,b2,b3,b4};
		
		Label l1 = new Label("Text 1");
		Label l2 = new Label("Text 2");
		Label l3 = new Label("Text 3");
		Label l4 = new Label("Text 4");
		
		Label[] llist = {l1,l2,l3,l4};
		
		gp.add(b1, 0,0,2,2);
		gp.add(b2, 2,0,1,1);
		gp.add(b3, 2,1,1,1);
		gp.add(b4, 0,2,1,1);
		
		//Abstand zwischen den Zeilen und Spalten
		gp.setVgap(10);
		gp.setHgap(10);
		
		for(Label l: llist) {
			GridPane.setHalignment(l, HPos.CENTER);
			GridPane.setValignment(l, VPos.CENTER);
		}
		
		Scene s = new Scene(gp,300,300);
		gp.setGridLinesVisible(true);
		stage.setScene(s);
		stage.setTitle("GridPane Example");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}
