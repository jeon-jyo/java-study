package kr.co.encapsulation;

public class AddressTest {

	public static void main(String[] args) {
		
		DisplayAddress displayAddress = new DisplayAddress();
		String sBuffer = displayAddress.getAddress();
		System.out.println(sBuffer);
		
/*
================================================================================
 이름			주소			전화번호			
================================================================================
이순신			서울 강동구		010-1234-5678
신사임당		서울 강남구		010-1111-2222
================================================================================
*/
	}
}
