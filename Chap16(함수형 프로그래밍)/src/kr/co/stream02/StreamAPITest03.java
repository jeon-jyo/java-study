package kr.co.stream02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPITest03 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Predicate<Integer> isEven = n -> n % 2 == 0;	// 짝수이면 true
		/*
		 * Interface Predicate<T>
		 *  - boolean test(T t)
		 */
		
		int sumOfNumbers = numbers.stream()
//				.filter(isEven)
				.filter(StreamAPITest03::isEven)
				.sorted()
				.map(n -> n*n)
				.reduce(0, Integer::sum);
		System.out.println("1 ~ 10 사이 짝수의 제곱 합 : " + sumOfNumbers);	// 220
		
	}
	
	public static boolean isEven(int numbers) {
		return numbers % 2 == 0;
	}
	
}
