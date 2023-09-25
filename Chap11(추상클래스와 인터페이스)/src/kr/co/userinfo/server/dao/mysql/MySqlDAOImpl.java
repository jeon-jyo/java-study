package kr.co.userinfo.server.dao.mysql;

import kr.co.userinfo.server.dao.UserInfoDAO;
import kr.co.userinfo.server.dto.UserInfoDTO;
/*
 * UserInfoDAO 인터페이스를 구현한 MySql 버전 DAO
 */
public class MySqlDAOImpl implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into MySql DB userId = " + userInfoDTO.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into MySql DB userId = " + userInfoDTO.getUserID());
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into MySql DB userId = " + userInfoDTO.getUserID());
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into MySql DB userId = " + userInfoDTO.getUserID());
	}
	
}
