package scrollBarSample;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ScrollBarDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	final ScrollBar sc = new ScrollBar();
	final Image[] images = new Image[5];
	final ImageView[] pics = new ImageView[5];
	final VBox vBox = new VBox();
	DropShadow shadow = new DropShadow();
	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, 180, 180);
		scene.setFill(Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ScrollBarDemo");
		root.getChildren().addAll(vBox, sc);
		
		shadow.setColor(Color.GRAY);
		shadow.setOffsetX(2);
		shadow.setOffsetY(2);
		
		vBox.setLayoutX(5);
		vBox.setSpacing(10);
		
		sc.setLayoutX(scene.getWidth() - sc.getWidth());
		sc.setMin(0);
		sc.setOrientation(Orientation.VERTICAL);
		sc.setPrefHeight(180);
		sc.setMax(360);
		
		for (int i = 0; i < images.length; i++) {
			final Image image = images[i] = new Image(getClass().getResourceAsStream("fw" + (i + 1) + ".jpg"));
			final ImageView pic = pics[i] = new ImageView(image);
			pic.setEffect(shadow);
			vBox.getChildren().addAll(pic);
		}
		
		sc.valueProperty().addListener((ObservableValue<? extends Number> ov, 
	            Number old_val, Number new_val) -> {
	                vBox.setLayoutY(-new_val.doubleValue());
	        });
		primaryStage.show();
		
	}

}
