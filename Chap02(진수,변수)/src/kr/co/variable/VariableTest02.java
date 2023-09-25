package kr.co.variable;

public class VariableTest02 {
	
	public static void main(String[] args) {
		
		byte b1 = 127;
		System.out.println(b1);

//		int num = 12345678900;	// The literal 12345678900 of type int is out of range
		int num = 1234567890;
		
//		long lnum = 12345678900;	// int 로 인식함 . The literal 12345678900 of type int is out of range
		long lnum = 12345678900L;
		
		System.out.println(num);
		System.out.println(lnum);
	}

}
