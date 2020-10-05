package KlausurAufgaben.JavaFX;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class PasswortFenster extends Modalstage{
	
	public PasswortFenster(Stage primaryStage,String title) {
		super(primaryStage);
		this.setTitle(title);
	}

	@Override
	public void showView() {
		GridPane gp = new GridPane();
		
		Label currentPasswortL = new Label("Currently:");
		Label currentPasswort = new Label("");
		Label text = new Label("Passwort:");
		TextField tf = new TextField();
		Button b = new Button("OK");
		
		Label m1 = new Label("Suche:");
		TextField tfSuche = new TextField();
		Button bSuche = new Button("such");
		
		//Beispiel
		Node[] n = {currentPasswort, text};
		
		tf.textProperty().addListener( (x,y,z) ->{
			//x(Observable), y(oldValue), z(newValue)
			((Label) n[0]).setText(z);
			//currentPasswort.setText(z);
		});
		
		b.setOnAction(e->{
			currentPasswort.setText(tf.getText());
		});
		
		gp.add(currentPasswortL, 0, 0);
		
		
		gp.add(text, 0, 1);
		
		gp.add(currentPasswort, 1, 0);
		
		
		gp.add(tf, 1, 1);
		
		gp.add(b,1,2);
		
		gp.add(m1, 0, 3);
		gp.add(tfSuche, 1, 3);
		gp.add(bSuche, 2, 3);
		
		gp.setPadding(new Insets(20.0)); //Aussenrand (von alle gridfelder zu programmfenster)

        for(Node c : gp.getChildren()) {
        	GridPane.setHgrow(c, Priority.ALWAYS);
        	GridPane.setVgrow(c, Priority.ALWAYS);
        }
        
//        GridPane.setHgrow(currentPasswortL, Priority.NEVER);
//    	GridPane.setVgrow(currentPasswortL, Priority.NEVER);
//        
//    	GridPane.setHgrow(text, Priority.NEVER);
//    	GridPane.setVgrow(text, Priority.NEVER);
    	
        GridPane.setHalignment(currentPasswortL, HPos.LEFT);
		GridPane.setHalignment(currentPasswort, HPos.CENTER);
		GridPane.setHalignment(text, HPos.LEFT);
		
		GridPane.setValignment(b, VPos.CENTER);
		GridPane.setHalignment(b, HPos.CENTER);
		
		GridPane.setHalignment(m1, HPos.LEFT);
		GridPane.setHalignment(tfSuche, HPos.CENTER);
		GridPane.setHalignment(bSuche, HPos.CENTER);
		
		gp.setHgap(10);
		gp.setVgap(10);
		
		//gp.setGridLinesVisible(true);
		Scene scene = new Scene(gp,300,150);
		
		this.setScene(scene);
		this.show();
		
	}
	
	
	
}
