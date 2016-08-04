package test05;

public class Student {
	private String name;                     //名字
	private String id;                       //学号
	private double firstSubject;             //第一科成绩
	private double secoundSubject;           //第二科成绩
	private double thirdSubject;             //第三科成绩
	private double fourthSubject;            //第四科成绩
	private double averageGrade;             //平均成绩
	public Student(String name, String id, double firstSubject, double secoundSubject, double thirdSubject,
			double fourthSubject) {
		super();
		this.name = name;
		this.id = id;
		this.firstSubject = firstSubject;
		this.secoundSubject = secoundSubject;
		this.thirdSubject = thirdSubject;
		this.fourthSubject = fourthSubject;
		averageGrade = (firstSubject+secoundSubject+thirdSubject+fourthSubject)/4;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", firstSubject=" + firstSubject + ", secoundSubject="
				+ secoundSubject + ", thirdSubject=" + thirdSubject + ", fourthSubject=" + fourthSubject
				+ ", averageGrade=" + averageGrade + "]";
	}
	public double getAverageGrade() {
		return averageGrade;
	}
	public double getFirstSubject() {
		return firstSubject;
	}
	public double getSecoundSubject() {
		return secoundSubject;
	}
	public double getThirdSubject() {
		return thirdSubject;
	}
	public double getFourthSubject() {
		return fourthSubject;
	}
	public String getName() {
		return name;
	}	
	
}
