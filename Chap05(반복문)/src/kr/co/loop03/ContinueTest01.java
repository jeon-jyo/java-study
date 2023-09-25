package kr.co.loop03;

public class ContinueTest01 {

	public static void main(String[] args) {
		
		// 1 ~ 100 까지 숫자 중 3의 배수를 출력하시오.
		
		int num;
		for(num = 1; num <= 100; num++) {
			if((num % 3) != 0) continue;
			System.out.println(num);
		}
		
	}
	
}
