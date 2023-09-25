package kr.co.innerclass;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	// 로컬 메서드
	// Runnable 은 Thread 의 상위 인터페이스
	Runnable getRunnable(int i) {
		int num = 100;
		
		// 로컬 이너클래스
		class MyRunnable implements Runnable {
			int localNum = 10;
			
			@Override
			public void run() {		// run() 메서드는 callback. 나중에 또 호출될 수 있음
				/* 
				 * Local variable defined in an enclosing scope must be final or effectively final
				 * 
				 * 메서드의 매개변수, 로컬변수는 사용할 수 있지만 assign 안됨
				 * 컴파일러가 final 로 정의해두고 상수풀에 올라가 있음
				 */
//				i = 100;
//				num = 200;
				System.out.println("i = " + i + " (로컬 메서드의 매개변수)");
				System.out.println("num = " + num + " (로컬 메서드의 인스턴스 변수)");
				System.out.println("localNum = " + localNum + " (로컬 내부 클래스의 인스턴스 변수)");
				
				System.out.println("outNum = " + outNum + " (외부 클래스의 인스턴스 변수)");
				System.out.println("sNum = " + Outer.sNum + " (외부 클래스의 클래스 변수)");
			}
			
		}
		return new MyRunnable();
	}
}

public class LocalInnerClass {
	
	public static void main(String[] args) {
		
		Outer out = new Outer();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		
	}
}
