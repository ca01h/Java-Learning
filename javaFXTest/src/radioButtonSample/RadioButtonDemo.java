package radioButtonSample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonDemo extends Application{
	final ToggleGroup group = new ToggleGroup();
	final ImageView icon = new ImageView();
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		RadioButton rb1 = new RadioButton("Home");
		rb1.setToggleGroup(group);
		rb1.setSelected(true);
		rb1.setUserData("Home");
		
		RadioButton rb2 = new RadioButton("Calendar");
		rb2.setToggleGroup(group);
		rb2.setUserData("Calendar");
		rb2.requestFocus();
		
		RadioButton rb3 = new RadioButton("Contacts");
		rb3.setToggleGroup(group);
		rb3.setUserData("Contacts");
		
		group.selectedToggleProperty().addListener(e -> {
			if (group.getSelectedToggle() != null) {
				final Image image = new Image(
						getClass().getResourceAsStream(
								group.getSelectedToggle().getUserData().toString() + ".jpg")
						);
				icon.setImage(image);
			}
		});
		
		VBox vBox = new VBox();
		HBox hBox = new HBox();
		
		vBox.setLayoutX(20);
		vBox.setLayoutY(20);
		vBox.getChildren().addAll(rb1, rb2, rb3);
		vBox.setSpacing(10);
		
		hBox.getChildren().add(vBox);
		hBox.getChildren().add(icon);
		hBox.setSpacing(50);
		hBox.setPadding(new Insets(20, 10, 15, 10));
		
		//Scene scene = new Scene(new Group());
		//((Group) scene.getRoot()).getChildren().add(hBox);
		Scene scene = new Scene(hBox);
		primaryStage.setScene(scene);
		primaryStage.setTitle("RadioButtonDemo");
		primaryStage.show();
	}
}
