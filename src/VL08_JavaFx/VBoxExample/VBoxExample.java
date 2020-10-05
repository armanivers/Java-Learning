package VL08_JavaFx.VBoxExample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		Button b1 = new Button("Button 1");
		Button b2 = new Button("Button 2");
		Button b3 = new Button("Button 3");
		Button b4 = new Button("Button 4");
		
		VBox vb = new VBox(5,b1,b2,b3,b4);
		
		Button[] blist = {b1,b2,b3,b4};
		
		for(Button b: blist) {
			VBox.setMargin(b, new Insets(10,10,10,10));
			b.setMaxWidth(130);
		}
		
		vb.setAlignment(Pos.CENTER_LEFT);
		vb.setFillWidth(true);
		
		Scene s = new Scene(vb, 150.0,300.0);
		stage.setScene(s);
		stage.setTitle("VBox Example");
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
