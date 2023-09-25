package kr.co.loop04;

public class WhileTest02 {

	public static void main(String[] args) {

		// 1 ~ 100 사이의 5와 7의 배수를 출력하고 해당 개수도 출력하시오. (5와 7의 공배수)
		// 35 70 2
		
		int num = 0;
		int count = 0;
		
		while((num++) <= 100) {
			if((num % 5) != 0 || (num % 7) != 0)
				continue;
			System.out.print(num + " ");	// 35 70
			count++;
		}
			
		System.out.println(count);	// 2
		
		
//		int num = 1;
//		int count = 0;
//		
//		while(num <= 100) {
//			num++;
//			if((num % 5) != 0 || (num % 7) != 0)
//				continue;
//			System.out.print(num + " ");
//			count++;
//			}
//			
//		System.out.println(count);
		
//		int num = 1;
//		int count = 0;
//		
//		while(num <= 100) {
//			if(num % 5 == 0) {
//				if(num % 7 == 0) {
//					System.out.print(num + " ");
//					count++;
//				}
//				
//			}
//			num++;
//		}
//		System.out.println(count);

	}

}
