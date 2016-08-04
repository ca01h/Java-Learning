package ch07;

import java.util.Scanner;

public class Ex3_31 {

	public static void main(String[] args) {
		// Initialise the list
		System.out.println("Enter list1 (the first number is the quantity of list): ");
		Scanner scanner = new Scanner(System.in);
		int numberOfList1 = scanner.nextInt();
		int[] list1 = new int[numberOfList1];
		creatList(list1);
		System.out.println("Enter list2 (the first number is the quantity of list): ");
		int numberOfList2 = scanner.nextInt();
		int[] list2 = new int[numberOfList2];
		creatList(list2);

		// merge the two list
		int[] list = new int[numberOfList1 + numberOfList2];
		if (list1.length > list2.length) {
			merge(list1, list2, list);
		} else {
			merge(list2, list1, list);
		}

		// Display the List after merging
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

	public static int[] creatList(int[] list) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < list.length; i++) {
			list[i] = scanner.nextInt();
		}
		return list;
	}

	public static int[] merge(int[] list1, int[] list2, int[] list) {
		int indexOfList1 = 0;
		int indexOfList2 = 0;
		int indexOfList = 0;
		for (; indexOfList2 < list2.length;) {
			if (list1[indexOfList1] < list2[indexOfList2]) {
				list[indexOfList] = list1[indexOfList1];
				indexOfList++;
				indexOfList1++;
			} else {
				list[indexOfList] = list2[indexOfList2];
				indexOfList++;
				indexOfList2++;
			}
		}
		if (list1.length != list2.length) {
			for (int i = indexOfList1; i < list1.length; i++) {
				list[indexOfList] = list1[i];
				indexOfList++;
			}
		}
		return list;
	}

}
