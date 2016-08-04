package oneCalculter;

import java.util.LinkedList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class CaculterUI extends Application{
	
	private String KEY[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "."};
	private String CMD[] = {"C", "�˸�"};
	private String OPT[] = {"+", "-", "*", "/","1/x", "="};
	
	private Button keys[] = new Button[KEY.length];
	private Button cmds[] = new Button[CMD.length];
	private Button opts[] = new Button[OPT.length];
	
	
	//�ж��û��Ƿ��ǵ�һ��������ֵ
	private boolean firstDigit = false;
	
	//tField��Ž��
	private TextField tField = new TextField();
	
	//ʹ���������洢��������
	private LinkedList<String> calLinkedList = new LinkedList<String>();
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane borderPane = new BorderPane();
		
		//FlowPane��Ű�ť
		FlowPane flowPane = new FlowPane();
		flowPane.setPadding(new Insets(11, 12, 13, 14));
		flowPane.setHgap(5);
		flowPane.setVgap(5);
		
		
		tField.setPrefColumnCount(1);
		tField.setFont(Font.font(tField.getText(), FontWeight.BOLD, FontPosture.REGULAR, 25));
		tField.setAlignment(Pos.BASELINE_RIGHT);
		tField.setPrefHeight(50);
		tField.setPrefWidth(480);
		tField.setEditable(false);
		
		//����ť����flowPane�����
		for (int i = 0; i < KEY.length; i++) {
			keys[i] = new Button(KEY[i]);
			keys[i].setFont(Font.font(KEY[i], FontWeight.NORMAL, FontPosture.REGULAR ,20));
			keys[i].setStyle("-fx-background-color: lightblue");
			flowPane.getChildren().add(keys[i]);
		}
		for (int i = 0; i < OPT.length; i++) {
			opts[i] = new Button(OPT[i]);
			opts[i].setFont(Font.font(OPT[i], FontWeight.BOLD,FontPosture.ITALIC ,20));
			opts[i].setStyle("-fx-background-color: gray");
			flowPane.getChildren().add(opts[i]);
		}
		for (int i = 0; i < CMD.length; i++) {
			cmds[i] = new Button(CMD[i]);
			cmds[i].setFont(Font.font(CMD[i], FontWeight.BLACK, FontPosture.ITALIC, 20));
			flowPane.getChildren().add(cmds[i]);
		}
		
		borderPane.setCenter(tField);
		borderPane.setBottom(flowPane);
		
		
		//ע�ᴦ�����ֺ�С�����¼�
		keys[0].setOnAction(e -> handleNumber(KEY[0]));
		keys[1].setOnAction(e -> handleNumber(KEY[1]));
		keys[2].setOnAction(e -> handleNumber(KEY[2]));
		keys[3].setOnAction(e -> handleNumber(KEY[3]));
		keys[4].setOnAction(e -> handleNumber(KEY[4]));
		keys[5].setOnAction(e -> handleNumber(KEY[5]));
		keys[6].setOnAction(e -> handleNumber(KEY[6]));
		keys[7].setOnAction(e -> handleNumber(KEY[7]));
		keys[8].setOnAction(e -> handleNumber(KEY[8]));
		keys[9].setOnAction(e -> handleNumber(KEY[9]));
		keys[10].setOnAction(e -> handleNumber(KEY[10]));
		
		//ע��������¼�
		opts[0].setOnAction(e -> handleOperator(OPT[0]));
		opts[1].setOnAction(e -> handleOperator(OPT[1]));
		opts[2].setOnAction(e -> handleOperator(OPT[2]));
		opts[3].setOnAction(e -> handleOperator(OPT[3]));
		opts[4].setOnAction(e -> handleOperator(OPT[4]));
		opts[5].setOnAction(e -> handleEquals());
		
		//ע�ᴦ���˸��¼�
		cmds[1].setOnAction(e -> {
			handleBackSpace();
		});
		
		//ע�ᴦ������¼�
		cmds[0].setOnAction(e ->{
			handleC();
		});
		
		//��������̨
		Scene scene = new Scene(borderPane);
		primaryStage.setTitle("Calculater");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	//�������ֺ�С�����¼���
	private void handleNumber(String key) {
		if (firstDigit == true) {
			tField.setText(key);
		} else if(key.equals(".") && tField.getText().indexOf('.') < 0){
			tField.setText(tField.getText() + ".");
		} else if (!key.equals(".")) {
			tField.setText(tField.getText() + key);
		}
		firstDigit = false;
		calLinkedList.add(key);
	}
	
	//�����˸��¼���
	private void handleBackSpace() {
		String text = tField.getText();
		int i = text.length();
		if (i > 0) {
			text = text.substring(0, i - 1);
			tField.setText(text);
			calLinkedList.removeLast();
			if (text.length() == 0) {
				tField.setText("0");
				firstDigit = true;
			}
		}
	}
	
	//��������¼���
	private void handleC() {
		tField.setText("0");
		firstDigit = true;
		calLinkedList.clear();
	}
	
	//����������¼�
	private void handleOperator(String operator) {
		if (operator.equals("/")) {
			if (getNumberFromText() == 0.0) {
				tField.setText("��������Ϊ0");
			}else {
				tField.setText(tField.getText() + operator);
				calLinkedList.addLast(operator);
			}
		}
		if (operator.equals("1/x")) {
			if (getNumberFromText() == 0.0) {
				tField.setText("��û�е���");
			}else {
				tField.setText(tField.getText() + operator);
				calLinkedList.addLast(operator);
			}
		}
		if (operator.equals("+")) {
			calLinkedList.addLast(operator);
			tField.setText(tField.getText() + operator);
		}
		if (operator.equals("-")) {
			calLinkedList.addLast(operator);
			tField.setText(tField.getText() + operator);
		}
		if (operator.equals("*")) {
			calLinkedList.addLast(operator);
			tField.setText(tField.getText() + operator);
		}
	}
	
	private void handleEquals() {
		int index = 0;
		String e = "";//��������Ԫ��
		double n1 = 0;//�洢��һ����ֵ
		double n2 = 0;//�洢�ڶ�����ֵ
		double result = 0;//�洢�����
		if (calLinkedList.contains("+")) {
			index = calLinkedList.indexOf("+");
			for (int i = 0; i < index; i++) {
				e += calLinkedList.get(i);
			}
			n1 = Double.valueOf(e);
			e = "";
			for (int i = index + 1; i < calLinkedList.size(); i++) {
				e += calLinkedList.get(i);
			}
			n2 = Double.valueOf(e);
			e = "";
			result = n1 + n2;
		}
		
		if (calLinkedList.contains("-")) {
			index = calLinkedList.indexOf("-");
			for (int i = 0; i < index; i++) {
				e += calLinkedList.get(i);
			}
			n1 = Double.valueOf(e);
			e = "";
			for (int i = index + 1; i < calLinkedList.size(); i++) {
				e += calLinkedList.get(i);
			}
			n2 = Double.valueOf(e);
			e = "";
			result = n1 - n2;
		}
		
		if (calLinkedList.contains("*")) {
			index = calLinkedList.indexOf("*");
			for (int i = 0; i < index; i++) {
				e += calLinkedList.get(i);
			}
			n1 = Double.valueOf(e);
			e = "";
			for (int i = index + 1; i < calLinkedList.size(); i++) {
				e += calLinkedList.get(i);
			}
			n2 = Double.valueOf(e);
			e = "";
			result = n1 * n2;
		}
		
		if (calLinkedList.contains("/")) {
			index = calLinkedList.indexOf("/");
			for (int i = 0; i < index; i++) {
				e += calLinkedList.get(i);
			}
			n1 = Double.valueOf(e);
			e = "";
			for (int i = index + 1; i < calLinkedList.size(); i++) {
				e += calLinkedList.get(i);
			}
			n2 = Double.valueOf(e);
			e = "";
			result = n1 / n2;
		}
		
		if (calLinkedList.contains("1/x")) {
			index = calLinkedList.indexOf("1/x");
			for (int i = 0; i < index; i++) {
				e += calLinkedList.get(i);
			}
			n1 = Double.valueOf(e);
			result = 1 / n1;
		}
		
		tField.setText(String.valueOf(result));
		firstDigit = true;
		calLinkedList.clear();
	}
	
	//���ı����ȡ����
	private double getNumberFromText() {
		double result = 0;
		result = Double.valueOf(tField.getText()).doubleValue();
		return result;
	}
	
}
