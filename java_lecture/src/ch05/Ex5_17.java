package ch05;

import java.util.Scanner;

public class Ex5_17 {

	public static void main(String[] args) {
		System.out.println("Enter a number (1 to 15): ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for (int i = 1; i <= number; i++) {
			//��ӡǰ�벿�ֵĿո�
			for(int j =1; i+j<=number;j++){
				System.out.print("  ");
			}
			//��ӡ����
			for (int k = i,num =1; num<=2*i-1 ; num++) {
				System.out.print(k+" ");
				if (num<i) {
					k--;
				}
				else if (num>=i) {
					k++;
				}
			}
			//��ӡ��벿�ֵĿո�
			for(int j=number+i; j<=2*number-1;j++){
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}
