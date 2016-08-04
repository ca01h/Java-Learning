package ch03;

public class Ex3_24 {
	public static void main(String[] args) {
		final int NUMBER_OF_CARDS=52;
		System.out.print("The card you picked is ");
		int number = (int) (Math.random()*NUMBER_OF_CARDS);
		
		if (number%13==0)
			System.out.print("Ace of ");
		else if (number%13==10) 
			System.out.print("Jack of ");
		else if (number%13==11) {
			System.out.print("Queen of ");
		}
		else if (number%13==12) {
			System.out.print("King of ");
		}
		else {
			System.out.print((number%13)+" of ");
		}
		
		if (number/13==0) {
			System.out.println("Clubs");
		}
		else if (number/13==1) {
			System.out.println("Diamonds");
		}
		else if (number/13==2) {
			System.out.println("Hearts");
		}
		else {
			System.out.println("Spades");
		}
	}
}


