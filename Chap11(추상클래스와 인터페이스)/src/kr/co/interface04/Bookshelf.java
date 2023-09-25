package kr.co.interface04;

import java.util.ArrayList;

// 책꽂이
public class Bookshelf {

	// 입력한 책을 보관
	protected ArrayList<String> bookshelf;	/* has a 관계 */
	
	public Bookshelf() {
		System.out.println("Bookshelf() 책장 추가");
		bookshelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getBookshelf() {
		System.out.print("getBookshelf() 책장의 책들 : ");
		return bookshelf;
	}
	
	public int getCount() {
		System.out.print("getCount() 책장의 책 수 : ");
		return bookshelf.size();
	}
	
}
