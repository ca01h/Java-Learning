package ch16;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	private String[] flagTitles = {"Canada", "China", "Denmark", "France", "Germany", "Indian", "Norway"
			,"United Kingdom", "United States of America"};
	private ImageView[] flagImage = {new ImageView("http://cs.armstrong.edu/liang/image/ca.gif"),
			new ImageView("http://cs.armstrong.edu/liang/image/china.gif"),
			new ImageView("http://cs.armstrong.edu/liang/image/denmark.gif"),
			new ImageView("http://cs.armstrong.edu/liang/image/fr.gif"),
			new ImageView("http://cs.armstrong.edu/liang/image/germany.gif"),
			new ImageView("http://cs.armstrong.edu/liang/image/india.gif"),
			new ImageView("http://cs.armstrong.edu/liang/image/norway.gif"),
			new ImageView("http://cs.armstrong.edu/liang/image/uk.gif"),
			new ImageView("http://cs.armstrong.edu/liang/image/us.gif")};
	private String[] flagDescription = new String[9];
	private DescriptionPane descriptionPane = new DescriptionPane();
	private ComboBox<String> comboBox = new ComboBox<>();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Set text description
		flagDescription[0] = "The Canadian national flag ...";
		flagDescription[1] = "The China national flag ...";
		flagDescription[2] = "The Denmark national flag ...";
		flagDescription[3] = "The France national flag ...";
		flagDescription[4] = "The Germamy national flag ...";
		flagDescription[5] = "The India national flag ...";
		flagDescription[6] = "The Normany national flag ...";
		flagDescription[7] = "The UK national flag ...";
		flagDescription[8] = "The US national flag ...";
		
		//Set First country (Canada) for display
		setDisplay(0);
		
		//Add combo box and description pane to the border pane
		BorderPane pane = new BorderPane();
		
		BorderPane paneForComboBox = new BorderPane();
		paneForComboBox.setLeft(new Label("Select a country"));
		paneForComboBox.setCenter(comboBox);
		pane.setTop(paneForComboBox);
		comboBox.setPrefWidth(400);
		comboBox.setValue("Canada");
		
		ObservableList<String> items = FXCollections.observableArrayList(flagTitles);
		comboBox.getItems().addAll(items);
		pane.setCenter(descriptionPane);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ComboBoxDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void setDisplay(int index) {
		descriptionPane.setTitle(flagTitles[index]);
		descriptionPane.setImageView(flagImage[index]);
		descriptionPane.setDescription(flagDescription[index]);
	}

}
