package choiceBoxSample;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ChoiceBoxDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	final Label label = new Label("Hello");
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("ChoiceBoxDemo");
		primaryStage.setWidth(250);
		primaryStage.setHeight(180);
		
		final String[] greetings = new String[]{"Hello", "Hola", "你好",
		           "こんにちわ"};
		final ChoiceBox<String> cb= new ChoiceBox<String>(FXCollections.observableArrayList(
				"English", "Espanol",  "简体中文", "日本语"));
		
		cb.getSelectionModel().selectedIndexProperty().addListener(
		           (ObservableValue<? extends Number> ov,
		                Number old_val, Number new_val) -> {
		                    label.setText(greetings[new_val.intValue()]);            
		        });
		
		 	cb.setTooltip(new Tooltip("Select the language"));
	        cb.setValue("English");
	        HBox hb = new HBox();
	        hb.getChildren().addAll(cb, label);
	        hb.setSpacing(30);
	        hb.setAlignment(Pos.CENTER);
	        hb.setPadding(new Insets(10, 0, 0, 10));
	        
	        Scene scene = new Scene(new Group());
	        scene.setFill(Color.ALICEBLUE);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	        ((Group) scene.getRoot()).getChildren().add(hb);
	}

}
