package ch05;

import java.util.Scanner;

public class Ex5_25 {

	public static void main(String[] args) {
		System.out.println("Enter the value of i: ");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		
		int  flag = 1;
		double temp;
		double total = 0;
		for (int j = 1; j <=i; j++) {
			temp = 1.0/(2*j-1);
			total += flag*temp;
			flag*=-1;
		}
		System.out.println("¦Ð="+4*total);
	}

}
