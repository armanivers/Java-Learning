package VL08_JavaFx.HBoxExample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class HBoxExample extends Application{
	
	@Override
	public void start(Stage stage) throws Exception {
		
		// HBox(), HBox(double spacing), HBox(double spacing, Node c1...c2), HBox(Node c1..c2) => spacing = 0
		
		HBox hb = new HBox(5);
		
		/*
		spacing -> Platz zw. Elemente (dazu zaehlt nicht Abstand zw. Element 1 und Rand links)
		(nicht statisch) hb.setSpacing(double)
		*/
		
		Button b1 = new Button("Button1");
		Button b2 = new Button("Button2");
		Button b3 = new Button("Button3");
		Button b4 = new Button("Button4");
		
		//Constraints
		
		/*
		(Zugriff statisch) HBox.setHgrow(Node c, Priority v) (Priority = Priority.ALWAYS/SOMETIMES/NEVER)
		
		=> 
		*/
		
		HBox.setHgrow(b1, Priority.ALWAYS);
		HBox.setHgrow(b2, Priority.NEVER);
		HBox.setHgrow(b3, Priority.NEVER);
		HBox.setHgrow(b4, Priority.NEVER);
		
		/*
		(Zugriff statisch) HBox.setMargin(Node c, new Insets(int top, int left, int bottom, int right));
		
		=>Abstand eines Elementes (z.B. Button) oben,links,unten,rechts, hier gilt insbesondere Abstand zum Rand des Fensters
		*/
		
		HBox.setMargin(b1, new Insets(10,10,5,5));
		
		/*
		(Zugriff nicht statisch) hb.setAlignment(Pos.(location))
		
		BASELINE_LEFT/CENTER/RIGHT,
		BOTTOM_LEFT/CENTER/RIGHT
		CENTER_LEFT/CENTER_RIGHT oder einfach nur Pos.CENTER
		TOP_LEFT/CENTER/RIGHT
		
		Baseline = vertikale Anordnung baseline(einfach defualt oben), bottom(ganz unten), center(alles mittig), top(alles oben)
		=>Anordnung der Elemente im Fenster, zb. HBox immer mittig des Fensters, oder alle Buttons am unteren Rand andordnen
		*/
		
		hb.setAlignment(Pos.CENTER);
		
		/*
		 (Zugriff nicht statisch) hb.setFillHeight(boolean value)
		 
		 => soll die horizontale Hoehe der Elemente eingehalten werden (z.B. Knopf ist von ganz oben bis ganz unten)
		 */
		
		b2.setMaxHeight(Double.MAX_VALUE);
		hb.setFillHeight(true);
		
		//falls kindelemente direkt im konstruktor, dann das .getChidlren().addAll() sparen!
		//HBox hb = new HBox(25,b1,b2,b3,b4);
		
		//falls kindelemente nicht im konstruktor
		hb.getChildren().addAll(b1,b2,b3,b4);
		
		Scene scene = new Scene(hb,300.0,150.0);
		stage.setScene(scene);
		stage.setTitle("HBox Example");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}

	
}
