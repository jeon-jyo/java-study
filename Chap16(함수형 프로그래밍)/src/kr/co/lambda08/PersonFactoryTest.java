package kr.co.lambda08;

public class PersonFactoryTest {

	public static void main(String[] args) {
		/*
		 * 생성자 참조
		 *  - 클래스명::new
		 */
		PersonFactory personFactory = Person::new;
		Person person = personFactory.create("이순신", 40);
		System.out.println(person);		// 이순신, 40
		
		// 익명 내부 클래스 사용
		PersonFactory personFactory2 = new PersonFactory() {
			
			@Override
			public Person create(String name, int age) {
				return new Person(name, age);
			}
		};
		Person person2 = personFactory2.create("신사임당", 30);
		System.out.println(person2);	// 신사임당, 30
		
		// 람다 표현식 사용
		PersonFactory personFactory3 = (name, age) -> new Person(name, age);
		Person person3 = personFactory3.create("이도", 23);
		System.out.println(person3);	// 이도, 23
	}
}
