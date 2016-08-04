package ch08;

import java.util.Scanner;

public class Ex8_6 {

	public static void main(String[] args) {
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		double[][] matrix3 = new double[3][3];
		System.out.println("Enter matrix1: ");
		initializeTheMatrix(matrix1);
		System.out.println("Enter matrix2: ");
		initializeTheMatrix(matrix2);
		matrix3 = multiplyMartix(matrix1, matrix2); 
		System.out.println("The multiplication of matrices is ");
		displayResult(matrix3);
	}
	
	public static void initializeTheMatrix(double[][] matrix) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = scanner.nextDouble();
			}
		}
	}
	
	public static double[][] multiplyMartix(double[][] a,double[][] b) {
		double[][] c = new double[3][3];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = doMuliplyMartix(i, j, a, b);
			}
		}
		return c;
	}
	
	public static double doMuliplyMartix(int i,int j,double[][] a,double[][] b) {
		double total = 0;
		total = a[i][0]*b[0][j]+a[i][1]*b[1][j]+a[i][2]*b[2][j];
		return total;
	}
	
	public static void displayResult(double[][] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
