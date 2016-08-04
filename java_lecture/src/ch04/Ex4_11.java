package ch04;

import java.util.Scanner;

public class Ex4_11 {

	public static void main(String[] args) {
		System.out.print("Enter a decimal value (0 to 15):" );
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		
		if (value>15 || value<0) {
			System.out.println(value+" is an invalid input");
		}
		else if (value<10&&value>0) {
			System.out.println("The hex value is "+value);
		}
		else if (value>=10&&value<=15) {
			System.out.println("The hex value is "+(char)(value-10+65));
		}
	}

}
