package kr.co.array03;

public class TwoDimArrayTest {

	public static void main(String[] args) {
		
		// 2행 4열의 정수형 배열을 생성하시오.
		int[][] arr = new int[2][4];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[0][3] = 40;

		arr[1][0] = 50;
		arr[1][1] = 60;
		arr[1][2] = 70;
		arr[1][3] = 80;
		
		System.out.println(arr[0][0] + "\t" + arr[0][1] + "\t" + arr[0][2] + "\t"
				+ arr[0][3] + "\t" + arr[1][0] + "\t" + arr[1][1] + "\t"
				+ arr[1][2] + "\t" + arr[1][3]);
		/*
			10	20	30	40	50	60	70	80
		 */
	}
}
