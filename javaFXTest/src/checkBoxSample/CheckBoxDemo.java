package checkBoxSample;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("CheckBoxDemo");
		primaryStage.setHeight(180);
		primaryStage.setWidth(250);
		
		final String[] names = new String[]{"Security", "Project", "Chart"};
		final Image[] images = new Image[names.length];
		final ImageView[] icons = new ImageView[names.length];
		final CheckBox[] cbs = new CheckBox[names.length];
		
		for (int i = 0; i < names.length; i++) {
			final Image image = images[i] = new Image(getClass().getResourceAsStream(names[i] + ".png"));
			final ImageView icon = icons[i] = new ImageView();
			final CheckBox cb = cbs[i] = new CheckBox(names[i]);
			cb.selectedProperty().addListener(
                    (ObservableValue<? extends Boolean> ov,
                    Boolean old_val, Boolean new_val) -> {
                        icon.setImage(new_val ? image : null);                
            });
		}
		
		HBox hBox = new HBox();
		VBox vBox = new VBox();
		HBox hBox2 = new HBox();
		
		hBox.setSpacing(10);
		for (int i = 0; i < names.length; i++) {
			vBox.getChildren().add(cbs[i]);
			hBox2.getChildren().add(icons[i]);
		}
		vBox.setSpacing(10);
		hBox.getChildren().addAll(vBox, hBox2);
		
		Scene scene = new Scene(hBox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
