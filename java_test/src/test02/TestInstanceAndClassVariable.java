package test02;

public class TestInstanceAndClassVariable {
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(5);
		printCircle(c1);
		printCircle(c2);
		System.out.println("创建圆对象的个数为："+Circle.numOfObjects);
	}

	public static void printCircle(Circle circle) {
		System.out.println("圆"+circle.toString()+"的半径为："+circle.getRadius()+"面积为："+circle.areaOfCircle());
	}
}
