package ch06;

public class Ex6_30 {

	public static void main(String[] args) {
		int digit1 = (int) (1+Math.random()*6);
		int digit2 = (int) (1+Math.random()*6);
		//System.out.print(digit1+digit2);
		isWin(digit1, digit2);
	}
	
	public static void isWin(int n1,int n2) {
		if ((n1+n2)==2||(n1+n2)==3||(n1+n2)==12) {
			System.out.println("You rolled "+n1+"+"+n2+"="+(n1+n2));
			System.out.println("You lose");
		}
		else if ((n1+n2)==7||(n1+n2)==11) {
			System.out.println("You rolled "+n1+"+"+n2+"="+(n1+n2));
			System.out.println("You win");
		}
		else {
			System.out.println("You rolled "+n1+"+"+n2+"="+(n1+n2));
			System.out.println("Point is "+(n1+n2));
			int sum = n1+n2;
			again(sum);
		}
	}
	
	public static void again(int sum) {
		int n1,n2,total;
		do {
			n1 = (int) (1+Math.random()*6);
			n2 = (int) (1+Math.random()*6);
			total = n1+n2;
		} while (total!=7||total!=sum);
		if (total==7) {
			System.out.println("You rolled "+n1+"+"+n2+"="+(n1+n2));
			System.out.println("You lose");
		}
		else {
			System.out.println("You rolled "+n1+"+"+n2+"="+(n1+n2));
			System.out.println("You win");
		}
	}

}
