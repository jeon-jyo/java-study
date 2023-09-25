package kr.co.builder01;

enum Humen { MAN, WOMAN }
enum Machine { TANK, AIRPLANE }

public class EnumTest {

	public static void main(String[] args) {
		
		creatUnit(Machine.AIRPLANE);	// 비행기를 만듭니다.
		
	}

	private static void creatUnit(Machine machine) {
		
		switch (machine) {
		case TANK:
			System.out.println("탱크를 만듭니다.");
			break;
		case AIRPLANE:
			System.out.println("비행기를 만듭니다.");
			break;
		}
		
	}
}
