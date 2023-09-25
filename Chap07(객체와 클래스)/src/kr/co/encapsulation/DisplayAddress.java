package kr.co.encapsulation;

public class DisplayAddress {
	
	// 캡슐화 (encapsulation)
	
	/* StringBuffer
	 * - A thread-safe, mutable sequence of characters.
	 */
	// 참조형
	StringBuffer buffer = new StringBuffer();
	
	private String line = "================================================================================\n";
	private String title = " 이름\t		주소\t\t	전화번호\t\t	\n";
	
	// 이 public 메서드만 호출해서 메모리에 올라온 값을 읽음
	public String getAddress() {
		makeHeader();
		makeBody();
		makeFooter();
		return buffer.toString();	// buffer.append 를 toString() 해서 출력가능
	}

	private void makeFooter() {
		buffer.append(line);
	}
	private void makeBody() {
		buffer.append("이순신\t\t\t");
		buffer.append("서울 강동구\t\t");
		buffer.append("010-1234-5678\n");
		
		buffer.append("신사임당\t\t");
		buffer.append("서울 강남구\t\t");
		buffer.append("010-1111-2222\n");
	}
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
}
