package kr.co.array01;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		
		// 길이가 3인 int형 1차원 배열 생성
		int[] arr1 = new int[3];
		arr1[0] = 100;	// 첫번째 요소
		arr1[1] = 90;	// 두번째 요소
		arr1[2] = 80;	// 세번째 요소
		int sum = arr1[0] + arr1[1] + arr1[2];
		
		System.out.println(Arrays.toString(arr1));	// [100, 90, 80]
		System.out.println("총점 : " + sum);	// 총점 : 270
		
		int[] arr2 = new int[10];
		int total = 0;
		
		for(int i = 0, num = 1; i < arr2.length; i++, num++) {
			arr2[i] = num;
		}
		System.out.println(Arrays.toString(arr2));	// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		for(int i = 0; i < arr2.length; i++) {
			total += arr2[i];
		}
		System.out.println(total);	// 55
	}
}
