package kr.co.overriding;

public class DogCatTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.eat();
		dog.chase();
		System.out.println();
		/*
			Animal() 기본 생성자 호출
			Dog() 기본 생성자 호출
			멍멍이가 밥을 먹는다
			멍멍이가 공을 쫓아간다
		 */
		Cat cat = new Cat();
		cat.eat();
		cat.nocturnal();
		System.out.println();
		/*
			Animal() 기본 생성자 호출
			Cat() 기본 생성자 호출
			야옹이가 밥을 먹는다
			야옹이는 밤에 활동한다
		 */
		
/* 
 * 업캐스팅(Upcasting)
 *  - 부모타입으로 자식객체를 가리킨다
 */
		Animal animal = new Dog();
		animal.eat();
//		animal.chase();		// 업캐스팅 후 자식 메서드는 쓸 수 없음
		System.out.println();
		
/*
 * 다운캐스팅(Downcasting)
 *  - 업캐스팅된 대상만 할 수 있음
 *  - 명시적으로 캐스팅 해줘야 함
 *  - 다시 자식 메서드, 변수를 쓸 수 있음
 */
		// 1.
		Dog dDog = (Dog)animal;	// Add cast to 'Dog'
		dDog.chase();

		// 2.
		((Dog)animal).chase();	// 메서드를 한번만 실행 할 것이라 따로 변수에 저장해둘 필요성이 없을 때
		
		Animal animal2 = new Cat();
		animal2.eat();
		((Cat)animal2).nocturnal();
	}
}
