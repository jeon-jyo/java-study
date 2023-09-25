package kr.co.exception02;

public class AutoCloseableTest implements AutoCloseable {

	// Exception 의 close() 오버라이딩
	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다.");
	}

}
