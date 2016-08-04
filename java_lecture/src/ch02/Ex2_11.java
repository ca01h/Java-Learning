package ch02;

import java.util.Scanner;

public class Ex2_11 {
	public static void main(String[] args) {
		final int YEAR=365;
		final int HOUR=24;
		final int MIN=60;
		final int SEC=60;
		
		System.out.println("Enter the number of year:");
		Scanner scanner=new Scanner(System.in);
		int year=scanner.nextInt();
		int population=312_032_486;
		int birth_oneyear=YEAR*HOUR*MIN*SEC/7;
		int death_oneyear=YEAR*HOUR*MIN*SEC/13;
		int insert_oneyear=YEAR*HOUR*MIN*SEC/45;
		int increase_oneyear=birth_oneyear-death_oneyear+insert_oneyear;
		
		System.out.println("The population in "+year+"is "+(population+increase_oneyear*year));
	}
}
