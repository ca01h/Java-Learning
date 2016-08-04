package test01;

public class TestMethodOverloading {

	public static void main(String[] args) {
		 System.out.println("The maximum between 3 and 4 is "+ max(3, 4));
		 System.out.println("The maximum between 3.0 and 5.4 is "+ max(3.0, 5.4));
		 System.out.println("The maximum between 3.0, 5.4, and 10.14 is "+ max(3.0, 5.4, 10.14));

	}
	
	static int max(int num1, int num2){
		return (num1>num2)? num1 : num2;
	}
	
	static double max(double num1, double num2){
		return (num1>num2)? num1 : num2;
	}

	static double max(double num1, double num2, double num3){
		return (((num1>num2)? num1 : num2)>num3)? ((num1>num2)? num1 : num2) : num3;
	}
}
