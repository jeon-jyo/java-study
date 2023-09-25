package kr.co.review;

public class OracleDriver implements Connection {

	@Override
	public void getConnection(String url, String username, String password) {
		System.out.println("url, username, password 정보를 이용하여 Oracle DB 를 접속 시도 한다.");
	}

}
