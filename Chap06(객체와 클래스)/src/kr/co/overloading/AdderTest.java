package kr.co.overloading;

public class AdderTest {

	public static void main(String[] args) {
		
		Adder adder = new Adder();
		int iResult = adder.add(10, 50);
		System.out.println(iResult);
		
		Adder adder2 = new Adder();
		long lResult = adder2.add(100, 7500L);
		System.out.println(lResult);
		
		Adder adder3 = new Adder();
		double dResult = adder3.add(100.5, 50.5);
		System.out.println(dResult);
		
		/*
			add(int x, int y)
			60
			add(int x, long y)
			7600
			add(double x, double y)
			151.0
		 */
	}
}
