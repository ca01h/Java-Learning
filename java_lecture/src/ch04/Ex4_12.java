package ch04;

import java.util.Scanner;

public class Ex4_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");
		String hexString = scanner.nextLine();
		
		if (hexString.length()!=1) {
			System.out.println("You must enter exactly one character");
			System.exit(1);
		}
		
		char ch = Character.toUpperCase(hexString.charAt(0));
		if (ch <= 'F'&&ch >= 'A') {
			int value = ch -'A' + 10;
			String str = "";
			System.out.println("The binary value is: ");
			while (value!=0) {
				str+=""+(value%2);
				value/=2;
			}
			for (int i = str.length()-1; i >=0 ; i--) {
				System.out.print(str.charAt(i));
			}
		}
		else if (Character.isDigit(ch)) {
			System.out.println("The binary value is: ");
			int value1 = Integer.parseInt(hexString);
			String str1 = "";
			while (value1!=0) {
				str1+= ""+(value1%2);
				value1/=2;
			}
			for (int i = str1.length()-1; i >=0 ; i--) {
				System.out.print(str1.charAt(i));
			}
		}
		else {
			System.out.println(ch+" is not an invaild input");
		}
	}

}
