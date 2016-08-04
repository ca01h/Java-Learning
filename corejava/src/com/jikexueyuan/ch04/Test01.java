package com.jikexueyuan.ch04;

public class Test01 {

	public static void main(String[] args) {
		int score[]={11,45,56,34,67};
		for (int i = 0; i < score.length-1; i++) {
			for (int j = i+1; j < score.length; j++) {
				if (score[i]<score[j]) {
					int temp=score[i];
					score[i]=score[j];
					score[j]=temp;
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}

}
