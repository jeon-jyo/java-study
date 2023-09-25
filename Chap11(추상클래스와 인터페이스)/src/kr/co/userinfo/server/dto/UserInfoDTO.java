package kr.co.userinfo.server.dto;
/*
 * 사용자 정보 클래스
 */
public class UserInfoDTO {
	
	private String userID;
	private String password;
	private String userName;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
