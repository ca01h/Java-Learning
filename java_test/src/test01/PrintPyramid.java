package test01;

import java.util.Scanner;


public class PrintPyramid {

	public static void main(String[] args) {
		System.out.println("请输入行数：");
		Scanner scanner = new Scanner(System.in);
		int countOfRows = scanner.nextInt();
		if (countOfRows < 0 || countOfRows > 10) {
			System.out.println("请输入1到9之间的数！");
			System.exit(0);
		}
		for (int row = 1; row <= countOfRows; row++) {
			for (int space = 1; space <= countOfRows -row; space++) {
				System.out.print(" ");
			}
			for (int num = row; num >= 1; num--) {
				System.out.print(num);
			}
			for (int num = 2; num <= row; num++) {
				System.out.print(num);
			}
			System.out.println();
		}
	}

}
