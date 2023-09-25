package kr.co.reference;

public class Student {

	int studentId;
	String studentName;
	 
	/*
	 * 참조자료형 타입 멤버 - Subject 클래스를 포함하고 있음
	 * 선언만 되었고 메모리상에 없음 - new 해서 객체 생성 해야함
	 */
	Subject koreaSubject;
	Subject mathSubject;
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;

		koreaSubject = new Subject();	// Subject 객체 생성
		mathSubject = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		/*
		 * Student 는 Subject 를 참조만 하고 있음
		 * - 실질적인 내용은 Subject에 있음
		 */
		koreaSubject.subjectName = name;
		koreaSubject.score = score;
	}
	public void setMathSubject(String name, int score) {
		mathSubject.subjectName = name;
		mathSubject.score = score;
	}

	public void showScore() {
		int totalScore = koreaSubject.score + mathSubject.score;
		System.out.println(studentName + " 학생의 총 점수는 : " + totalScore + " 점 입니다.");
	}

}
