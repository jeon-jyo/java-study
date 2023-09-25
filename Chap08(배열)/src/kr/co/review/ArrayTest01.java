package kr.co.review;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		// 원하는 값으로 배열을 생성
		int[] arr = {2023, 7, 17, 2023, 11, 28, 22, -21, 5, 6};
		
		long sum = 0;
		int len = arr.length;
		
		for(int i = 0; i < len; i++) {
			sum+= arr[i];	// 배열의 탐색, 원소의 접근
		}
		System.out.println(sum);	// 4121
	}
}
