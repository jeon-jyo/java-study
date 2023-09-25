package kr.co.variable03;

public class CharTest {
	
	public static void main(String[] args) {
		
		char ch = 'A';
		System.out.println("ch = " + ch);	// A -> 숫자로 encoding 된 후 다시 문자로 decoding
		
		int capitalA = 'A';
		System.out.println("capitalA = " + capitalA);	// 65
		
		int capitalB = 'B' + 1;
		System.out.println("capitalB + 1 = " + capitalB);	// 67
		System.out.println("capitalB + 1 = " + (char)capitalB);   // C
		
		System.out.println();
		
		
		// '가' 라는 한글 한 문자를 변수에 저장하고 출력하시오.
		char Gha = '가';
		System.out.println("Gha = " + Gha);   // 가
		
		int GhaD = '가';
		System.out.println("GhaD = " + GhaD);	// 44032 -> 컴파일러가 int 로 변경해줌
		
		int GhaU = '\uAC00';
		System.out.println("GhaU = " + GhaU);	// 44032 -> 컴파일러가 int 로 변경해줌
		
		System.out.println();
		
		// 대문자 'A'를 문자 'a'로 변환하여 출력하시오.
		char upperA = 'A';
		char lowera = (char)(upperA + 32);	// 컴파일러가 upperA 를 int 로 자동 형변환 해줌 / 대문자 소문자 32 차이
		System.out.println(lowera);   // a
		
		char loweru = 'u';
		int upperU = loweru - 32;
		System.out.println(upperU);   // 85
		System.out.println((char)upperU);   // U

		System.out.println();
		
		// '1' = 49, '2' = 50
		int data = '1' + '2';
		System.out.println("'1' + '2' = " + data);	// '1' + '2' = 99
		
		// '0' = 48
		char i = '1';
		char j = '2';
		int sum = (i-'0') + (j-'0');	//  (49-48) + (50-48)
		System.out.println("sum = " + sum);	  // sum = 3
		
	}

}
