package kr.co.reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student(10, "이순신");
		student.setKoreaSubject("국어", 100);
		student.setMathSubject("수학", 80);
		student.showScore();
		
		Student student2 = new Student(20, "이순신");
		student2.setKoreaSubject("국어", 90);
		student2.setMathSubject("수학", 95);
		student2.showScore();
		
		/*
			이순신 학생의 총 점수는 : 180 점 입니다.
			이순신 학생의 총 점수는 : 185 점 입니다.
		 */
	}
}
