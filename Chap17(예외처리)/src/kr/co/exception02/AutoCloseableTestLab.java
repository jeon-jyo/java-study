package kr.co.exception02;

public class AutoCloseableTestLab {

	public static void main(String[] args) {
		
		AutoCloseableTest obj = new AutoCloseableTest();
		
		try(obj) {
			System.out.println("프로그램 실행");
									// try 블록에서 close() 발생
			throw new Exception();	// throw 강제로 예외 발생 -> catch 블록 실행
		} catch (Exception e) {
			System.out.println("예외 처리 부분입니다.");
			e.printStackTrace();
		}
		System.out.println("end");
		/*
			프로그램 실행
			리소스가 close() 되었습니다.
			예외 처리 부분입니다.
			java.lang.Exception
				at kr.co.exception02.AutoCloseableTestLab.main(AutoCloseableTestLab.java:12)
			end
		 */
	}
}
