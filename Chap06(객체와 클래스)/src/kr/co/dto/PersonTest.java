package kr.co.dto;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.name = "이순신";
		person.age = 20;
		person.phone = "010-1234-5678";
		
		person.play();
		person.eat();
		person.walk();

		/*
		 * String kr.co.dto.Person.toString()
		 *  - 객체를 파라미터로 넣으면 컴파일러가 toString() 호출
		 */
		System.out.println(person);	 // Person [name=이순신, age=20, phone=010-1234-5678]
		
		Person person2 = new Person();
		
		person2.name = "신사임당";
		person2.age = 30;
		person2.phone = "010-1111-2222";
		
		person2.play();
		person2.eat();
		person2.walk();
		
		System.out.println(person2.toString());	// Person [name=신사임당, age=30, phone=010-1111-2222]

	}
}
