package kr.co.lambda03;

import java.util.function.Function;

public class AdderTest {

	public static void main(String[] args) {
		
		Function<Integer, Integer> myAdder = new Adder();
		int result = myAdder.apply(50);
		System.out.println(result);		// 60
	}
}
