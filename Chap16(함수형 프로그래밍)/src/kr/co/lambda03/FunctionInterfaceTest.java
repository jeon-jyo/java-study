package kr.co.lambda03;

import java.util.function.Function;

public class FunctionInterfaceTest {

	public static void main(String[] args) {
		
		/* 기능 (What) 에 포커싱 */
		
		Function<Integer, Integer> myAdder = x -> x + 10;
		int result = myAdder.apply(50);
		System.out.println(result);
	}
}
