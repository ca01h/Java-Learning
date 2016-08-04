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
		System.out.println("=====学生信息管理系统=====");
		System.out.println("请出入操作指令");
		int n = -1;
		while (n != 0) {
			System.out.println("1.输入学生的学号、姓名、四科成绩");
			System.out.println("2.计算出平均成绩，以平均成绩降序输出成绩表");
			System.out.println("3.输出全组各科平均分，最高分和最低分");
			System.out.println("4.输入姓名查询成绩。");
			System.out.println("0.退出系统");
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
		System.out.println("输入要查找学生的姓名");
		Scanner scanner = new Scanner(System.in);
		String name  = scanner.nextLine();
		boolean isFind = false;
		for (Student student : students) {
			if (student.getName().equals(name)) {
				isFind = true;
				System.out.println("查找成功");
				System.out.println(student.toString());
			}
		}
		if (!isFind) {
			System.out.println("无此学生");
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

		System.out.println("第一学科最高分:" + firstMax + "最低分:" + firstMin + "平均分:" + firstSum / students.size());
		System.out.println("第二学科最高分:" + secondMax + "最低分:" + secondMin + "平均分:" + secondSum / students.size());
		System.out.println("第三学科最高分:" + thirdMax + "最低分:" + thirdMin + "平均分:" + thirdSum / students.size());
		System.out.println("第四学科最高分:" + fourthMax + "最低分:" + fourthMin + "平均分:" + fourthSum / students.size());
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
		System.out.println("请输入学生的个数");
		int n = Integer.parseInt(scanner.nextLine());
		System.out.println("按顺序输入学生的学号、姓名、四科成绩,并以逗号为分割符，每输入一个学生换行");
		for (int i = 0; i < n; i++) {
			String info = scanner.nextLine();
			String[] infoS = info.split(",");
			Student student = new Student(infoS[0], infoS[1], Double.parseDouble(infoS[2]),
					Double.parseDouble(infoS[3]), Double.parseDouble(infoS[4]), Double.parseDouble(infoS[5]));
			students.add(student);
		}
		System.out.println("输入完毕");

	}

}
