package VL09_EventHandlin_3SchichtenArchitektur.A40.innereKlasse;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
		Rectangle r = new Rectangle(30,30);

		int red = 0;
		int green = 0;
		int blue = 0;
		
		r.setFill(Color.rgb(red, green, blue));
		
		Button b = new Button("Change Color");
		Label l = new Label("RGB: 0|0|0");
		
		b.setOnAction(new MyEventHandler(r,l));
		
		BorderPane bp = new BorderPane();
		bp.setCenter(r);
		bp.setBottom(b);
		bp.setRight(l);
		Scene scene = new Scene(bp, 200,100);
		primaryStage.setTitle("Random Square FX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public class MyEventHandler implements EventHandler<ActionEvent>{
		Rectangle target;
		Label text;
		public MyEventHandler(Rectangle target,Label text) {
			this.target = target;
			this.text = text;
		}
		public void handle(ActionEvent event) {
			int r = (int)(Math.random()*(255-0)+0);
			int g = (int)(Math.random()*(255-0)+0);
			int b = (int)(Math.random()*(255-0)+0);
			
			//Formel = (int) (Math.random() * (max-min) + min)
			
			text.setText("RGB = "+r+"|"+g+"|"+b);
			
			target.setFill(Color.rgb(r,g,b));
		}
	}
	
	public static void main(String[] args) {
		launch();
	}
	
}