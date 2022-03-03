import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;

public class FxDriver  extends Application {
	public static void main (String[] args) {
		launch(args);
		
	}
	public void start(Stage stage){
		// this is our first task
		FXMainPane root = new FXMainPane();
		stage.setScene(new Scene(root,400, 400));
		stage.setTitle("HELLO FXDRIVER");
		stage.show();
		
	}

}
