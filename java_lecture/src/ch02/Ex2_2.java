package ch02;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		final double P=3.1415926;
		System.out.println("Enter the radius and length of a cylinder:");
		double area,volume;
		float raduis,cylinder;
		Scanner scanner=new Scanner(System.in);
		raduis=scanner.nextFloat();
		cylinder=scanner.nextFloat();
		area=raduis*raduis*P;
		volume=area*cylinder;
		BigDecimal decimal=new BigDecimal(area);
		BigDecimal decimal2=new BigDecimal(volume);
		System.out.println("The area is "+decimal.setScale(4, BigDecimal.ROUND_HALF_UP));
		System.out.println("The volume is "+decimal2.setScale(1, BigDecimal.ROUND_HALF_UP));
	}

}
