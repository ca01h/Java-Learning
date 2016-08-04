package ch07;

import java.util.Scanner;

public class Ex_7_18 {

	public static void main(String[] args) {
		System.out.println("Enter 10 numbers :");
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = scanner.nextInt();
		}
		bubbleSort(array);
		System.out.println("After the sorting: ");
		dispalyArray(array);
	}
	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	public static void dispalyArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
