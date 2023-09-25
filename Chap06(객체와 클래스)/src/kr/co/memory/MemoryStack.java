package kr.co.memory;

public class MemoryStack {

	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		int number1 = 10;
		int number2 = 20;
		int result = add(number1, number2);
		
		System.out.println("result : ========== " + result);
	}
	
	/*
	 * main 메서드에서 add 메서드 호출 시 add 메서드가 제어권을 가진다
	 * 스택에 올라간 값 사용이 끝나면 메모리 상에서 없어짐
	 * 변수 할당한것들도 없어지고 초기 상태로 돌아감
	 */
}
