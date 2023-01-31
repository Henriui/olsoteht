package view;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import controller.ValuuttakoneenOhjain;

public class ValuuttakoneenGUI extends Application implements IValuuttakoneenUI {

	private static Scene scene;
	private ValuuttakoneenOhjain ohjain;
	private ListView list1;
	private ListView list2;
	private TextField field1;
	private TextField field2;
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		ohjain = new ValuuttakoneenOhjain(this);
		
		HBox hbox = new HBox();

		// Vbox 1
		VBox vbox1 = new VBox();
        Text text1 = new Text("Mistä");
		list1 = new ListView<>();
		list1.getItems().addAll(ohjain.getValuutat());
		vbox1.getChildren().add(text1);
		vbox1.getChildren().add(list1);

		// Vbox 2
		VBox vbox2 = new VBox();
        Text text2 = new Text("Mihin");
		list2 = new ListView<>();
		list2.getItems().addAll(ohjain.getValuutat());
		vbox2.getChildren().add(text2);
		vbox2.getChildren().add(list2);
        
		// Määrä
		VBox vbox3 = new VBox();

		Text text3 = new Text("Määrä");
		field1 = new TextField();
        Button btn1 = new Button("Laske");

		// tulos
		Text text4 = new Text("Summa");
		field2 = new TextField();
		
		vbox3.getChildren().addAll(text3, field1, btn1, text4, field2);
		hbox.getChildren().addAll(vbox1, vbox2, vbox3);
		
			//button

			btn1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event){
					ohjain.muunnos();
				}
			});
	
		scene = new Scene(hbox,640, 480);
		stage.setScene(scene);
		stage.show();
	}
	
	
	@Override
	public int getMistäIndeksi() {
		return list1.getSelectionModel().getSelectedIndex();
	}
	
	@Override
	public int getMihinIndeksi() {
		return list2.getSelectionModel().getSelectedIndex();
	}

	@Override
	public double getMäärä() {
		String intText = field1.getText();
		int value = 1;
		try {
			value = Integer.parseInt(intText);
		} catch (Exception e) {
			System.out.println("NaN");
			Alert alert = new Alert(AlertType.WARNING, "Ei ollut numero" );
			alert.show();
		}
		return value;
	}

	@Override
	public void setTulos(double määrä) {
		field2.setText(Double.toString(määrä));
	}
}
