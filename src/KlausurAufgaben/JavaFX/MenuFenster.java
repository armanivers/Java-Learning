package KlausurAufgaben.JavaFX;


import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class MenuFenster extends Modalstage{

	public MenuFenster(Stage stage,String title) {
		super(stage);
		this.setTitle(title);
	}
	
	public void showView() {
		GridPane gp = new GridPane();
		
		MenuBar mb = new MenuBar();
		
		Menu help = new Menu("Help");
		
		MenuItem contact = new MenuItem("Contact Us");
		
		Menu moreOptions = new Menu("More Options");
		
		mb.getMenus().add(help);
		help.getItems().addAll(contact,new SeparatorMenuItem(),moreOptions);
		
		gp.add(mb, 0, 0);
		
		Button b = new Button("Search");
		Label l = new Label("Input");
		TextField tf = new TextField();
		
		gp.add(l, 0, 1);
		gp.add(tf, 1, 1);
		gp.add(b, 2, 1);
		
		gp.setHgap(5);
		gp.setHgap(5);
		
		GridPane.setHalignment(l, HPos.LEFT);
		GridPane.setValignment(l, VPos.CENTER);
		
		GridPane.setHgrow(tf, Priority.ALWAYS);
		GridPane.setVgrow(tf, Priority.ALWAYS);
		
		gp.setPadding(new Insets(5));
		gp.setGridLinesVisible(true);
		Scene s = new Scene(gp,200,150);
		
		this.setScene(s);
		this.show();
	}
	
}
