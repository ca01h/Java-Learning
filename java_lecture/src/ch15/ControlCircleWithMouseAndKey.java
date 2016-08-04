package ch15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ControlCircleWithMouseAndKey extends Application{
	
	private CirclePane circlePane = new CirclePane();
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btEnlarge = new Button("Enlarge");
		Button btShrink = new Button("Shrink");
		hBox.getChildren().addAll(btEnlarge, btShrink);
		
		//Create and register the handler
		btEnlarge.setOnAction(e -> {
			CirclePane.Enlarge();
			circlePane.requestFocus();
			});
		btShrink.setOnAction(e -> {
			CirclePane.Shrink();
			circlePane.requestFocus();
			});
		
		circlePane.setOnMouseClicked(e ->{
			if (e.getButton() == MouseButton.PRIMARY) {
				CirclePane.Enlarge();
			}
			if (e.getButton() == MouseButton.SECONDARY) {
				CirclePane.Shrink();
			}
			circlePane.requestFocus();
		});
		circlePane.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.U) {
				CirclePane.Enlarge();
			}
			if (e.getCode() == KeyCode.D) {
				CirclePane.Shrink();
			}
		});
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		
		Scene scene = new Scene(borderPane);
		primaryStage.setTitle("ControlCircleWithMouseAndKey");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		circlePane.requestFocus();
	}

}
