package kr.co.review;

public interface Connection {

	// 데이터베이스 연결
	void getConnection(String url, String username, String password);
	
}
