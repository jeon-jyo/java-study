package kr.co.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		
		ConnectionPool pool1 = ConnectionPool.getInstance();
		ConnectionPool pool2 = ConnectionPool.getInstance();
		
		if (pool1 == pool2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		/*
		 * true
		 */
	}
}
