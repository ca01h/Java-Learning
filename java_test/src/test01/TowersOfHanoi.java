package test01;

import java.util.Scanner;

public class TowersOfHanoi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入盘子的个数：");
		int numberOfDisks = scanner.nextInt();
		System.out.println("盘子移动的过程如下：");
		moveDisks(numberOfDisks, 'A','B','C');
		
	}
	
	public static void moveDisks(int n, char start, char temp, char end) {
		if (n == 1) {
			System.out.println("Move disk "+n+" from "+start+" to "+end);
		} else {
			moveDisks(n-1, start, temp, end);
			System.out.println("Move disk "+n+" from "+start+" to "+end);
			moveDisks(n-1, temp, end, start);

		}
	}

}
