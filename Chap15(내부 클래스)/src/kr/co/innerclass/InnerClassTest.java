package kr.co.innerclass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();	// 내부 클래스 생성
	}
	
	class InClass {					// new 해서 생성된 것은 아님 선언만 한 것
		int inNum = 100;
//		static int sInNum = 200;	// cannot be declared static in a non-static inner type
		
		void inTest() {
			System.out.println("OutClss num = " + num + " (외부 클래스의 인스턴스(멤버) 변수)");
			System.out.println("OutClss sNum = " + sNum + " (외부 클래스의 클래스(static) 변수)");
			System.out.println("InClass inNum = " + inNum + " (내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingInClass() {
		inClass.inTest(); 			// 내부 클래스 (참조) 변수를 사용하여 메서드 호출
	}
	
	// OutClass 상관없이 메모리에 올라감
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		// 정적 내부클래스의 일반메서드
		void inTest() {
			/* Cannot make a static reference to the non-static field */
//			num = num + 10;			// 외부 클래스의 인스턴스 변수 사용 불가 -> 객체가 만들어지고 사용할 수 있음
			System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 클래스 변수 사용)");
			System.out.println("InStaticClass inNum = " + inNum + " (정적 내부클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + " (정적 내부클래스의 클래스 변수 사용)");
		}
		
		// 정적 내부클래스의 static 메서드
		static void sTest() {
//			num += 10;				// 외부 클래스의 인스턴스 변수 사용 불가
//			inNum += 10;			// 내부 클래스의 인스턴스 변수 사용 불가
			System.out.println("OutClass sNum = " + sNum +  " (외부 클래스의 클래스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum +  " (내부 클래스의 클래스 변수 사용)");
		}
	}
	
}

public class InnerClassTest {

	public static void main(String[] args) {
		
		// 1. 외부 클래스 이용하여 내부 클래스의 메서드 호출
		OutClass outClass = new OutClass();
		outClass.usingInClass();
		System.out.println();
		
		// 2. (이미 만들어진) 외부클래스 객체를 이용하여 내부 클래스의 메서드 호출
		OutClass.InClass inClass = outClass.new InClass();
		inClass.inTest();
		System.out.println();
		
		// 1.
		// 외부 클래스 생성하지 않고 바로 정적(static) 내부 클래스 생성
		// 정적 내부 클래스의 일반메서드 호출
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		System.out.println();

		// 2.
		// 정적 내부 클래스의 static 메서드 호출
		OutClass.InStaticClass.sTest();
		
	}
}
