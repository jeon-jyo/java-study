package kr.co.constructor03;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		System.out.println(student);
		
		/*
		 * private 라서 변수 접근 안됨
		 * The field Student.name is not visible
		 */
//		System.out.println(student.name);
		System.out.println(student.getName());
		System.out.println();
		
		Student student1 = new Student("이순신");
		System.out.println(student1);
		System.out.println();
		
		Student student2 = new Student(20);
		System.out.println(student2);
		System.out.println();
		
		Student student3 = new Student("신사임당", 30);
		System.out.println(student3);
		
		/*
			기본생성자 호출
			Student [name=null, age=0]
			null
			
			매개변수가 String 만 있는 생성자 호출
			Student [name=이순신, age=0]
			
			매개변수가 int 만 있는 생성자 호출
			Student [name=null, age=20]
			
			매개변수가 String, int 두 개 있는 생성자 호출
			Student [name=신사임당, age=30]
		 */
	}

}
