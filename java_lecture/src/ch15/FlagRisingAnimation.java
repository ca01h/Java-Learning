package ch15;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlagRisingAnimation extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Create a pane
		Pane pane = new Pane();
		
		//Add a image view and add it to pane
		ImageView imageView = new ImageView(new Image("http:www.cs.armstrong.edu/liang/image/us.gif"));
		pane.getChildren().add(imageView);
		
		//Create a path transition
		PathTransition pt = new PathTransition(Duration.millis(10000), new Line(100, 200, 100, 0), imageView);
		pt.setCycleCount(5);
		pt.play();
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("FlagRisingAnimation");
		primaryStage.show();
		
	}

}
