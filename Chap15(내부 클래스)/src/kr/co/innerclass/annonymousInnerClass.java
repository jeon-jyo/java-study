package kr.co.innerclass;

//class Outer {		// The type Outer is already defined -> 패키지가 같아서
class Outter {
	
	// getRunnable() 메서드로 정의
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {
			int localNum = 10;
			
			@Override
			public void run() {
				System.out.println("i = " + i + " (로컬 메서드의 매개변수)");
				System.out.println("num = " + num + " (로컬 메서드의 인스턴스 변수)");
				System.out.println("localNum = " + localNum + " (로컬 내부 클래스의 인스턴스 변수)");
			}
			
		};
	}
	
	// runner 변수로 정의
	Runnable runner = new Runnable() {	// annonymous inner type
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};
}

public class annonymousInnerClass {
	
	public static void main(String[] args) {
		
		/* annonymous inner class 로 객체를 생성 */
		
		Outter out = new Outter();
		
		// 1.
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		System.out.println();
		
		// 2.
		out.runner.run();
		
	}
}
