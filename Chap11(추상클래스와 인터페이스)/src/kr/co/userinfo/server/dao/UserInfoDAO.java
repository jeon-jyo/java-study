package kr.co.userinfo.server.dao;

import kr.co.userinfo.server.dto.UserInfoDTO;
/*
 * 사용자 정보로 구현할 기능 정리
 * DAO에서 제공되어야 할 메서드를 선언한 인터페이스
 */
public interface UserInfoDAO {
	
	void insertUserInfo(UserInfoDTO userInfoDTO);
	void updateUserInfo(UserInfoDTO userInfoDTO);
	void deleteUserInfo(UserInfoDTO userInfoDTO);
	void selectUserInfo(UserInfoDTO userInfoDTO);
	/* postgreSql, mySql 등등 다양하게 implement 할 수 있음 */
	
}
