package ch16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TestAreaDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Declare and create a description pane
		DescriptionPane descriptionPane = new DescriptionPane();
		//Set title, text, and image in the description pane
		descriptionPane.setTitle("Canada");
		String description = "The canadian national flag...";
		descriptionPane.setImageView(new ImageView("http://cs.armstrong.edu/liang/image/ca.gif"));
		descriptionPane.setDescription(description);
		
		Scene scene = new Scene(descriptionPane);
		primaryStage.setTitle("TestAreaDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
