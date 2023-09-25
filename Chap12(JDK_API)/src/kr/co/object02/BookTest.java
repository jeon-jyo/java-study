package kr.co.object02;

import java.util.Objects;

class Book {

	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}

	// 두 객체간의 동등성을 확인할 수 있음
	// 메소드를 실행해서 리턴된 해시코드 값이 다르면 다른 객체로 판단
	@Override
	public int hashCode() {
		return Objects.hash(author, title);
	}

}

public class BookTest {
	
	public static void main(String[] args) {
		
		Book book = new Book("책1", "작가1");
		
		System.out.println(book);
		System.out.println(book.toString());
		/*
			- toString(), hashCode() 없을 때
			
			kr.co.object02.Book@53bd815b
			kr.co.object02.Book@53bd815b
			
			- toString() 있을 때
			
			Book [title=책1, author=작가1]
			Book [title=책1, author=작가1]
			
			- hashCode() 있을 때
			
			kr.co.object02.Book@5d56350b
			kr.co.object02.Book@5d56350b
			
			- toString(), hashCode() 있을 때
			
			Book [title=책1, author=작가1]
			Book [title=책1, author=작가1]
		 */
	}
}