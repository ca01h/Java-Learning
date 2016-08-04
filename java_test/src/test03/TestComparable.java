package test03;

public class TestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparableCircle geoCircle1 = new ComparableCircle(5);
		ComparableCircle geoCircle2 = new ComparableCircle(10);
		ComparableCylinder geoCylinder1 = new ComparableCylinder(5, 5);
		ComparableCylinder geoCylinder2 = new ComparableCylinder(10, 10);
		
		Max.max(geoCircle1, geoCircle2);
		System.out.println();
		Max.max(geoCylinder1, geoCylinder2);
	}
	

}
