package kr.co.set01;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest03 {

	public static void main(String[] args) {
		
		/*
		 * class Integer extends Number implements Comparable<Integer>
		 * 
		 * 앞의 숫자와 뒤의 숫자가 뒤에 동일한지 확인 가능
		 */
		
		int[] nums = {1, 2, 3, 4, 5, 2, 4, 6, 7, 1, 3};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int number : nums) {
			set.add(number);
		}
		
		for(int number : nums) {
			System.out.print(number + " ");		// 1 2 3 4 5 2 4 6 7 1 3 
		}
		
	}
}
