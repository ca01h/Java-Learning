package ch05;

import java.util.Scanner;

public class Ex5_28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter full year (e.g. 2012):");
		int year = scanner.nextInt();
		System.out.println("Enter the week of "+year+" (1 to 7):");
		int week = scanner.nextInt();
		printTheFirstDayWeek(year, week);
		
	}
	public static void printTheFirstDayWeek(int year, int week) {
		final int MONTHS = 12;
		int totalNumberOfDays = 0;
		for (int i = 1; i <= MONTHS; i++) {
			printTitle(year,i);
			int numberOfDaysInMonth = getNumberOfDaysInMonth(year, i);
			printBody(totalNumberOfDays,week);
			totalNumberOfDays+=numberOfDaysInMonth;
		}
	}
	
	public static void printTitle(int year, int i) {
		System.out.print(i+" 1, "+year+" is ");
	}
	
	public static void printBody(int totalNumberOfDays,int week) {
		int wk = (totalNumberOfDays+week)%7;
		switch (wk) {
		case 1: System.out.println("Monday");break;
		case 2: System.out.println("Tuesday");break;
		case 3: System.out.println("Wednesday");break;
		case 4: System.out.println("Thursday");break;
		case 5: System.out.println("Friday");break;
		case 6: System.out.println("Saturday");break;
		case 0: System.out.println("Sunday");
		}
	}
	
	public static int  getNumberOfDaysInMonth(int year, int month) {
		if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			return 31;
		}
		if (month==4||month==6||month==9||month==11) {
			return 30;
		}
		if (month==2) {
			return isLeapYear(year)?29:28;
		}
		return 0;
	}
	
	public static boolean isLeapYear(int year) {
		return year%400 == 0||(year%4 == 0&&year%100 !=0);
	}

}
