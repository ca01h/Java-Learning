package ch05;

import java.util.Scanner;

public class Ex5_29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a full year (e.g. 2012):");
		int year = scanner.nextInt();
		System.out.println("Enter the start day of "+year+" : ");
		int startDay = scanner.nextInt();
		printMonth(year, startDay);
		System.out.println();
	}
	
	public static void printMonth(int year, int startDay) {
		int totalNumberOfDays = 0;
		for(int i=1;i<=12;i++){
		printMonthTitle(year,i);
		int numberOfDaysInMonth = getnumberOfDaysInMonth(year,i);
		printMonthBody(year, startDay,i,totalNumberOfDays);
		totalNumberOfDays+=numberOfDaysInMonth;
		}
	}
	
	public static void printMonthTitle(int year,int month) {
		System.out.println("\t\t"+getMonthName(month)+"  "+year);
		System.out.println("-----------------------------------------------");
		System.out.println("Sun	Mon	Tue	Wed	Thu	Fri	Sat");
	}
	public static void printMonthBody(int year, int startDay,int month,int totalNumberOfDays) {
		int week = (startDay+totalNumberOfDays)%7;
		for (int i = 0; i < week ;i++){
			System.out.print("\t");
		}
		int numberOfDaysInMonth = getnumberOfDaysInMonth(year,month);
		for (int i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%6d",i);
			if ((i+week)%7==0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1: monthName="January";break;
		case 2: monthName="February";break;
		case 3: monthName="March";break;
		case 4: monthName="April";break;
		case 5: monthName="May";break;
		case 6: monthName="June";break;
		case 7: monthName="July";break;
		case 8: monthName = "August";break;
		case 9: monthName = "September";break;
		case 10: monthName = "October";break;
		case 11: monthName = "November";break;
		case 12: monthName = "December";
		}
		return monthName;
	}
	
	public static int  getnumberOfDaysInMonth(int year, int month) {
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
		return year%400 == 0||(year%4==0&&year%100!=0);
	}

}
