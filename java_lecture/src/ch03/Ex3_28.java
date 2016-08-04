package ch03;

import java.util.Scanner;

public class Ex3_28 {
	public static void main(String[] args) {
		System.out.print("Enter r1's center x- ,y-coordinates, width, and heigth: ");
		Scanner scanner =new Scanner(System.in);
		float x1=scanner.nextFloat();
		float y1=scanner.nextFloat();
		float width1 =scanner.nextFloat();
		float heigth1 =scanner.nextFloat();
		System.out.print("Enter r1's center x- ,y-coordinates, width, and heigth: ");
		float x2=scanner.nextFloat();
		float y2=scanner.nextFloat();
		float width2 =scanner.nextFloat();
		float heigth2 =scanner.nextFloat();
		
		if ((x1==x2)||(y1==y2)) {
			if ((width1==width2)||(heigth1==heigth2)) 
				System.out.println("r2 is equal to r1");
			else
				System.out.println("r2 is inside r1");
		}
		else {
			if (Math.abs(x2-x1)<(width1/2+width2/2)){
				if (Math.abs(x2-x1)<=(width1/2-width2/2))
					System.out.println("r2 is inside r1");
				else 
					System.out.println("r2 is overlaps r1");
			}
			else 
				System.out.println("r2 is not overlaps r1");
		}
	}
}
