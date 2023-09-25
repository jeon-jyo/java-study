package kr.co.exception03;

public class PasswordTest {

	private String password;
	
	public String getPassword() {
		return password;
	}
	
	// 비밀번호에 대한 제약조건 구현
	public void setPasswd(String passwd) throws PasswordException {
										// PasswordException 예외를 setPasswd() 메서드가 호출될때 처리하도록 미룸
		if (passwd == null) {
			throw new PasswordException("비밀 번호는 null 일 수 없습니다.");
		} else if (passwd.length() < 5) {
			throw new PasswordException("비밀 번호는 5자 이상이어야 합니다.");
		} else if (passwd.matches("[a-zA-Z]+")) { 	// 정규식
			throw new PasswordException("비밀 번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		this.password = passwd;						// 위 조건식을 다 만족하면 password 값 할당
		
	}
	
	public static void main(String[] args) {
		
		PasswordTest test = new PasswordTest();
		
		// 비밀번호가 null일 때
		String password = null;
		try {							// setPasswd() 메서드에 throws 가 있으니 호출하는 곳에서 예외처리를 해줘야 함
			test.setPasswd(password);
			System.out.println("오류 없음");
			
		} catch (PasswordException e) {
			System.out.println(e.getMessage());		// 비밀 번호는 null 일 수 없습니다.
		}
		System.out.println(test.getPassword());		// null
		System.out.println();
		
		// 비밀번호가 5자리 미만일 때
		password = "hime";
		try {
			test.setPasswd(password);
			System.out.println("오류 없음");
			
		} catch (PasswordException e) {
			System.out.println(e.getMessage());		// 비밀 번호는 5자 이상이어야 합니다.
		}
		System.out.println(test.getPassword());		// null
		System.out.println();
		
		// 비밀번호가 5자리 이상이지만 문자열일 때
		password = "abcde";
		try {
			test.setPasswd(password);
			System.out.println("오류 없음");
			
		} catch (PasswordException e) {
			System.out.println(e.getMessage());		// 비밀 번호는 숫자나 특수문자를 포함해야 합니다.
		}
		System.out.println(test.getPassword());		// null
		System.out.println();
		
		// 비밀번호가 조건에 부합할 때
		password = "abc123";
		try {
			test.setPasswd(password);
			System.out.println("오류 없음");		// 오류 없음
			
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(test.getPassword());		// abc123
		System.out.println();
		
		System.out.println("end");					// end
		
	}
	
}
