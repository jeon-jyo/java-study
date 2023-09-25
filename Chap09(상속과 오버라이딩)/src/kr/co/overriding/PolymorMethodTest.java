package kr.co.overriding;

public class PolymorMethodTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		display(dog);
		System.out.println();
		
		Cat cat = new Cat();
		display(cat);
		/*
			Animal() 기본 생성자 호출
			Dog() 기본 생성자 호출
			멍멍이가 밥을 먹는다
			멍멍이가 공을 쫓아간다
			
			Animal() 기본 생성자 호출
			Cat() 기본 생성자 호출
			야옹이가 밥을 먹는다
			야옹이는 밤에 활동한다
		 */
	}
	
	private static void display(Animal animal) {	// 다형성 적용된 인수
		animal.eat();
		
		if(animal instanceof Dog) {
			((Dog)animal).chase();
		} else if(animal instanceof Cat) {
			((Cat)animal).nocturnal();
		} else {
			System.out.println("상속관계가 아닌 객체입니다.");
		}
	}
	
}
