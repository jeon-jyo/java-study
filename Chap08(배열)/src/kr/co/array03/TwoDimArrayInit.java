package kr.co.array03;

public class TwoDimArrayInit {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][0];
		
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[4];
		arr[4] = new int[5];

		char star = '*';
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = star;
				System.out.print((char)(arr[i][j]) + "\t");
			}
			System.out.println();
		}
		
		/*
			*	
			*	*	
			*	*	*	
			*	*	*	*	
			*	*	*	*	*	
		 */
	}
}
