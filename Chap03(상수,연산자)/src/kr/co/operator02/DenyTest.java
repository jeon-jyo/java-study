package kr.co.operator02;

public class DenyTest {
	
	public static void main(String[] args) {
		
		boolean power = false;
		System.out.println("power의 값 : " + power);	// false
		
		power = !power;
		System.out.println("power의 값 : " + power);	// true

		power = !power;
		System.out.println("power의 값 : " + power);	// false
		
		if(!power) {	// true
			System.out.println("if문 실행");
		}
	}

}
