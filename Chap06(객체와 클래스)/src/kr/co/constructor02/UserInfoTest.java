package kr.co.constructor02;

public class UserInfoTest {
	
	public static void main(String[] args) {
		
		/*
		 * 다른 생성자가 있을 때 기본 생성자가 자동으로 생성 되지 않음
		 * 
		 * UserInfo userInfo = new UserInfo();
		 *  - The constructor UserInfo() is undefined
		 *  - public UserInfo() {} 를 직접 만들어주면 쓸 수 있음
		 */
		UserInfo userInfo = new UserInfo();
		userInfo.userId = "user01";
		userInfo.userPassWord = "1128";
		userInfo.userName = "이순신";
		System.out.println(userInfo.showUserInfo());
		System.out.println(userInfo.userName);
		
		UserInfo userInfo2 = new UserInfo("user02", "0614", "신사임당");
		System.out.println(userInfo2.showUserInfo());
	}

}
