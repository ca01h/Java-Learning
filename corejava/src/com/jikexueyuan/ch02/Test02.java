package com.jikexueyuan.ch02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//����1������scanner��Ķ���
		Scanner scanner=new Scanner(System.in);
		//����2�������̨����ı�
		System.out.println("������");
		//����3�������û����������
		String name=scanner.next();
		System.out.println("�Ա�");
		char sex=scanner.next().charAt(0);
		System.out.println("���䣺");
		int age=scanner.nextInt();
		System.out.println("��ߣ�");
		double height=scanner.nextDouble();
		System.out.println("�Ը�");
		String type=scanner.next();
	}

}
