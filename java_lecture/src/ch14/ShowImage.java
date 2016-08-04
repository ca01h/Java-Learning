package ch14;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowImage extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a pane to hold the Image views
		Pane pane = new HBox();
		pane.setPadding(new Insets(5,5,5,5));
		Image image = new Image("http://www.cs.armstrong.edu/liang/image/us.gif");
		pane.getChildren().add(new ImageView(image));
		
		ImageView imageView2 = new ImageView(image);
		imageView2.setFitHeight(100);
		imageView2.setFitWidth(100);
		pane.getChildren().add(imageView2);
		
		ImageView imageView3 = new ImageView(image);
		imageView3.setRotate(90);
		pane.getChildren().add(imageView3);
		
		//Create a scene and place it in the Stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Show Image");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
