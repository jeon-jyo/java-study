package kr.co.exception03;
/* 
 * 사용자 정의 예외
 *  - 사용자 정의 예외 클래스를 직접 만들고 이를 발생시켜 예외 처리
 */
public class PasswordException extends Exception {

	public PasswordException(String message) {
							// 생성자의 매개변수로 예외 사항 메시지를 받음
		super(message);		// Exception 생성자에 message 전달
	}
	
}
