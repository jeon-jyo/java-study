package kr.co.array03;

public class TwoDimensionTest {

	public static void main(String[] args) {
		
		// 각각의 1차원 배열이 2차원 배열에 있다
		int[][] arr = {
				{1, 2, 3}, {4, 5, 6, 7}
		};
		
		int i, j;
		for(i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "][] 의 길이 (" + i + " 행의 열 개수) : " + arr[i].length);
			System.out.println("--------------------");
			for(j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
			System.out.println();
		}

		/*
			arr[0][] 의 길이 (0 행의 열 개수) : 3
			--------------------
			arr[0][0] = 1
			arr[0][1] = 2
			arr[0][2] = 3
			
			arr[1][] 의 길이 (1 행의 열 개수) : 4
			--------------------
			arr[1][0] = 4
			arr[1][1] = 5
			arr[1][2] = 6
			arr[1][3] = 7
		 */
	}
}
