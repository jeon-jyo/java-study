package kr.co.review;

import java.util.Arrays;

public class ArrayTest03 {

	static int[] arr = new int[10];
	static int[] newArr;
	
	static {
		for(int i = 0; i < 8; i++) {
			arr[i] = (i+1);
//			arr[i] = (int)(Math.random() * 10);
		}
		System.out.println(Arrays.toString(arr));	// [1, 2, 3, 4, 5, 6, 7, 8, 0, 0]
	}
	
	public static void main(String[] args) {
		System.out.println(ArrayTest03.get(arr, 2));	// 3
		
		ArrayTest03.changeElement(arr, 0, 2024);
		System.out.println(Arrays.toString(arr));	// [2024, 2, 3, 4, 5, 6, 7, 8, 0, 0]
		
		int[] newArray = ArrayTest03.appendElement(arr, 2025);
		if (newArray.length == arr.length) {
			arr = newArray;
			System.out.println(Arrays.toString(arr));	// [2024, 2, 3, 4, 5, 6, 7, 8, 2025, 0]
		} else {
			newArr = newArray;
			System.out.println(Arrays.toString(newArr));	// [2024, 2, 3, 4, 5, 6, 7, 8, 0, 0, 2025]
		}

		ArrayTest03.insertElement(arr, 5, 2026);
		System.out.println(Arrays.toString(arr));	// [2024, 2, 3, 4, 5, 2026, 6, 7, 8, 2025]
		
		ArrayTest03.removeElement(arr, 5);
		System.out.println(Arrays.toString(arr));	// [2024, 2, 3, 4, 5, 6, 7, 8, 2025, 0]
	}
	
	public static int get(int[] arr, int idx) {
		return arr[idx];
	}
	
	public static void changeElement(int[] arr, int idx, int val) {
		arr[idx] = val;
	}
	
	public static int[] appendElement(int[] arr, int val) {
		
		boolean contains = false;
		
		// 요소가 0일 때 바꾸기
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] == 0) {
				contains = true;
				arr[j] = val;
				break;
			}
		}
		
		if (contains) {
			contains = false;
			return arr;
		} else {
			// 요소가 꽉 차 있을 때 큰 배열에 옮겨담기
			newArr = new int[arr.length+1];
			for(int i = 0; i < newArr.length; i++) {
				if(i < arr.length) {
					newArr[i] = arr[i];
				} else {
					newArr[i] = val;
				}
			}
			return newArr;	
		}
	}

	public static boolean insertElement(int[] arr, int idx, int val) {
		if(idx > arr.length-1) {
			return false;
		}
		for(int i = (arr.length-1); i > idx; i--) {
			arr[i] = arr[i-1];
		}
		arr[idx] = val;
		return true;
	}
	
	public static boolean removeElement(int[] arr, int idx) {
		if(idx > arr.length-1) {
			return false;
		}
		for(int i = idx; i < (arr.length-1); i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
		return true;
	}
	
}
