package kr.co.constructor01;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student();	// 기본생성자 호출
		System.out.println(student.showStudentInfo());	// null 학생의 학번은 0 이고, 0학년 입니다.
		
		Student student2 = new Student(202307, "이순신", 3);
		System.out.println(student2.showStudentInfo());	// 이순신 학생의 학번은 202307 이고, 3학년 입니다.
		
	}
}
