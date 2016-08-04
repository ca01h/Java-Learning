package test02;

public class Circle {
	private int radius;
	static int numOfObjects;
	Circle(){
		radius = 1;
		numOfObjects++;
	}
	Circle(int radius) {
		this.radius = radius;
		numOfObjects++;
	}
	double areaOfCircle(){
		return radius*radius*Math.PI;
	}
	public int getRadius() {
		return radius;
	}
}


