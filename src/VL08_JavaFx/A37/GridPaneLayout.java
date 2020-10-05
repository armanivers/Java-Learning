package VL08_JavaFx.A37;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneLayout extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane gp = new GridPane();
		
		//Aussenrand von dem ganzen GridPane
		gp.setPadding(new Insets(10.0));
		
		//Rand zwischen Zeilen und Spalten
		gp.setVgap(5.0);
		gp.setHgap(5.0);
		
		ListView<String> lv = new ListView<String>();

		for(int i = 0; i <= 50 ; i++) {
			lv.getItems().add("This is Item "+i);
		}
		
		Label l1 = new Label("Label 1");
		Label l2 = new Label("Label 2");
		
		TextField text1 = new TextField("TextField 1");
		TextField text2 = new TextField("TextField 2");
		TextField text3 = new TextField("TextField 3");
		
		GridPane.setValignment(text3, VPos.TOP);
		
		Button button = new Button("Start");
		
		GridPane.setHalignment(button, HPos.CENTER);
		
		//Erster Wert LINKS-RECHTS (x), zweiter Wert OBEN-UNTEN (y)
		
		//Liste
		gp.add(lv,0,0,1,3);
		
		//Labels
		gp.add(l1, 1, 0);
		gp.add(l2, 1, 1);
		
		//Textfields
		gp.add(text1, 2, 0);
		gp.add(text2, 2, 1);
		gp.add(text3, 2, 2);
		
		//Button
		gp.add(button, 2, 3);
		
		Scene scene = new Scene(gp,500.0,400.0);
		primaryStage.setTitle("GridPane Layout");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
