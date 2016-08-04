package ch05;

public class Ex5_27 {

	public static void main(String[] args) {
		final int START = 101;
		final int END = 2100;
		final int NUMBER_OF_YEAR_OER_LINE = 10;
		int count = 0;
		boolean isLeap = false;
		System.out.println("101 to 2100");
		
		for (int i = START; i <= END; i++) {
			if ((i%4==0&&i%100!=0)||i%400==0) {
				System.out.print(i+" ");
				count++;
			}
			if (count%10==0) {
				System.out.print("\n");
			}
		}
		System.out.println("The total of leap years is :"+count);
	}
}
