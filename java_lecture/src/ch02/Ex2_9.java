package ch02;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex2_9 {
	public static void main(String[] args) {
		System.out.println("Enter v0, v1, and t:");
		Scanner scanner=new Scanner(System.in);
		float v0=scanner.nextFloat();
		float v1=scanner.nextFloat();
		float t=scanner.nextFloat();
		float a=(v1-v0)/t;
		BigDecimal decimal=new BigDecimal(a);
		System.out.println("The average acceleration is "+decimal.setScale(4, decimal.ROUND_HALF_UP));
	}
}
