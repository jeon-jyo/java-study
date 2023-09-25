package kr.co.constructor02;

public class UserInfo {

	String userId;
	String userPassWord;
	String userName;
	String userAdress;
	String userPhoneNumber;
	
	public UserInfo() {}
	
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return "고객님의 아이디는 " + userId + " 이고, 등록된 이름은 " + userName + " 입니다.";
	}
}
