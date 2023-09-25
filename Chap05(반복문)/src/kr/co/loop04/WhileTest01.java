package kr.co.loop04;

public class WhileTest01 {

	public static void main(String[] args) {
		
		// 1 ~ 100 까지의 합
		
		int sum = 0;
		int num = 1;	// while 문은 초기화하는 부분이 따로 없음
		
		while(num <= 100) {		// while 문 옆에는 조건식만 들어감
			sum+=num;
			num++;
		}
		System.out.println(sum);	// 5050
		
		/*
		 *  while 문은 무한루프용으로 많이 사용함
		 *  - if문, break 문과 함께 사용하여 무한루프를 벗어날 코드를 작성해 줘야함
		 *  
		 */
		int i = 1;
		while(true) {
			System.out.print(i + " ");	// 1 2 3 4 5 6 7 8 9 10 
			if(i >= 10) break;
			i++;
		}
		
	}
}
