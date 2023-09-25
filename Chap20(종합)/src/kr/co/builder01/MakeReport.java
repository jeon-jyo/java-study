package kr.co.builder01;

public interface MakeReport {

	// 메서드 조합으로 화면단을 만든다
	void makeHeader();
	void makeBody();
	void makeFooter();
	
	String getReport();
}
