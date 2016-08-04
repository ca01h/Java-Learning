package com.jikexueyuan.ch03;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入成绩等级：");
		char grade=scanner.next().charAt(0);
		switch (grade) {
		case '优':
			System.out.println(5);
			break;
		case '良':
			System.out.println(4);
			break;
		case '中':
			System.out.println(3);
			break;
		case '差':
			System.out.println(2);
			break;
		default:
			System.out.println("输入的等级错误");
			break;
		}
	}

}
