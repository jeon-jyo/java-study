package kr.co.userinfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import kr.co.userinfo.server.dao.UserInfoDAO;
import kr.co.userinfo.server.dao.mysql.MySqlDAOImpl;
import kr.co.userinfo.server.dao.oracle.OracleDAOImpl;
import kr.co.userinfo.server.dao.postgresql.PostgreSqlDAOImpl;
import kr.co.userinfo.server.dto.UserInfoDTO;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 자바 I.O 단에서 모든 파일을 바이트단위로 읽어들임
		 */

		InputStream fis = new FileInputStream("db.properties");
	
		Properties prop = new Properties();
		/*
			load(InputStream inStream)
			Reads a property list (key and element pairs) from the input byte stream.
		 */
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfoDTO userDTO = new UserInfoDTO();
		userDTO.setUserID("himedia");
		userDTO.setPassword("1128");
		userDTO.setUserName("하이미디어");
		
		UserInfoDAO userDAO = null;
		if(dbType.equals("PostgreSQL")) {
			userDAO = new PostgreSqlDAOImpl();
		} else if(dbType.equals("Oracle")) {
			userDAO = new OracleDAOImpl();
		} else if(dbType.equals("MySql")) {
			userDAO = new MySqlDAOImpl();
		} else {
			System.out.println("db support error");
		}
		
		userDAO.insertUserInfo(userDTO);
		userDAO.updateUserInfo(userDTO);
		userDAO.deleteUserInfo(userDTO);
		userDAO.selectUserInfo(userDTO);
		/*
			insert into PostgreSQL DB userId = himedia
			update into PostgreSQL DB userId = himedia
			delete into PostgreSQL DB userId = himedia
			select into PostgreSQL DB userId = himedia
		 */
	}
}
