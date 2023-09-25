package kr.co.generic01;

public class ObjectArrTest {

	public static void main(String[] args) {
		
		ObjectArr<String> strArr = new ObjectArr<String>(5);

		System.out.println("strArr.size() : " + strArr.size());
		
		for(int i = 0; i < strArr.size(); i++) {
			System.out.print(strArr.get(i) + " ");
		}
		System.out.println();
		/*
		 * - 생성자에서 this.size = size; 추가
		 * strArr.size() : 5
		 * null null null null null 
		 * 
		 *  - 생성자에서 this.size = size; 주석
		 * strArr.size() : 0
		 *  
		 */
		
		strArr.set(0, "가");
		strArr.set(1, "나");
		strArr.set(2, "다");
		strArr.set(3, "라");
//		strArr.set(4, "마");
//		strArr.set(5, "바");	// Index 5 out of bounds for length 5
		
		System.out.println("strArr.size() : " + strArr.size());
		
		for(int i = 0; i < strArr.size(); i++) {
			System.out.print(strArr.get(i) + " ");
		}
		/*
		 * strArr.size() : 4
		 * 가 나 다 라 
		 */
	}
}
