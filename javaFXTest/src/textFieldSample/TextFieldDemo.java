package textFieldSample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TextFieldDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setVgap(5);
		gridPane.setHgap(5);
		
		final TextField firstName = new TextField();
		firstName.setPromptText("Enter First name");
		GridPane.setConstraints(firstName, 0, 0);
		
		final TextField lastName = new TextField();
		lastName.setPromptText("Enter Last name");
		GridPane.setConstraints(lastName, 0, 1);
		
		final TextField comment = new TextField();
		comment.setPromptText("Enter You comments");
		GridPane.setConstraints(comment, 0, 2);
		
		Button submit = new Button("Submit");
		GridPane.setConstraints(submit, 1, 0);
		
		Button clear = new Button("Clear");
		GridPane.setConstraints(clear, 2, 0);
		
		final Label label = new Label();
        GridPane.setConstraints(label, 0, 3);
        GridPane.setColumnSpan(label, 2);
		
        gridPane.getChildren().addAll(firstName, lastName, comment, submit, clear,label);
		
		submit.setOnAction(e -> {
			if (comment.getText() != null && !comment.getText().isEmpty()) {
				label.setText(firstName.getText() + lastName.getText() + 
						"Thank you for your comment");
			}
			else {
				label.setText("You haven't left a comment");
			}
		});
		
		clear.setOnAction(e -> {
			firstName.clear();
			lastName.clear();
			comment.clear();
		});
		
		Scene scene = new Scene(gridPane);
		primaryStage.setTitle("TextFieldDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
