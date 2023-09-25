package kr.co.userinfo.server.dao.postgresql;

import kr.co.userinfo.server.dao.UserInfoDAO;
import kr.co.userinfo.server.dto.UserInfoDTO;
/*
 * UserInfoDAO 인터페이스를 구현한 PostgreSql 버전 DAO
 */
public class PostgreSqlDAOImpl implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into PostgreSQL DB userId = " + userInfoDTO.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into PostgreSQL DB userId = " + userInfoDTO.getUserID());
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into PostgreSQL DB userId = " + userInfoDTO.getUserID());
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into PostgreSQL DB userId = " + userInfoDTO.getUserID());
	}
	
}
