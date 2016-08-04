package ch03;

import java.util.Scanner;

public class Ex3_22 {

	public static void main(String[] args) {
		System.out.println("Enter a point with two coordinates :");
		Scanner scanner = new Scanner(System.in);
		int coor1 = scanner.nextInt();
		int coor2 =scanner.nextInt();
		
		double distant= Math.sqrt((Math.pow(2, coor1))+Math.pow(2, coor2));
		if (distant<10) {
			System.out.println("Point ("+coor1+","+coor2+") is in the circle.");
		}
		else {
			System.out.println("Point ("+coor1+","+coor2+") is not in the circle.");
		}
	}

}
