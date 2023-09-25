package kr.co.loop03;

public class BreakTest {

	public static void main(String[] args) {
		
		// 1부터 숫자를 더해 100이 넘는 순간 그 숫자와 합을 출력하시오.
		
		int sum = 0;
		int num = 1;
		for( ; ; num++) {
			sum += num;
			if(sum >= 100) break;
		}
		System.out.println(num);	// 14
		System.out.println(sum);	// 105
		
	}
}
