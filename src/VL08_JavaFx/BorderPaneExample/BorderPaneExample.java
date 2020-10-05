package VL08_JavaFx.BorderPaneExample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application{
	
	@Override
	public void start(Stage stage) throws Exception{
		
		// BorderPane(Node center), BorderPane(Node center, Node top, Node right, Node bottom, Node left)
		BorderPane bp = new BorderPane();
		
		Button[] blist = {new Button("Button 1"), new Button("Butotn 2"), new Button("Button 3"), new Button("Button 4"), new Button("Button 5")};
		
		bp.setTop(blist[0]);
		bp.setRight(blist[1]);
		bp.setLeft(blist[2]);
		bp.setBottom(blist[3]);
		bp.setCenter(blist[4]);
		
		// Set the alignment of the Top Text to Center
        BorderPane.setAlignment(blist[0],Pos.TOP_CENTER);
        // Set the alignment of the Right Text to Center
        BorderPane.setAlignment(blist[1],Pos.CENTER_RIGHT);
        // Set the alignment of the Left Text to Center
        BorderPane.setAlignment(blist[2],Pos.CENTER_LEFT);
        // Set the alignment of the Bottom Text to Center
        BorderPane.setAlignment(blist[3],Pos.BOTTOM_CENTER);
        // Set the alignment of the Center Text to Center
        BorderPane.setAlignment(blist[4], Pos.CENTER);

        
        
        // wenn man die Werte nicht im Konstruktor vom Scene setzen will
		// bp.setPrefSize(300, 300);
        
		Scene s = new Scene(bp, 300.0,300.0);
		stage.setScene(s);
		stage.setTitle("BorderPane Example");
		
		//little extra, disable window resizing
		stage.setResizable(false);
		
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}

}
