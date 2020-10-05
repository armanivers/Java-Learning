package VL07_JavaBean_PropertiesBindings_Observer_JavaFX.PropertiesLists;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXChoiceBoxObservableList extends Application {

    @Override
    public void start(Stage hauptStage) {
        ObservableList<MeineKlasse> meineDaten = FXCollections.observableArrayList();
        
        meineDaten.add(new MeineKlasse(10, "Aktiv"));
        meineDaten.add(new MeineKlasse(20, "Faul"));
        meineDaten.add(new MeineKlasse(30, "Tot"));
        
        ChoiceBox<MeineKlasse> choiceBox  = new ChoiceBox<MeineKlasse>(meineDaten);
        
        choiceBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	
                ChoiceBox<MeineKlasse> cb = (ChoiceBox<MeineKlasse>) event.getSource();
                
                MeineKlasse mk = cb.getValue();
                
                int index = cb.getSelectionModel().getSelectedIndex();
                System.out.println("index: "+index+" Wert: "+mk);
            }
        });
        
        VBox pane = new VBox();
        pane.getChildren().add(choiceBox);
        Scene scene = new Scene(pane, 250, 80);
        hauptStage.setScene(scene);
        hauptStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    private class MeineKlasse{
    	private final int key;
        private final String wert;

        public MeineKlasse(int key, String wert) {
            this.key = key;
            this.wert = wert;
        }

        public int getKey() {
            return key;
        }

        public String toString() {
            return wert;
        }
    }
}