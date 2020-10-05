package KlausurAufgaben.JavaFX;

import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ThreadFenster extends Modalstage{

	public ThreadFenster(Stage primaryStage,String title) {
		super(primaryStage);
		this.setTitle(title);
	}

	@Override
	public void showView() {
		
		BorderPane bp = new BorderPane();
		
		TextField tf = new TextField();
		Label status = new Label();
		Button b = new Button("Berechnen");
		
		bp.setBottom(tf);
		bp.setRight(b);
		
		b.setOnAction(e -> {
			b.setDisable(true);
			
			final ProgressBar pb = new ProgressBar();
			bp.setCenter(pb);
			
			final int eingabe = Integer.parseInt(tf.getText());
			final Task<Integer> task = new PrimeTask(eingabe);
			
			pb.progressProperty().bind(task.progressProperty());
			
			task.setOnSucceeded(v -> {
				status.setText(String.valueOf(task.getValue()));
				bp.setCenter(status);
				b.setDisable(false);
			});
			
			task.setOnCancelled(v -> {
				status.setText("Cancelled");
				b.setDisable(false);
			});
			
			Thread runner = new Thread(task);
			runner.setDaemon(true);
			runner.start();
			
		});
		
		Scene scene = new Scene(bp,300,150);
		this.setScene(scene);
		this.show();
	}

}
