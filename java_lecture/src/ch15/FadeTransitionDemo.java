package ch15;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeTransitionDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Ellipse ellipse = new Ellipse(10, 10, 100, 50);
		ellipse.setFill(Color.RED);
		ellipse.setStroke(Color.BLACK);
		ellipse.centerXProperty().bind(pane.widthProperty().divide(2));
		ellipse.centerYProperty().bind(pane.heightProperty().divide(2));
		ellipse.radiusXProperty().bind(pane.widthProperty().multiply(0.4));
		ellipse.radiusYProperty().bind(pane.heightProperty().multiply(0.4));
		pane.getChildren().add(ellipse);
		
		//Apply a fade transition to ellipse
		FadeTransition ft = new FadeTransition(Duration.millis(3000), ellipse);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setByValue(0.2);
		ft.setAutoReverse(true);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.play();
		
		//Control animation
		ellipse.setOnMousePressed(e -> ft.pause());
		ellipse.setOnMouseReleased(e -> ft.play());
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("FadeTransitionDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
