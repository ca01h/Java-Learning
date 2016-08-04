package ch06;

import java.util.Scanner;

public class Ex6_31 {

	public static void main(String[] args) {
		System.out.println("Enter a credit card number as a long integer: ");
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong();
		if (isValid(number)) {
			System.out.println(number+" is valid");
		} else {
			System.out.println(number+" is invalid");
		}
	}
	
	public static boolean isValid(long number) {
		int sumOfEven = sumOfDoubleEvenPlace(number);
		int sumOfOdd = sumOfOddPlace(number);
		int sum = sumOfEven+sumOfOdd;
		if (sum%10 ==0) {
			return true;
		} else {
			return false;
		}
	}
	/*
	 * Get result from step1 and step2
	 */
	public static int sumOfDoubleEvenPlace(long number) {
		String cardNumber = ""+number;
		int sumOfEven = 0;
		for (int i = 0; i <= cardNumber.length()-1;) {
			sumOfEven+=getDigit(2*(cardNumber.charAt(i)-48));
			i=i+2;
		}
		return sumOfEven;
	}
	public static int  getDigit(int number) {
		int totalOfDigit;
		if (number/10!=0) {
			totalOfDigit = sumOfEachDigits(number);
		} else {
			totalOfDigit = number;
		}
		return totalOfDigit;
	}
	public static int sumOfEachDigits(int number) {
		int sum = 0;
		while (number!=0) {
			sum += number%10;
			number/=10;
		}
		return sum;
	}
	/*
	 * Get result of step3
	 */
	public static int sumOfOddPlace(long number) {
		int sumOfOdd = 0;
		String cardNumber = ""+number;
		for (int i = 1; i <= cardNumber.length()-1;) {
			sumOfOdd +=cardNumber.charAt(i)-48; 
			i+=2;
		}
		return sumOfOdd;
	}

}
