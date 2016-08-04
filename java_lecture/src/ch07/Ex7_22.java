package ch07;

public class Ex7_22 {

	public static void main(String[] args) {
		//initialize the eightQueen
		int row = (int) (Math.random()*8);
		int col = (int) (Math.random()*8);
		int count = 1;
		char[][] eightQueens = new char[8][8];
		eightQueens[row][col] = 'Q';
		
		row = (int) (Math.random()*8);
		col = (int) (Math.random()*8);
		//Creat a point randomly
		while (count != 8) {
			if (isValid(eightQueens,row,col)) {
				eightQueens[row][col] = 'Q';
				row = (int) (Math.random()*8);
				col = (int) (Math.random()*8);
				System.out.println(count+" points has been found");
				count++;
			} else {
				row = (int) (Math.random()*8);
				col = (int) (Math.random()*8);
			}
		}
		//set the last point
		//setTheLastPoint(eightQueens);
		
		//Display the eightQueens
		for (row = 0; row < eightQueens.length; row++) {
			for ( col = 0; col < eightQueens.length; col++) {
				System.out.print(eightQueens[row][col]+"|");
			}
			System.out.println();
		}
	}
	
	public static boolean isValid(char[][] eightQueens, int row, int col) {
		for (int i = 0; i < eightQueens.length; i++) {
			if (eightQueens[i][col] == 'Q') {
				return false;
			}
		}
		for(int j = 0; j < eightQueens.length; j++){
			if (eightQueens[row][j] == 'Q') {
				return false;
			}
		}
		for(int i = row+1, j =col+1; i < 8&&j<8; i++,j++){
			if (eightQueens[i][j] == 'Q') {
				return false;
			}
		}
		for(int i = row, j = col; i>=0&&j>=0;i--,j--){
			if (eightQueens[i][j] == 'Q') {
				return false;
			}
		}
		return true;
	}
	
	public static void setTheLastPoint(char[][] eightQueens) {
		int row,col;
		boolean isQueen = true;
		//set the row
		for ( row = 0; row < eightQueens.length; row++) {
			for (int j = 0; j < eightQueens.length; j++) {
				if (eightQueens[row][j] == 'Q') {
					isQueen = false;
				}
			}
			if (isQueen) {
				break;
			}
		}
		//set the col
		isQueen = true;
		for (col = 0; col < eightQueens.length; col++) {
			for (int i = 0; i < eightQueens.length; i++) {
				if (eightQueens[i][col] == 'Q') {
					isQueen = false;
				}
			}
			if (isQueen) {
				break;
			}
		}
		eightQueens[row][col] = 'Q';
	}

}
