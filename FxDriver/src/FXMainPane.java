


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventTarget;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	
	Button Button1;
	Button Button2;
	Button Button3;
	Button Button4;
	Button Button5;
	Button Button6;
	Label Label1;
	TextField TextField;
	HBox hbox1;
	HBox hbox2;
	
	
	//student Task #4:
	//  declare an instance of DataManager
	
	DataManager datamanager= new DataManager();
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		Button1 = new Button("Hello");
		Button2 = new Button("Howdy");
		Button3 = new Button(" Chinese");
		Button4 = new Button("Clear");
		Button5 =new Button(" Exit");
		Button6 = new Button("Tena Yistligni");
		Label1 = new Label("feedback");
		TextField = new TextField();
		HBox hbox1 = new HBox();
		HBox hbox2 = new HBox();
		Insets inTheSets= new Insets(6);
		
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		hbox1.setMargin(Button1,inTheSets);
		hbox1.setMargin(Button2, inTheSets);
		hbox1.setMargin(Button3, inTheSets);
		hbox1.setMargin(Button4, inTheSets);
		hbox1.setMargin(Button5,inTheSets);
		hbox1.setMargin(Button6, inTheSets);
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		hbox2.setMargin(TextField,inTheSets);
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		hbox1.getChildren().addAll(Button1,Button2,Button3,Button4,Button5,Button6);
		hbox2.getChildren().addAll(Label1,TextField);
		this.getChildren().addAll(hbox1,hbox2);
		
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	class handler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent event) {
			EventTarget TargetButton = event.getTarget(); 
			if(TargetButton == Button1)
			{
				TextField.setText(datamanager.getHello());
			}else if (TargetButton == Button2)
			{
				TextField.setText(datamanager.getHowdy());
			}else if(TargetButton == Button3)
			{
				TextField.setText(datamanager.getChinese());
				
			}else if (TargetButton == Button4)
			{
				TextField.setText(" ");
			}else if (TargetButton == Button5)
			{
				Platform.exit();
				System.exit(0);
			}
		}
	}
}
	
