package kr.co.conversion;

public class TypeChangeTest01 {
	
	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum;
		
		int iNum1 = 20;
		float fNum = iNum1;
		
		int iNum2 = 10;
		byte bNum1 = (byte)iNum2;
		
		double dNum = 3.14;
		int iNum3 = (int)dNum;
		
	}

}
