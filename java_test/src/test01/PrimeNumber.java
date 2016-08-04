package test01;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Ç°50¸öËØÊı£º");
		final int total = 50;
		final int numberOfEachLine = 5;
		int count = 1;
		boolean isPrime = true;
		
		for (int number = 1; number <= 50; number++) {
			isPrime = true;
			for (int i = 2; i <= number/2; i++) {
				if (number%i == 0) {
					isPrime =false;
					break;
				}
			}
			if (isPrime) {
				if (count %5 == 0) {
					System.out.println(number);
				}
				else {
					System.out.print(number);
				}
				count ++;
			}
		}
	}

}
