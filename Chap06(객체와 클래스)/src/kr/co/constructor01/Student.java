package kr.co.constructor01;

public class Student {

	int studentId;
	String studentName;
	int grade;
	
	// 기본 생성자
	public Student() {
		System.out.println("기본생성자 호출");
	}
	
	// 멤버 변수를 초기화 하는 목적의 생성자
	public Student(int studentId, String studentName, int grade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + " 학생의 학번은 " + studentId + " 이고, "
				+ grade + "학년 입니다.";
	}
}
