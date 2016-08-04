package test05;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test {
	private static List<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		System.out.println("=====ѧ����Ϣ����ϵͳ=====");
		System.out.println("��������ָ��");
		int n = -1;
		while (n != 0) {
			System.out.println("1.����ѧ����ѧ�š��������ĿƳɼ�");
			System.out.println("2.�����ƽ���ɼ�����ƽ���ɼ���������ɼ���");
			System.out.println("3.���ȫ�����ƽ���֣���߷ֺ���ͷ�");
			System.out.println("4.����������ѯ�ɼ���");
			System.out.println("0.�˳�ϵͳ");
			n = scanner.nextInt();
			switch (n) {
			case 1:
				InputGrade();
				break;
			case 2:
				CalAverage();
				break;
			case 3:
				ShowGrade();
				break;
			case 4:
				SearchStudent();
				break;
			case 0:
				break;
			default:
				break;
			}
		}
	}

	private static void SearchStudent() {
		System.out.println("����Ҫ����ѧ��������");
		Scanner scanner = new Scanner(System.in);
		String name  = scanner.nextLine();
		boolean isFind = false;
		for (Student student : students) {
			if (student.getName().equals(name)) {
				isFind = true;
				System.out.println("���ҳɹ�");
				System.out.println(student.toString());
			}
		}
		if (!isFind) {
			System.out.println("�޴�ѧ��");
		}
	}

	private static void ShowGrade() {
		double firstMax = Double.MIN_VALUE, firstMin = Double.MAX_VALUE, firstSum = 0;
		double secondMax = Double.MIN_VALUE, secondMin = Double.MAX_VALUE, secondSum = 0;
		double thirdMax = Double.MIN_VALUE, thirdMin = Double.MAX_VALUE, thirdSum = 0;
		double fourthMax = Double.MIN_VALUE, fourthMin = Double.MAX_VALUE, fourthSum = 0;
		for (Student student : students) {
			if (firstMax < student.getFirstSubject()) {
				firstMax = student.getFirstSubject();
			}
			if (firstMin > student.getFirstSubject()) {
				firstMin = student.getFirstSubject();
			}
			firstSum += student.getFirstSubject();
			if (secondMax < student.getSecoundSubject()) {
				secondMax = student.getSecoundSubject();
			}
			if (secondMin > student.getSecoundSubject()) {
				secondMin = student.getSecoundSubject();
			}
			secondSum += student.getSecoundSubject();
			if (thirdMax < student.getThirdSubject()) {
				thirdMax = student.getThirdSubject();
			}
			if (thirdMin > student.getThirdSubject()) {
				thirdMin = student.getThirdSubject();
			}
			thirdSum += student.getThirdSubject();
			if (fourthMax < student.getFourthSubject()) {
				fourthMax = student.getFourthSubject();
			}
			if (fourthMin > student.getFourthSubject()) {
				fourthMin = student.getFourthSubject();
			}
			fourthSum += student.getFourthSubject();
		}

		System.out.println("��һѧ����߷�:" + firstMax + "��ͷ�:" + firstMin + "ƽ����:" + firstSum / students.size());
		System.out.println("�ڶ�ѧ����߷�:" + secondMax + "��ͷ�:" + secondMin + "ƽ����:" + secondSum / students.size());
		System.out.println("����ѧ����߷�:" + thirdMax + "��ͷ�:" + thirdMin + "ƽ����:" + thirdSum / students.size());
		System.out.println("����ѧ����߷�:" + fourthMax + "��ͷ�:" + fourthMin + "ƽ����:" + fourthSum / students.size());
	}

	private static void CalAverage() {
		students.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return (int) (o2.getAverageGrade() - o1.getAverageGrade());
			}
		});
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

	private static void InputGrade() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ���ĸ���");
		int n = Integer.parseInt(scanner.nextLine());
		System.out.println("��˳������ѧ����ѧ�š��������ĿƳɼ�,���Զ���Ϊ�ָ����ÿ����һ��ѧ������");
		for (int i = 0; i < n; i++) {
			String info = scanner.nextLine();
			String[] infoS = info.split(",");
			Student student = new Student(infoS[0], infoS[1], Double.parseDouble(infoS[2]),
					Double.parseDouble(infoS[3]), Double.parseDouble(infoS[4]), Double.parseDouble(infoS[5]));
			students.add(student);
		}
		System.out.println("�������");

	}

}
