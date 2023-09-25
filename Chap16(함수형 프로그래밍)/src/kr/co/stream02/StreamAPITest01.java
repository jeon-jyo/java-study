package kr.co.stream02;

import java.util.Arrays;

public class StreamAPITest01 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		// for문
		int even = 0;
		for(int num : numbers) {
			if(num % 2 == 0) {
				even += num;
			}
		}
		System.out.println(even);				// 6
		
		// stream
		int sumOfEven = Arrays.stream(numbers)
				.filter(n -> n % 2 == 0)
				.sum();
		System.out.println(sumOfEven);			// 6
		/*
		 * IntStream filter(IntPredicate predicate)
		 */
		
		// 1.
		Arrays.stream(numbers).filter(n -> n % 2 == 0).forEach(s -> System.out.print(s + " "));		// 2 4 
		System.out.println();
		
		// 2.
		int[] evenNumbers = Arrays.stream(numbers)
				.filter(n -> n % 2 == 0)
				.toArray();
		for(int even0 : evenNumbers) {
			System.out.print(even0 + " ");															// 2 4 
		}
		
	}
}
