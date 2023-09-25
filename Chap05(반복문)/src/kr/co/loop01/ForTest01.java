package kr.co.loop01;

public class ForTest01 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		// 1~10 까지의 합
		for(int i = 1; i <= 10; i++) {
			sum += i;
//			System.out.print(sum + " ");	// 1 3 6 10 15 21 28 36 45 55 
		}
		System.out.println(sum);	// 55
		
	}
}
