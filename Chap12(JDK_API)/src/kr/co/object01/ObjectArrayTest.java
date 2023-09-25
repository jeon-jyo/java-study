package kr.co.object01;

public class ObjectArrayTest {

	public static void main(String[] args) {
		
		// 다형성 배열로 Object[] 배열 사용하기
		Object[] obj = new Object[2];
		
		// A, B 클래스를 배열에 저장
		obj[0] = new A();	// upcasting
		obj[1] = new B();
		
		himedia(obj);
	}
	
	public static void himedia(Object[] obj) {
		for(int i = 0; i < obj.length; i++) {
			if(obj[i] instanceof A) {
				((A)obj[i]).display();
			} else {
				((B)obj[i]).display();
			}
		}
	}
	
}
