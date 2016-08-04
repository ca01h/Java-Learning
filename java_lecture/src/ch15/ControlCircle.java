package ch15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application{

	

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
		btEnlarge.setOnAction(new EnlagerHandler());
		btShrink.setOnAction(new ShrinkHandler());
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setTitle("ControlCircle");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}

class EnlagerHandler implements EventHandler<ActionEvent>{
	@Override
	public void handle(ActionEvent arg0) {
		CirclePane.Enlarge();
	}
}

class ShrinkHandler implements EventHandler<ActionEvent>{
	public void handle(ActionEvent arg0) {
		CirclePane.Shrink();
	}
}

class CirclePane extends StackPane{
	private static Circle circle = new Circle(50);
	
	public CirclePane() {
		getChildren().add(circle);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
	}
	
	public static void Enlarge() {
		circle.setRadius(circle.getRadius() + 2);
	}
	
	public static void Shrink() {
		circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2 : circle.getRadius());
	}
}



