package ch05;

public class Test01 {

	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (i*j > 2) {
					break;
				}
				System.out.print(i*j+" ");
			}
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i = 1; i < 4; i++) {
			for(int j = 1; j < 4; j++){
				if (i*j>2) {
					continue;
				}
				System.out.print(i*j+" ");
			}
			System.out.print(i+" ");
		}
	}

}
