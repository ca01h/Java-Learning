package test04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SearchKey {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入10个整数: ");
		int[] listOfInt = new int[10];
		for (int i = 0; i < 9; i++) {
			listOfInt[i] = scanner.nextInt();
		}
		scanner.nextLine();
		
		System.out.println("请输入要查找的key: ");
		int key = scanner.nextInt();
		
		Arrays.sort(listOfInt);
		BinarySearch.binarySearch(key, listOfInt);
	}

}
