package VL09_EventHandlin_3SchichtenArchitektur.A41;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MouseEventsFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p = new Pane();
		
		//wenn Mausbutton geclickt und auch losgelassen wird (nach dem loslassen die Position betrachten)
//		p.setOnMouseClicked(new EventHandler<MouseEvent>() {
//			public void handle(MouseEvent event) {
//				Rectangle r = new Rectangle(event.getSceneX()-15,event.getSceneY()-15,30,30);
//				r.setFill(Color.BLUE);
//				p.getChildren().add(r);
//			}
//		});
		
		//wenn Mausbutton geglickt wird (position direkt beim click beachten)
		p.setOnMousePressed(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				Rectangle r = new Rectangle(event.getSceneX()-15,event.getSceneY()-15,30,30);
				r.setFill(Color.BLUE);
				p.getChildren().add(r);
			}
		});
		
		Scene scene = new Scene(p,500,500);
		primaryStage.setTitle("Quadrat");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
