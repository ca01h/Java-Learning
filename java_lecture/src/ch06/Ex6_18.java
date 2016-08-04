package ch06;

import java.util.Scanner;

public class Ex6_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = scanner.nextLine();
		if (isEightChars(password)&&isIncludeCharsAndDigits(password)&&isIncludeTwoDigitsOrMore(password)) {
			System.out.println("Valid password");
		}
		else {
			System.out.println("Invalid password");
		}
	}
	public static boolean isEightChars(String password) {
		if (password.length()>=8) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isIncludeCharsAndDigits(String password) {
		for (int i = 0; i < password.length(); i++) {
			if ((password.charAt(i)>=48&&password.charAt(i)<=57)||(password.charAt(i)>=65&&password.charAt(i)<=90)||
					(password.charAt(i)>=97&&password.charAt(i)<=122)) {
				return true;
			}
		}
		return false;
		
	}
	
	public static boolean isIncludeTwoDigitsOrMore(String password) {
		int count = 0;
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i)>=48&&password.charAt(i)<=57) {
				count++;
			}
		}
		if (count>=2) {
			return true;
		}
		else {
			return false;
		}
	}
}
