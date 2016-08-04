package test03;

public class Max {
	public static <T extends Comparable<T>> void max(T o1, T o2) {
		//(o1.compareTo(o2) == 1)? (System.out.println(o1.toString())) : (System.out.println(o2.toString()));
		if (o1.compareTo(o2) == 1) {
			TestGeometricObject.displayGeometricObject((GeometricObject) o1);
		} else {
			TestGeometricObject.displayGeometricObject((GeometricObject) o2);
		}
	}
}
