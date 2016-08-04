package ch15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DisplayResizableClock extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		ClockPane clock = new ClockPane();
		String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
		Label lblCurrentTime = new Label(timeString);
		
		//Place clock and label in the border pane
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(clock);
		borderPane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime, Pos.CENTER);
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(borderPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("DisplayResizableClock");
		primaryStage.show();
		
		borderPane.widthProperty().addListener(ov ->
			clock.setW(borderPane.getWidth())
		);
		borderPane.heightProperty().addListener(ov ->
			clock.setH(borderPane.getHeight())
		);
	}

}
