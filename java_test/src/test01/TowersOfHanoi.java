package test01;

import java.util.Scanner;

public class TowersOfHanoi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������ӵĸ�����");
		int numberOfDisks = scanner.nextInt();
		System.out.println("�����ƶ��Ĺ������£�");
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
