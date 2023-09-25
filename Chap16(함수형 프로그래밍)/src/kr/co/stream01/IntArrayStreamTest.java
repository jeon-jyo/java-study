package kr.co.stream01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		/*
		 * java.util.stream.IntStream;
		 * - 순차 및 병렬 집계 작업을 지원하는 기본 int 값 요소의 시퀀스
		 */
		
		int[] arr = {1, 2, 3, 4, 5};
		
		// 1.
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));		// 1 2 3 4 5
		System.out.println();
		// 2.
		IntStream is = Arrays.stream(arr);
		is.forEach(n -> System.out.print(n + " "));						// 1 2 3 4 5
		System.out.println();
		/*
		 * IntStream Arrays.stream(int[] array)
		 *  - 배열에 대한 IntStream
		 *  
		 *  void forEach(IntConsumer action)
		 *   - IntConsumer (functional interface)
		 *   	- void accept(int value)
		 */
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);										// 15
		
		long count = Arrays.stream(arr).count();
		System.out.println(count);										// 5
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int sum2 = list.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println(sum2);										// 15
		/*
		 * Stream<Integer> Collection.stream()
		 * 
		 * IntStream mapToInt(ToIntFunction<? super Integer> mapper)
		 * 
		 * list 안에는 address, 값이 있음
		 * 중간연산 + 최종연산
		 */
	}
}
