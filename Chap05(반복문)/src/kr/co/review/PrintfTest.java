package kr.co.review;

public class PrintfTest {
	
	public static void main(String[] args) {
		
		String name = "Admiral Yi";
		int age = 20;
		double height = 185.5;
		
		// %.1f -> 소수점 이하 한자리 출력
		System.out.printf("%s 의 나이는 %d 이고, 키는 %f 입니다. \n", name, age, height);	// 185.500000
		System.out.printf("%s 의 나이는 %d 이고, 키는 %.1f 입니다. \n", name, age, height);	// 185.5
		
		// Admiral Yi 의 나이는 20 이고, 키는 185.5 입니다. 
	}

}
