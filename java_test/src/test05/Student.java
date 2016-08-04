package test05;

public class Student {
	private String name;                     //����
	private String id;                       //ѧ��
	private double firstSubject;             //��һ�Ƴɼ�
	private double secoundSubject;           //�ڶ��Ƴɼ�
	private double thirdSubject;             //�����Ƴɼ�
	private double fourthSubject;            //���ĿƳɼ�
	private double averageGrade;             //ƽ���ɼ�
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
