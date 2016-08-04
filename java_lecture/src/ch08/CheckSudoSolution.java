package ch08;

import java.util.Scanner;

public class CheckSudoSolution {

	public static void main(String[] args) {
		int[][] grid = readSolution();
		System.out.println(isValid(grid)? "Valid solution" :"Invaild solution");
	}
	
	public static int[][] readSolution() {
		//Create a Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sudo puzzle solution: ");
		int[][] grid = new int[9][9];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = scanner.nextInt();
			}
		}
		return grid;
	}
	
	public static boolean isValid(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] < 1||grid[i][j] > 9||!isValid(i, j, grid)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isValid(int i, int j, int[][] grid) {
		for (int column = 0; column < grid.length; column++) {
			if ((column != i)&&(grid[i][j] == grid[i][column])) {
				return false;
			}
		}
		for (int row = 0; row < grid.length; row++) {
			if ((row != j)&&(grid[i][j] == grid[row][j])) {
				return false;
			}
		}
		for(int row = (i/3)*3; row < (i/3)*3+3; i++){
			for(int column = (j/3)*3; column < (j/3)*3+3;column++){
				if (row != i&&column != j&&grid[i][j] == grid[row][column]) {
					return false;
				}
			}
		}
		return true;
	}
}
