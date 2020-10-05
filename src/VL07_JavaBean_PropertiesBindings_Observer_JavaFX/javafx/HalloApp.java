package VL07_JavaBean_PropertiesBindings_Observer_JavaFX.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HalloApp extends Application {
	@Override
	public void start(Stage stage) {
		Label nachricht = new Label("Hallo Programmierkurs 1");
		nachricht.setFont(new Font(50));
		Scene szene = new Scene(nachricht);
		stage.setScene(szene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}
