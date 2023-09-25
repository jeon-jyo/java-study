package kr.co.lambda09;

public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Himedia";
		
		// OOP 방식으로 구현
		StringConcatImpl concatImpl = new StringConcatImpl();
		concatImpl.makeString(s1, s2);				// Hello, Himedia
		
		// 익명 내부 클래스로 구현
		StringConcat concatImpl2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		concatImpl2.makeString("Hello", "Java");	// Hello, Java
		
		// 람다식으로 구현
		/*
		 * The target type of this expression must be a functional interface
		 *  -> StringConcatImpl X
		 *  
		 * Lambda expression's parameter cannot redeclare another local variable defined in an enclosing scope.
		 *  -> s1, s2 X
		 */
		StringConcat conCatImpl3 = (s3, s4) -> System.out.println(s3 + ", " + s4);
		conCatImpl3.makeString("Hello", "Jiho");	// Hello, Jiho
	}
}
