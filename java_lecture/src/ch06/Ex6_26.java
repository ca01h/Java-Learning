package ch06;

public class Ex6_26 {

	public static void main(String[] args) {
		int count = 0;
		String number = ""+2;
		while(count!=100){
			if (isPlalindrome(number)&&isPrime(number)) {
				System.out.print(number+" ");
				count++;
			}
			if (count%10==0) {
				System.out.println();
			}
			number+='b'-'a';
		}
	}

	public static boolean isPrime(String number) {
		for (int i = 2; i < Integer.parseInt(number)/2; i++) {
			if (Integer.parseInt(number)%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPlalindrome(String number) {
		if (number.length()==1) {
			return true;
		}
		else {
			for(int i = 0, j=number.length()-1;i<j;i++,j--){
				if (number.charAt(i)!=number.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}
