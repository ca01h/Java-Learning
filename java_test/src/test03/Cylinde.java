package test03;

public class Cylinde extends Circle{
	private double height;
	
	public Cylinde() {
		// TODO Auto-generated constructor stub
	}
	public Cylinde(double height, double radius){
		this.height = height;
		setRadius(radius);
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		// TODO Auto-generated method stub
		return super.getArea()*height;
	}
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (super.getPerimeter()+height)*2;
	}
}
