package ch07;

import java.util.Scanner;

public class Ex7_5 {

	public static void main(String[] args) {
		System.out.println("Enter the integers between 1 to 100: ");
		Scanner scanner = new Scanner(System.in);
		int number;
		int[] times = new int[100];
		while ((number=scanner.nextInt())!=0) {
			times[number]++;
		}
		for (int i = 0; i < times.length; i++) {
			if (times[i]!=0) {
				System.out.println(i+" occurs "+times[i]+" times");
			}
		}
	}

}
