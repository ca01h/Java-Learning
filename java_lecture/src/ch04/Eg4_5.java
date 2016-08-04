package ch04;

import java.util.Scanner;

public class Eg4_5 {

	public static void main(String[] args) {
		String lottery = ""+(int)(Math.random()*10)+(int)(Math.random()*10);
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter your lottery pick (two digits): ");
		String guess = scanner.nextLine();
		
		char lotterydigit1=lottery.charAt(0);
		char lotterydigit2=lottery.charAt(1);
		char guessdigit1=guess.charAt(0);
		char guessdigit2=guess.charAt(1);
		
		System.out.println("The lottery number is "+ lottery);
		if (guess.equals(guess)) {
			System.out.println("Exact match: you win $30,000");
		}
		else if (guessdigit1==lotterydigit2&&guessdigit2==lotterydigit1) {
			System.out.println("Match all digits: you win $10,000");
		}
		else if (guessdigit1==lotterydigit1||
				guessdigit1==lotterydigit2||
				guessdigit2==lotterydigit2||
				guessdigit2==lotterydigit1) {
			System.out.println("Match one digit : you win 1,000");
		}
		else {
			System.out.println("Sorry, no match");
		}
	}

}
