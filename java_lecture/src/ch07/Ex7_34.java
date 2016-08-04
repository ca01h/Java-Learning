package ch07;

import java.util.Scanner;

public class Ex7_34 {

	public static void main(String[] args) {
		System.out.println("Enter a String to sort: ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String str = sort(string);
		System.out.println(str);
	}
	
	public static String sort(String string) {
		char[] charArray = string.toCharArray();
		for (int i = 0; i < charArray.length-1; i++) {
			char currentMin = charArray[i];
			int currentMinIndex = i;
			for (int j = i+1; j < charArray.length; j++) {
				if (charArray[j] < currentMin) {
					currentMin = charArray[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				charArray[currentMinIndex] = charArray[i];
				charArray[i] = currentMin;
			}
		}
		String str = String.valueOf(charArray);
		return str;
	}

}
