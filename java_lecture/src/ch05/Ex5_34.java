package ch05;

import java.util.Random;
import java.util.Scanner;

public class Ex5_34 {

	public static void main(String[] args) {
		int computer;
		int countOfWin = 0;
		
		while (countOfWin <= 2) {
			System.out.println("scissor (0), rock (1), paper (2): ");
			Scanner scanner = new Scanner(System.in);
			int human = scanner.nextInt();
			Random random = new Random();
			computer = random.nextInt(3);
			if (computer == human) {
				System.out.println("The computer is "+computer+" . You are "+human+". It is a draw");
			}
			else if ((human == 0&&computer ==2)||(human == 1&&computer == 0)||(human ==2&&computer == 1)) {
				System.out.println("The computer is "+computer+". You are "+human+". You lose");
				countOfWin++;
			}
			else if((computer == 0&&human ==2)||(computer == 1&&human == 0)||(computer ==2&&human == 1)){
				System.out.println("The computer is "+computer+". You are "+human+". You win");
				countOfWin++;
			}
		}
	}

}
