package kr.co.arraylist02;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentL = new Student(2023, "Lee");
		studentL.addSubject("국어", 100);
		studentL.addSubject("수학", 80);
		
		Student studentS = new Student(2022, "Shin");
		studentS.addSubject("국어", 90);
		studentS.addSubject("수학", 95);
		studentS.addSubject("영어", 100);
		
		studentL.showInfo();
		System.out.println();
		studentS.showInfo();
		
		/*
			Lee 학생의 국어 점수는 100 입니다.
			Lee 학생의 수학 점수는 80 입니다.
			Lee 학생의 총점은 180 점 입니다.
			
			Shin 학생의 국어 점수는 90 입니다.
			Shin 학생의 수학 점수는 95 입니다.
			Shin 학생의 영어 점수는 100 입니다.
			Shin 학생의 총점은 285 점 입니다.
		 */
	}
}
