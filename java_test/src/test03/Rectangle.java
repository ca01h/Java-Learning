package test03;

public class Rectangle extends GeometricObject{
	private double width;
	private double length;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public  Rectangle(double width, double length) {
		this.length = length;
		this.width = width;
	}
	public Rectangle(double width, double length, String color) {
		this.length = length;
		this.width = width;
		setColor(color);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		// TODO Auto-generated method stub
		return width * length;
	}
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+length);
	}
}
