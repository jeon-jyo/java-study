package kr.co.object01;

public class ObjectTest {

	public static void main(String[] args) {
		
		A a = new A();
		a.display();
		
		/*
		 * Object 타입으로 Upcasting 되면
		 * 반드시 Downcasting 을 해야함
		 */
		Object obj = new A();	
		((A)obj).display();
		
	}
}
