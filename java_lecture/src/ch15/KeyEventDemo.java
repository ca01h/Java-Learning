package ch15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEventDemo extends Application{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Create a pane and set its properties
		Pane pane = new Pane();
		Text text = new Text(20, 20, "A");
		
		pane.getChildren().add(text);
		text.setOnKeyPressed(e -> {
			switch (e.getCode()) {
				case DOWN: text.setY(text.getY() + 10); break;
				case UP: text.setY(text.getY() - 10); break;
				case LEFT: text.setX(text.getX() - 10);break;
				case RIGHT: text.setX(text.getX() + 10);break;
				default:
				if (Character.isLetterOrDigit(e.getText().charAt(0))) {
					text.setText(e.getText());
				}
			}
		});
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("KeyEventDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		text.requestFocus();
	}
}
