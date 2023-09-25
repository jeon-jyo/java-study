package kr.co.loop01;

public class ForTest02 {

	public static void main(String[] args) {
		
		/*
		 * 누적합계가 2000 이상일 때 i 값과 그 때의 누적값을 출력하시오.
		 */
		
		int sum = 0;
		int x = 0;

		for(int i = 1; i <= 100; i++) {
			sum += i;
			if (sum >= 2000) {
				x = i;
				break;
			}
		}
		
		System.out.println("2000 이상일 때 i의 값 : " + x);			// 2000 이상일 때 i의 값 : 63
		System.out.println("2000 이상일 때 i의 누적값 : " + sum);	// 2000 이상일 때 i의 누적값 : 2016

	}
}
