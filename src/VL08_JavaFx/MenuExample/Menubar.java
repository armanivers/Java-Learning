package VL08_JavaFx.MenuExample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Menubar extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane bp = new BorderPane();
		
		//Menu Objekt
		MenuBar mb = new MenuBar();
		
		//-----------------------------------------------------------------------------
		//Erstes menu in der Zeile
		Menu datei = new Menu("Datei");
		
		//Untermenues von dem ersten Element
		MenuItem itemLaden = new MenuItem("Laden");
		MenuItem itemSpeichern = new MenuItem("Speichern");
		
		//Untermenues im ersten Menu verkunpfen
		datei.getItems().addAll(itemLaden,new SeparatorMenuItem(),itemSpeichern);
		
		
		//----------------------------------------------------------------------------
		//zweites Menu
		Menu hilfe = new Menu("Hilfe");
		
		//Untermenues von dem zweiten Element
		Menu kontaktiereUns = new Menu("Kontaktiere Uns");
		MenuItem itemTelefon = new MenuItem("Per Telefon");
		MenuItem itemEmail = new MenuItem("Per Email");
		kontaktiereUns.getItems().addAll(itemTelefon,itemEmail);
		
		hilfe.getItems().add(kontaktiereUns);
		
		//Erstes Menu in dem Menuobjekt hinzufugen
		mb.getMenus().addAll(datei,hilfe);
		
		bp.setTop(mb);
		
		Scene scene = new Scene(bp,300.0,150.0);
		primaryStage.setTitle("Menubar Design");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
