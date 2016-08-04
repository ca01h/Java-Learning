package test03_1;

public class Circle implements Cloneable {
	private Point center;
	private double radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
		this(new Point(10,10),10);
	}
	public Circle(Point centerPoint, double radius){
		this.center = centerPoint;
		this.radius = radius;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getAera() {
		return radius*radius*Math.PI;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Object o;
		o = super.clone();
		return null;
	}
}
