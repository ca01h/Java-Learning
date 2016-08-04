package ch02;

import java.util.Scanner;

public class Ex2_6 {

	public static void main(String[] args) {
		System.out.println("Enter a number between 0 and 1000:");
		Scanner scanner=new Scanner(System.in);
		int digits=scanner.nextInt();
		int total=0;
		int temp;
		while (digits!=0) {
			temp=(digits%10);
			digits/=10;
			total+=temp;
		}
		System.out.println("The sum of the digits is "+total);
	}
}
