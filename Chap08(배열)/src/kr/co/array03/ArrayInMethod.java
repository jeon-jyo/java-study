package kr.co.array03;

import java.util.Arrays;

public class ArrayInMethod {

	public static void main(String[] args) {
		
		int[] arr = ArrayInMethod.makeIntArray(5);
		int sum = ArrayInMethod.sumOfArray(arr);
		
		System.out.println(Arrays.toString(arr));	// [0, 1, 2, 3, 4]
		System.out.println(sum);	// 10
	}
	
	public static int[] makeIntArray(int length) {
		int[] arr = new int[length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}
	
	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for(int i = 0; i <arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
}
