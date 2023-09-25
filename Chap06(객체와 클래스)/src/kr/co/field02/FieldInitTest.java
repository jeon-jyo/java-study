package kr.co.field02;

public class FieldInitTest {

	public static void main(String[] args) {
		
		/*
		 * stack - 로컬 변수들이 올라감 / 메모리에 대한 처리를 따로 하지 않아도 사용하고 난 뒤에 메모리에서 사라짐
		 * heap - 객체
		 * 메서드 내 변수는 초기화 해야함
		 * 클래스 내 (멤버)변수는 따로 초기화 과정을 거치지 않아도 자동적으로 초기화를 해줌
		 */
		
		// FieldInit : 사용자 정의형 타입(클래스)
		FieldInit fieldInit = new FieldInit();
		
		/*
		 * new 연산자
		 * 	- 클래스에 있는 멤버들의 바이트 크기만큼
		 * 	  heap 에다가 메모리 할당을 하여
		 * 	  동시에 초기화를 시켜주는 역할을 함
		 */
	
		System.out.println(fieldInit.toString());
		// FieldInit [byteField=0, shortField=0, intField=0, longField=0, booleanField=false,
		//  charField=, floatField=0.0, doubleField=0.0, arrField=null, strField=null]

	}

}
