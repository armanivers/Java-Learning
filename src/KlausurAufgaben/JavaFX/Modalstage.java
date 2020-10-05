package KlausurAufgaben.JavaFX;

import javafx.stage.Modality;
import javafx.stage.Stage;

public abstract class Modalstage extends Stage{
	
	public Modalstage(Stage primaryStage){
	       super();
	       this.initOwner(primaryStage);
	       this.initModality(Modality.WINDOW_MODAL);
	}
	public abstract void showView();
}
