package VL09_EventHandlin_3SchichtenArchitektur.A39;

import VL09_EventHandlin_3SchichtenArchitektur.A40.normaleKlasseMitEventHandler.MyEventHandler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RandomSquareFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//x,y,width,height
		//width,height
		//width,height,Paint fill <- Color.(..) nutzen
		Rectangle r = new Rectangle(100,100);

		int red = 0;
		int green = 0;
		int blue = 0;
		
		r.setFill(Color.rgb(red, green, blue));
		
		Button b = new Button("Change Color");
		//b.setOnAction(new MyEventHandler(r));
		b.setOnAction(e -> {
			r.setFill(Color.rgb((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
		});
		
		BorderPane bp = new BorderPane(r,null,null,b,null);
		BorderPane.setAlignment(b, Pos.CENTER);
		
		Scene scene = new Scene(bp, 200,300);
		primaryStage.setTitle("Random Square FX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}
	
}
