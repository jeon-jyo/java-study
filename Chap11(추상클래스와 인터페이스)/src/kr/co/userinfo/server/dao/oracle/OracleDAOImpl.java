package kr.co.userinfo.server.dao.oracle;

import kr.co.userinfo.server.dao.UserInfoDAO;
import kr.co.userinfo.server.dto.UserInfoDTO;
/*
 * UserInfoDAO 인터페이스를 구현한 Oracle 버전 DAO
 */
public class OracleDAOImpl implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into Oracle DB userId = " + userInfoDTO.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into Oracle DB userId = " + userInfoDTO.getUserID());
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into Oracle DB userId = " + userInfoDTO.getUserID());
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into Oracle DB userId = " + userInfoDTO.getUserID());
	}
	
}
