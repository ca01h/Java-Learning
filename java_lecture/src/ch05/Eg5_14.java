package ch05;

import java.util.Scanner;

public class Eg5_14 {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		int low=0;
		int high = input.length()-1;
		boolean isPalindrome = true;
		while (low <high) {
			if (input.charAt(low)!=input.charAt(high)) {
				isPalindrome = false;
				break;
			}
			low++;high--;
		}
		if (isPalindrome) {
			System.out.println(input+" is a palindrome");
		}
		else {
			System.out.println(input+" is not a palindrome");
		}
	}

}
