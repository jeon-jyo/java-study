package kr.co.array01;

import java.util.Arrays;

class Box {}

public class ArrayTest {
	/*
	 * 배열 : 객체
	 * 
	 * int[] arr = {0, 0, 0};
	 * 
	 * - 배열의 변수 arr 은 stack / 값 {0, 0, 0} 은 heap
	 * - 객체랑 동일하게 메모리 구조를 띈다
	 */
	public static void main(String[] args) {
		
		// (방법1). 길이가 5인 int형 1차원 배열 생성 - 배열 생성 기본값, 초기화 x
		int[] arr1 = new int[5];	// 배열은 길이를 선언
		
		// (방법2). 배열 생성 및 초기화 
		int[] arr2 = new int[] {1, 2, 3, 4, 5};
		
		// (방법3). new int[] 생략 가능
		int[] arr3 = {1, 2, 3, 4, 5};
		
		// (방법4). 배열 선언 후 배열을 생성
		int[] arr4;
		arr4 = new int[] {1, 2, 3, 4, 5};
		
		// 길이가 7인 double 형 1차원 배열 생성하시오.
		double[] arr5 = new double[7];
		
		// 길이가 9인 float형 1차원 배열 생성하시오. - (방법4), 초기화 x
		float[] arr6;
		arr6 = new float[9];
		
		// 객체 대상 1차원 배열
		Box[] arr7 = new Box[5];
		
		String[] arr8 = new String[2];
		
		/*
		 * Arrays.toString() : Returns a string representation of the contents of the specified array.
		 */
		System.out.println(Arrays.toString(arr1));	// [0, 0, 0, 0, 0]
		System.out.println("배열 arr1 길이 : " + arr1.length);	// 배열 arr1 길이 : 5
		System.out.println(Arrays.toString(arr2));	// [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(arr3));	// [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(arr4));	// [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(arr5));	// [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
		System.out.println(Arrays.toString(arr6));	// [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
		System.out.println(Arrays.toString(arr7));	// [null, null, null, null, null]
		System.out.println(Arrays.toString(arr8));	// [null, null]
	}
}
