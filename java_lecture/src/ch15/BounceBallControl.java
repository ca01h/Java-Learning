package ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class BounceBallControl extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BallPane ballPane = new BallPane();
		
		ballPane.setOnMousePressed(e -> ballPane.pause());
		ballPane.setOnMouseReleased(e -> ballPane.play());
		
		ballPane.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.U) {
				ballPane.increaseSpeed();
			}
			if (e.getCode() == KeyCode.D) {
				ballPane.decreaseSpeed();
			}
		});
		
		Scene scene =new Scene(ballPane, 250, 150);
		primaryStage.setTitle("BounceBallControl");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		ballPane.requestFocus();
		
	}

}
