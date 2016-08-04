package toggleButtonSample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ToggleButtonDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("ToggleButtonDemo");
		primaryStage.setWidth(250);
		primaryStage.setHeight(180);
		
		HBox hBox = new HBox();
		VBox vBox = new VBox();
		
		Scene scene = new Scene(new Group(vBox));
		primaryStage.setScene(scene);
		scene.getStylesheets().add("toggleButtonSample/ControlStyle.css");
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(50);
		rectangle.setFill(Color.WHITE);
		rectangle.setStroke(Color.DARKGRAY);
		rectangle.setStrokeWidth(2);
		rectangle.setArcHeight(10);
		rectangle.setArcWidth(10);
		
		final ToggleGroup tGroup = new ToggleGroup();
		
		tGroup.selectedToggleProperty().addListener(e -> {
			if (tGroup.getSelectedToggle() == null) {
				rectangle.setFill(Color.WHITE);
			}
			else {
				rectangle.setFill((Color)tGroup.getSelectedToggle().getUserData());
			}
		});
		
		ToggleButton tb1 = new ToggleButton("Minor");
		tb1.setToggleGroup(tGroup);
		tb1.setUserData(Color.LIGHTGREEN);
		tb1.setSelected(true);
		tb1.getStyleClass().add("toggle-button1");
		
		ToggleButton tb2 = new ToggleButton("Major");
		tb2.setToggleGroup(tGroup);
		tb2.setUserData(Color.LIGHTBLUE);
		tb2.getStyleClass().add("toggle-button2");
		
		ToggleButton tb3 = new ToggleButton("Critical");
		tb3.setToggleGroup(tGroup);
		tb3.setUserData(Color.SALMON);
		tb3.getStyleClass().add("toogle-button3");
		
		hBox.getChildren().addAll(tb1, tb2, tb3);
		
		vBox.getChildren().add(new Label("Priority:"));
		vBox.getChildren().add(hBox);
		vBox.getChildren().add(rectangle);
		
		primaryStage.show();
		rectangle.setWidth(hBox.getWidth());
	}

}
