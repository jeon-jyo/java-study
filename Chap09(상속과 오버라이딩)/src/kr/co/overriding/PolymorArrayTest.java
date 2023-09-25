package kr.co.overriding;

public class PolymorArrayTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();

		// Dog, Cat 을 저장할 배열을 생성하시오
		Animal[] animals = {new Dog(), new Cat()};
		
		// 다형성 배열
		Animal[] ani = new Animal[2];
		ani[0] = dog;
		ani[1] = cat;

		display(ani);
		/*
			멍멍이가 밥을 먹는다
			멍멍이가 공을 쫓아간다
			야옹이가 밥을 먹는다
			야옹이는 밤에 활동한다
		 */
	}

	private static void display(Animal[] ani) {
		for(int i = 0; i < ani.length; i++) {
			ani[i].eat();
			
			if(ani[i] instanceof Dog) {
				((Dog)ani[i]).chase();
			} else if(ani[i] instanceof Cat) {
				((Cat)ani[i]).nocturnal();
			}
		}
	}
}
