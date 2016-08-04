package ch15;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BallPane extends Pane{
	public final double raduis = 20;
	private double x = raduis, y =raduis;
	private double dx = 1, dy = 1;
	private Circle circle = new Circle(x, y, raduis);
	private Timeline animation;
	
	public BallPane() {
		circle.setFill(Color.GREEN);
		getChildren().add(circle);
		//Create an animation for moving ball
		animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveBall()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
	}
	
	public void play() {
		animation.play();
	}
	
	public void pause() {
		animation.pause();
	}
	
	public void increaseSpeed() {
		animation.setRate(animation.getRate() + 0.1);
	}
	
	public void decreaseSpeed() {
		animation.setRate(animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
	}
	
	public DoubleProperty rateProperty() {
		return animation.rateProperty();
	}
	
	protected void moveBall() {
		//Check boundaries
		if (x < raduis || x > getWidth() - raduis) {
			dx *= -1;
		}
		if (y < raduis || y > getHeight() - raduis) {
			dy *= -1;
		}
		
		x += dx;
		y += dy;
		circle.setCenterX(x);
		circle.setCenterY(y);
	}
}
