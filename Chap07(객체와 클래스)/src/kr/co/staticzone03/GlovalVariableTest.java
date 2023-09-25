package kr.co.staticzone03;

class Cat {
	static int gloval = 10;	// static 변수 . 클래스 변수 . 정적변수
	int num = 5;			// 멤버 변수 . instance 변수
	
	/*
	 * * static 메소드는 non-static 멤버에 접근할 수 없다
	 *   반대로 non-static 은 static 접근 가능
	 *   
	 * * static은 this 사용 불가
	 *   이것 또한 객체가 생성되야만 쓸 수 있는 메소드이기 때문
	 */
	public void printValue(int num) {
		this.num = num;
//		this.gloval = num;	// The static field Cat.gloval should be accessed in a static way
		gloval = num;
		Cat.gloval = num;
		
		System.out.println("num : " + num);
		System.out.println("gloval : " + Cat.gloval);
	}
}

public class GlovalVariableTest {

	public static void main(String[] args) {
		
		Cat cat = new Cat();	// 지역변수(참조변수) cat => 스택 영역에 생성
		cat.printValue(20);
		
		cat.num = 5;			// 인스턴스 멤버 접근
//		cat.gloval = 2;			// The static field Cat.gloval should be accessed in a static way
		Cat.gloval = 10;		// static 변수에 직접 접근
		
		System.out.println(cat.num);
		System.out.println(Cat.gloval);
		
		/*
			num : 20
			gloval : 20
			5
			10
		 */
	}
}
