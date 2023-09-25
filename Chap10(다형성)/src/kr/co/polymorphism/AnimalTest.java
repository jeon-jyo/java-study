package kr.co.polymorphism;

import java.util.ArrayList;

class Animal {	
	public void move() {
		System.out.println("동물이 움직입니다");
	}
	public void eat() {
		System.out.println("동물이 먹습니다");
	}
}

class Dog extends Animal {
	@Override
	public void move() {
		System.out.println("멍멍이가 네 발로 걷습니다.");
	}
	public void playBall() {
		System.out.println("멍멍이가 주인이 던진 공을 물어옵니다.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다");
	}
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void pickUp() {
		System.out.println("독수리가 물고기를 채갑니다.");
	}
}

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Animal dAnimal = new Dog();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		dAnimal.move();
		tAnimal.move();
		eAnimal.move();
		System.out.println();
		/*
			멍멍이가 네 발로 걷습니다.
			호랑이가 네 발로 뜁니다
			독수리가 하늘을 날아갑니다.
		 */
		
		AnimalTest animalTest = new AnimalTest();
		animalTest.moveAnimal(dAnimal);
		animalTest.moveAnimal(tAnimal);
		animalTest.moveAnimal(eAnimal);
		System.out.println();
		/*
			멍멍이가 네 발로 걷습니다.
			호랑이가 네 발로 뜁니다
			독수리가 하늘을 날아갑니다.
		 */
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(dAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		for(Animal animal : animalList) {
			animal.move();
		}
		System.out.println();
		/*
			멍멍이가 네 발로 걷습니다.
			호랑이가 네 발로 뜁니다
			독수리가 하늘을 날아갑니다.
		 */
		
		animalTest.checkDowncast(animalList);
		/*
			멍멍이가 주인이 던진 공을 물어옵니다.
			호랑이가 사냥을 합니다.
			독수리가 물고기를 채갑니다.
		 */
	}
	
	public void moveAnimal(Animal animal) {	// (Dog dog) 는 다형성 적용이 안됨
		animal.move();
	}
	
	public void checkDowncast(ArrayList<Animal> list) {
		for(int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Dog) {
				Dog dAnimal = (Dog)animal;
				dAnimal.playBall();
			} else if (animal instanceof Tiger) {
				Tiger tAnimal = (Tiger)animal;
				tAnimal.hunt();
			} else if (animal instanceof Eagle) {
				Eagle eAnimal = (Eagle)animal;
				eAnimal.pickUp();
			} else {
				System.out.println("error");
			}
		}
	}
	
}
