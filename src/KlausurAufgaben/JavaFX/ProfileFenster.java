package KlausurAufgaben.JavaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ProfileFenster extends Application{

	@Override
	public void start(Stage stage) throws Exception{
		HBox hb = new HBox();
		
		Button b1 = new Button("Password Fenster");
		Button b2 = new Button("Threads Fenster");
		
		b1.setOnAction(e -> {
			new PasswortFenster(stage,"Change Password").showView();
		});
		
		b2.setOnAction( e-> {
			new ThreadFenster(stage,"Thread Fenster").showView();
		});
		
		hb.getChildren().addAll(b1,b2);
		hb.setAlignment(Pos.CENTER);
		Scene scene = new Scene(hb, 300, 150);
		stage.setScene(scene);
		stage.setTitle("Profile");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}
