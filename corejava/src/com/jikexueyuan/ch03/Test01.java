package com.jikexueyuan.ch03;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Test01 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����5���Ʒ�����");
		int sorce=scanner.nextInt();
		switch (sorce) {
		case 5:
			System.out.println(sorce+"����");
			break;
		case 4:
			System.out.println(sorce+"����");
			break;
		case 3:
			System.out.println(sorce+"����");
			break;
		case 2:
		case 1:
			System.out.println(sorce+"������");
		default:
			System.err.println("������Ĳ���5���Ʒ�����");
		}
	}

}
