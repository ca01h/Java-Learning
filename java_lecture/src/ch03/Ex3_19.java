package ch03;

import java.util.Scanner;

public class Ex3_19 {

	public static void main(String[] args) {
		System.out.println("Enter the length of the side of triangle: ");
		Scanner scanner = new Scanner(System.in);
		float side1 = scanner.nextFloat();
		float side2 = scanner.nextFloat();
		float side3 = scanner.nextFloat();
		
		if ((side1<(side2+side3))||(side2<(side1+side3))||(side3<(side1+side2))) {
			float perimeter = side1+side2+side3;
			System.out.println("The perimeter of triangle is "+perimeter);
		} else {
			System.out.println("ERROR!");
		}
	}

}
