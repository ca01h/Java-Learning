package ch04;

import java.util.Scanner;

public class Eg4_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a hex digit: ");
		String hexString = scanner.nextLine();
		
		if (hexString.length()!=1) {
			System.out.println("You must enter exactly one character ");
			System.exit(1);
		}
		
		char ch =Character.toUpperCase(hexString.charAt(0));
		if (ch<= 'F'&&ch>'A') {
			int value = ch-'A'+10;
			System.out.println("The decimal value for hex digit "+ch+" is "+ch);
		}
		else if (Character.isDigit(ch)) {
			System.out.println("The dicimal value for hex digit "+ ch +" is "+ch);
		}
		else {
			System.out.println(ch+" is an invaild input ");
		}
	}

}
