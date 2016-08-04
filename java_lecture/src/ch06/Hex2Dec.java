package ch06;

import java.util.Scanner;

public class Hex2Dec {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a hex number: ");
		String hex = scanner.nextLine();
		
		System.out.println("The decimal value for hex number "+hex+" is "+hexToDecimal(hex.toUpperCase()));
	}
	public static int hexToDecimal(String hex) {
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue*16+hexToDecimal(hexChar);
		}
		return decimalValue;
	}
	public static int  hexToDecimal(char ch) {
		if (ch >='A'&&ch<='F') {
			return 10+ch-'A';
		} else {
			return ch - '0';
		}
	}

}
