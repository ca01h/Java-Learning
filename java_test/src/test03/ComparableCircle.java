package test03;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

	public ComparableCircle(double radius) {
		// TODO Auto-generated constructor stub
		super(radius);
	}
	public int compareTo(ComparableCircle o) {
		// TODO Auto-generated method stub
		if (getArea() > o.getArea()){
			return 1;
		}
		else if(getArea() < o.getArea()){
			return -1;
		}else {
			return 0;
		}
	}
	
}
