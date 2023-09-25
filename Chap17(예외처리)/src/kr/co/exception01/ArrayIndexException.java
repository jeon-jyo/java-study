package kr.co.exception01;

public class ArrayIndexException {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			for(int i = 0; i <= 5; i++) {
				System.out.print(arr[i] + " ");	// 1 2 3 4 5 
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println(e);				// java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
			System.out.println(e.toString());	// java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
			System.out.println(e.getMessage());	// Index 5 out of bounds for length 5
			System.out.println(e.getClass());	// class java.lang.ArrayIndexOutOfBoundsException
		}
		System.out.println("end");				// end

	}
}
