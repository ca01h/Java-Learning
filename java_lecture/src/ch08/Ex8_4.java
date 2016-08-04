package ch08;

import java.util.Scanner;

public class Ex8_4 {

	public static void main(String[] args) {
		//Read the working Hour
		Scanner scanner = new Scanner(System.in);
		int[][] workingHour = new int[8][7];
		System.out.println("Enter the working hours:");
		for (int i = 0; i < workingHour.length; i++) {
			for (int j = 0; j < workingHour[i].length; j++) {
				workingHour[i][j] = scanner.nextInt();
			}
		}
		
		//add everyday's working hour of each employee
		int[] workingHoursOfeachEmployee = new int[8];
		for (int i = 0; i < workingHour.length; i++) {
			workingHoursOfeachEmployee[i] = addHoursOfEachEmployee(workingHour[i]);
		}
		
		//sort the array and record the number
		int[] number = new int[8];
		int[] Sort = new int[8];
		Sort = workingHoursOfeachEmployee;
		selectionSort(Sort, number);
		
		//display the result
		System.out.print("Employee"+"\t");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]+"    ");
		}
		System.out.println();
		System.out.print("Hours"+"\t");
		for (int i = 0; i < number.length; i++) {
			System.out.print(workingHoursOfeachEmployee[i]+"  ");
		}
	}
	
	public static int addHoursOfEachEmployee(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static void selectionSort(int[] workingHoursOfeachEmployee,int[] number) {
		for (int i = 0; i < workingHoursOfeachEmployee.length - 1; i++) {
			int currentMin = workingHoursOfeachEmployee[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < number.length; j++) {
				if (currentMin > workingHoursOfeachEmployee[j]) {
					currentMin = workingHoursOfeachEmployee[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				workingHoursOfeachEmployee[currentMinIndex] = workingHoursOfeachEmployee[i];
				workingHoursOfeachEmployee[i] = currentMin;
			}
		}
	}

}
