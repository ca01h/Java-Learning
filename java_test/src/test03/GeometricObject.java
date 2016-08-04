package test03;


public abstract class GeometricObject {
	private String color = "White";
	
	protected GeometricObject() {
	}
	
	protected  GeometricObject(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "The color is "+color;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}
