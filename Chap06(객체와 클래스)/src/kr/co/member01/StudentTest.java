package kr.co.member01;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		// student 객체의 멤버에 대한 값
		student.studentName = "이순신";
		student.address = "서울 강동구";
		student.showStudentInfo();
		
		Student student2 = new Student();
		
		student2.studentName = "심사임당";
		student2.address = "인천 서구";
		student2.showStudentInfo();
		
		/*
		 * String java.lang.Object.toString()
		 *  - toString() 없으면 Object 의 toString() 씀
		 *  - Object 의 toString() 는 객체 주소 번지가 나옴
		 */
		System.out.println(student);	// kr.co.member01.Student@71dac704
		System.out.println(student2.toString());	// kr.co.member01.Student@123772c4

		/*
		 * 메인 메서드 안에 객체 변수가 두개 (student, student2)
		 * - 로컬 변수
		 * - 메모리 위치 : 스택 (4바이트)
		 */
	}
	
}
