package test03;

public class ComparableCylinder extends Cylinde implements Comparable<ComparableCylinder>{
	public ComparableCylinder(double height, double radius) {
		// TODO Auto-generated constructor stub
		super(height, radius);
	}
	public int compareTo(ComparableCylinder o) {
		// TODO Auto-generated method stub
		if (getArea() > o.getArea()) {
			return 1;
		}
		else if (getArea() > o.getArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
