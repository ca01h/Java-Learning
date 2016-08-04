package ch15;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TimelineDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		Text text = new Text(20, 50, "Programming is fun");
		text.setStroke(Color.RED);
		pane.getChildren().add(text);
		
		//Create a handler to change the text
		EventHandler<ActionEvent> eventHandler = e -> {
			if (text.getText().length() != 0) {
				text.setText("");
			} else {
				text.setText("Programming is fun");
			}
		};
		
		//Create an animation for alternating text
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(500), eventHandler));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		
		//Pause and resume animation
		text.setOnMouseClicked(e ->{
			if (animation.getStatus() == Animation.Status.PAUSED) {
				animation.play();
			} else {
				animation.pause();
			}
		});
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("TimelineDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
