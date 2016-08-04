package ch03;

import java.util.Scanner;

public class Ex3_15 {

	public static void main(String[] args) {
		int lottery = (int)(Math.random()*1000);
		Scanner scanner = new Scanner(System .in );
		System.out.println("Enter your lottery pick (three digits):");
		int guess = scanner.nextInt();
		System.out.println("The lottery number is "+lottery);
		
		int lotterydigit3 = lottery%100;
		lottery/=100;
		int lotterydigit2 = lottery%10;
		int lotterydigit1 = lottery/10;
		
		int guessdigit3 = guess%10;
		guess/=10;
		int guessdigit2 = guess%10;
		int guessdigit1 = guess/10;
		
		
		//check the guess
		if (guess==lottery) {
			System.out.println("Exact match: you win $ 10,000!");
		}
		else if ((guessdigit1==lotterydigit2 && guessdigit2 == lotterydigit3 && guessdigit3 == lotterydigit1)||(guessdigit1 == lotterydigit3 &&
				guessdigit2 == lotterydigit2 && guessdigit3 == lotterydigit1)||(guessdigit1 == lotterydigit3 &&guessdigit2 == lotterydigit1 && 
				guessdigit3 == lotterydigit2)) {
			System.out.println("Match all digits: you win $5,000");
		}
		else if (guessdigit1==lotterydigit1||guessdigit1==lotterydigit2||guessdigit1==lotterydigit3||guessdigit2==lotterydigit1||guessdigit2==
					lotterydigit2||guessdigit2==lotterydigit3||guessdigit3==lotterydigit1||guessdigit3==lotterydigit2||guessdigit3==lotterydigit3) {
				System.out.println("Match one digit: you win $1,000");
			}
		else {
			System.out.println("Sorry , no match");
		}
	}

}
