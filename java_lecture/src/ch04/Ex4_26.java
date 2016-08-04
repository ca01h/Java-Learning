package ch04;

import java.util.Scanner;

public class Ex4_26 {

	public static void main(String[] args) {
		System.out.println("Enter an amount , for exmaple, 11.56: ");
		Scanner scanner =new Scanner(System.in);
		String string = scanner.nextLine();
		
		int dex = string.indexOf('.');
		String dollars = string.substring(0, dex);
		String value2=string.substring(dex+1);
		int quarters = Integer.parseInt(value2)/25;
		int remianingAmount = Integer.parseInt(value2)%25;
		int dimes = remianingAmount/10;
		remianingAmount%=10;
		int nickels = remianingAmount/5;
		remianingAmount%=5;
		int pennys = remianingAmount;
		
		System.out.println("Your amount "+string+" consists of");
		System.out.println("\t"+dollars+" dollars ");
		System.out.println("\t"+quarters+" quarters ");
		System.out.println("\t"+dimes+" dimes ");
		System.out.println("\t"+nickels+" nickels");
		System.out.println("\t"+pennys+" pennys");
	}

}
