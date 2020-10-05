package VL08_JavaFx.GUI_TEST1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Gui1 extends Application{
	
	@Override
	public void start(Stage stage) throws Exception{
		
		//Main window
		BorderPane bpmain = new BorderPane();
		
		//Menu
		MenuBar mb = new MenuBar();
		//Menu 1
		Menu datei = new Menu("Datei");
		//Menu Items
		MenuItem speichern = new MenuItem("Speichern");
		MenuItem beenden = new MenuItem("Beenden");
		datei.getItems().addAll(speichern,new SeparatorMenuItem(),beenden);
		mb.getMenus().add(datei);
		
		//Set top to menubar
		bpmain.setTop(mb);
		
		//VBox to hold center
		VBox center = new VBox();
		

		
		Label pfad = new Label("Pfad:");
		TextField tf = new TextField();
		Button auflisten = new Button("Auflisten");

		BorderPane bptop = new BorderPane(tf, null, auflisten, null, pfad);
		
		TextArea ta1 = new TextArea();
		TextArea ta2 = new TextArea();
		BorderPane bpcen = new BorderPane(null,null,ta2,null,ta1);

		center.getChildren().addAll(bptop,bpcen);

		bpmain.setCenter(center);
		
		Label notiz = new Label("Notiz");
		TextArea notizen = new TextArea();

		HBox down = new HBox();
		down.getChildren().addAll(notiz,notizen);
		
		bpmain.setBottom(down);
		
		Scene s = new Scene(bpmain,700,500);

		stage.setScene(s);
		stage.setTitle("Notizen");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}
