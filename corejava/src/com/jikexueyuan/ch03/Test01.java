package com.jikexueyuan.ch03;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Test01 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入5分制分数：");
		int sorce=scanner.nextInt();
		switch (sorce) {
		case 5:
			System.out.println(sorce+"优秀");
			break;
		case 4:
			System.out.println(sorce+"良好");
			break;
		case 3:
			System.out.println(sorce+"及格");
			break;
		case 2:
		case 1:
			System.out.println(sorce+"不及格");
		default:
			System.err.println("你输入的不是5分制分数！");
		}
	}

}
