package kr.co.object02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		/* 값이 같으면 논리적 동등성 */
		
		String str1 = new String("himedia");
		String str2 = new String("himedia");
		// String.equals()
		System.out.println(str1.equals(str2));	// true
		System.out.println(str1 == str2);		// false
		// String.hashCode()
		System.out.println(str1.hashCode());	// 920935299
		System.out.println(str2.hashCode());	// 920935299
		System.out.println();

		/*
		 * Integer i1 = new Integer(100);
		 * Integer i1 = 100;	-> 객체화
		 */
		Integer i1 = 100;
		Integer i2 = 100;
		// Integer.equals()
		System.out.println(i1.equals(i2));	// true
		System.out.println(i1 == i2);		// true
		// .Integer.hashCode()
		System.out.println(i1.hashCode());	// 100
		System.out.println(i1.hashCode());	// 100
		System.out.println();
		
		Student student1 = new Student(2023, "HiMedia");
		Student student2 = new Student(2023, "HiMedia");
		// Student.equals()
		System.out.println(student1.equals(student2));	// false -> true (오버라이드 정의 후)
		// == 물리적으로 같은지 확인
		System.out.println(student1 == student2);		// false
		// Student.hashCode()
		System.out.println(student1.hashCode());		// 2023
		System.out.println(student2.hashCode());		// 2023
		/*
		 * 객체의 주소를 기준으로한 해시 값을 리턴
		 * 내용이 같아도 서로 다른 해시 값을 리턴 받음
		 */
		System.out.println(System.identityHashCode(student1));	// 617901222
		System.out.println(System.identityHashCode(student2));	// 1159190947
		System.out.println();
		
		student1.setStudentName("이순신");
		// Student.clone()
		Student student3 = (Student)student1.clone();
		System.out.println(student1.equals(student3));	// true
		System.out.println(student1 == student3);		// false

	}
}
