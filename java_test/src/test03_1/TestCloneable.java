package test03_1;

public class TestCloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Circle c1=new Circle(new Point(50,50),10.0);
		Circle c2=(Circle)c1.clone();
		System.out.println("c1��Բ��������("+c1.getCenter().getX()+","
+c1.getCenter().getY()+"),�뾶Ϊ"+c1.getRadius());
		System.out.println("c2��Բ��������("+c2.getCenter().getX()+","
+c2.getCenter().getY()+"),�뾶Ϊ"+c2.getRadius());
		c1.getCenter().setX(100);
		c1.getCenter().setY(100);
		c1.setRadius(20.0);
		System.out.println("c1��Բ��������("+c1.getCenter().getX()+","+
c1.getCenter().getY()+"),�뾶Ϊ"+c1.getRadius());
		System.out.println("c2��Բ��������("+c2.getCenter().getX()+","
+c2.getCenter().getY()+"),�뾶Ϊ"+c2.getRadius());
	}


}
