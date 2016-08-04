package test03;

public class Circle extends GeometricObject{
	private double radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public  Circle(double radius) {
		this.radius = radius;
	}
	public  Circle(double radius, String color) {
		this.radius = radius;
		setColor(color);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*radius*Math.PI;
	}
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return radius*2*Math.PI;
	}
	
}
