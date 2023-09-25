package kr.co.inheritance02;

public class EmployeeTest {

	public static void main(String[] args) {
		
		RempDTO dto = new RempDTO();
		System.out.println(dto);
		System.out.println();
		/*
			Employee 기본 생성자
			RempDTO 기본 생성자
			Employee [name=null, age=0, phone=null, empDate=null, dept=null]
		 */
		
		// 상속 관계에서 초기화 => 부모의 생성자에서 초기화 (정보은닉 적용)
		RempDTO dto2 = new RempDTO("이순신", 30, "010-1234-5678", "2023-06-14", "개발팀");
		System.out.println(dto2);
		/*
			Employee 매개변수가 있는 생성자
			RempDTO 매개변수가 있는 생성자
			Employee [name=이순신, age=30, phone=010-1234-5678, empDate=2023-06-14, dept=개발팀]
		 */
	}
}
