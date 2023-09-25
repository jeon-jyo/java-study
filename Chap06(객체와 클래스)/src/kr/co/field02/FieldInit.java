package kr.co.field02;

import java.util.Arrays;

public class FieldInit {
	
	// 클래스 변수

	// 기본형 변수
	byte byteField;		// 1 byte
	short shortField;	// 2 byte
	int intField;		// 4 byte
	long longField;		// 8 byte
	
	boolean booleanField;	// 1 byte
	char charField;			// 2 byte
	
	float floatField;		// 4 byte
	double doubleField;		// 8 byte
	
	// 참조형 변수	- 값을 가지지 않고 주소 번지를 가지고 있음
	int[] arrField;		// 4 byte
	String strField;	// 4 byte	- 클래스 타입

	/*
	 * - 초기화를 안 했을 때,
	 *   컴파일러가 기본값으로 초기화 해줌
	 * 
	 * - 객체를 만들어야 메모리에 값이 올라가고 호출 할 수 있음
	 */
	
	/*
	 * 클래스 멤버변수(필드)의 값들을 수시로 확인하고자 할 때나,
	 * 원하는 포맷으로 멤버변수들을 출력하고자 할 때 주로 사용
	 * 
	 * Source > Generate toString()...
	 */
	@Override
	public String toString() {		// Returns a string representation of the object. 
		return "FieldInit [byteField=" + byteField + ", shortField=" + shortField + ", intField=" + intField
				+ ", longField=" + longField + ", booleanField=" + booleanField + ", charField=" + charField
				+ ", floatField=" + floatField + ", doubleField=" + doubleField + ", arrField="
				+ Arrays.toString(arrField) + ", strField=" + strField + "]";
	}
	
}
