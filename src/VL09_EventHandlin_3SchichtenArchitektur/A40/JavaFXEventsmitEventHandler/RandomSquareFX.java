package VL09_EventHandlin_3SchichtenArchitektur.A40.JavaFXEventsmitEventHandler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RandomSquareFX extends Application implements EventHandler<ActionEvent>{

	Rectangle r;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//x,y,width,height
		//width,height
		//width,height,Paint fill <- Color.(..) nutzen
		r = new Rectangle(30,30);

		int red = 0;
		int green = 0;
		int blue = 0;
		
		r.setFill(Color.rgb(red, green, blue));
		
		Button b = new Button("Change Color");
		b.setOnAction(this);
		
		BorderPane bp = new BorderPane();
		bp.setCenter(r);
		bp.setBottom(b);
		
		Scene scene = new Scene(bp, 200,100);
		primaryStage.setTitle("Random Square FX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void handle(ActionEvent event) {
		r.setFill(Color.rgb((int)(Math.random()*(255-0)+0),(int) (Math.random()*(255-0)+0),(int) (Math.random()*(255-0)+0)));
	}

	public static void main(String[] args) {
		launch();
	}
	
}