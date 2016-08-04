package test02;

public class TestInstanceAndClassVariable {
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(5);
		printCircle(c1);
		printCircle(c2);
		System.out.println("����Բ����ĸ���Ϊ��"+Circle.numOfObjects);
	}

	public static void printCircle(Circle circle) {
		System.out.println("Բ"+circle.toString()+"�İ뾶Ϊ��"+circle.getRadius()+"���Ϊ��"+circle.areaOfCircle());
	}
}
