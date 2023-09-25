package kr.co.singleton;
/*
 * * 웹 : 클라이언트의 요청에 서버가 응답하는 구조임
 * 	- 요청이 있을 때마다 DB와 새로 연결했다가 해제한다면
 * 		=> 시스템 성능 큰 영향 끼침 (인증)
 * 
 *  - 커넥션 풀 : Connection 객체를 미리 생성해 풀(Pool)에 넣어놓음
 *  			  요청이 있을 때 이미 생성된 Connection 객체를 가져다 사용하는 기법
 */
public class ConnectionPool {

	private static ConnectionPool instance = new ConnectionPool();
	private ConnectionPool() {}
	public static ConnectionPool getInstance() {
		if(instance == null)
			instance = new ConnectionPool();
		return instance;
	}
}
