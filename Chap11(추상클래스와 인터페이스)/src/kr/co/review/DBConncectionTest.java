package kr.co.review;

public class DBConncectionTest {

	public static void main(String[] args) {
		
		// 1. DB접속
		Connection conn;
		
		// 2. 연결 문자열 생성
		/* Oracle */
		conn = new OracleDriver();
		conn.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "himedia", "1128");
		// localhost 대신 ip주소가 들어갈수도 있음 @127.0.0.1:1521
		
		/* PostgreSql */
		conn = new PostgreSqlDriver();
		conn.getConnection("jdbc:postgresql://127.0.0.1:5432:himediadb", "himedia", "1128");
		
		/* MySql */
		conn = new MySqlDriver();
		conn.getConnection("jdbc:mysql://127.0.0.1:3306:himediadb", "himedia", "1128");
		
		/*
			url, username, password 정보를 이용하여 Oracle DB 를 접속 시도 한다.
			url, username, password 정보를 이용하여 PostgreSql DB 를 접속 시도 한다.
			url, username, password 정보를 이용하여 MySql DB 를 접속 시도 한다.
		 */
	}
}
