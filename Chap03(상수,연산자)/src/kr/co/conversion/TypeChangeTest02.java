package kr.co.conversion;

public class TypeChangeTest02 {
	
	public static void main(String[] args) {
		
		byte num1 = 1;
		byte num2 = 2;
//		byte num3 = num1 + num2;	// Type mismatch: cannot convert from int to byte
									// int 보다 작은 정수형은 int 타입으로 연산시 형변환됨
		byte result1 = (byte)(num1 + num2);	  // 강제 형변환
		
		int num3 = 1;
		int num4 = 2;
		int result2 = num3 + num4;
		
		long num5 = 1;
		long num6 = 2;
		long result3 = num3 + num4;	  // 자동 형변환
		result3 = num5 + num6;
		
		float num7 = 1.0f;
		float num8 = 2.0f;
		double num9 = 1.0;
		double num10 = 2.0;
		double result4 = num7 + num8;	  // 자동 형변환
		result4 = num9 + num10;
		
	}

}
