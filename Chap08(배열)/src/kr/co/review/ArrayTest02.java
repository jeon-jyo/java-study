package kr.co.review;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 생성할 배열의 length : 3
 * 배열 요소 입력 : 2 3 4
 * sum = 9
 * toString -> [2, 3, 4]
 */
public class ArrayTest02 {

	public static void main(String[] args) {
		
		int[] arr;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("생성할 배열의 length : ");
		int len = scanner.nextInt();
		arr = new int[len];
		
//		System.out.print("배열의 요소 입력 : ");
//		for(int i = 0; i < len; i++) {
//			int x = scanner.nextInt();
//			arr[i] = x;
//			sum += x;
//		}
		
		System.out.print("배열의 요소 입력 : ");
		scanner.nextLine();
		
		for(int i = 0; i < len; i++) {
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		System.out.println("sum = " + sum);
		System.out.println(Arrays.toString(arr));
		
		scanner.close();
	}
}
