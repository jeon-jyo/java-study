package kr.co.array02;

import java.util.Arrays;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] book = new Book[5];
		
		System.out.println(book);
		System.out.println(Arrays.toString(book));
		System.out.println();
		/*
		 * [Lkr.co.array02.Book;@39ed3c8d	-> 값이 저장된 주소가 출력
		 * [null, null, null, null, null]
		 */
		
		book[0] = new Book("혼자 공부하는 파이썬", "윤인성");
		book[1] = new Book("혼자 공부하는 파이썬2", "윤인성2");
		book[2] = new Book("혼자 공부하는 파이썬3", "윤인성3");
		book[3] = new Book("혼자 공부하는 파이썬4", "윤인성4");
		book[4] = new Book("혼자 공부하는 파이썬5", "윤인성5");
		
		System.out.println(book);
		System.out.println(Arrays.toString(book));
		System.out.println();
		/*
		 * [Lkr.co.array02.Book;@39ed3c8d
		 * 
		 * [kr.co.array02.Book@123772c4, kr.co.array02.Book@2d363fb3, kr.co.array02.Book@7d6f77cc,
		 * kr.co.array02.Book@5aaa6d82, kr.co.array02.Book@73a28541]
		 * 
		 * [Book [title=혼자 공부하는 파이썬, author=윤인성], Book [title=혼자 공부하는 파이썬2, author=윤인성2],
		 * Book [title=혼자 공부하는 파이썬3, author=윤인성3], Book [title=혼자 공부하는 파이썬4, author=윤인성4],
		 * Book [title=혼자 공부하는 파이썬5, author=윤인성5]]
		 */
		
		for(int i = 0; i < book.length; i++) {
			book[i].showInfo();
		}
		
		System.out.println();
		
		// int i -> Type mismatch: cannot convert from element type Book to int
		for(Book i : book) {
			i.showInfo();
		}
		
		/*
			혼자 공부하는 파이썬, 윤인성
			혼자 공부하는 파이썬2, 윤인성2
			혼자 공부하는 파이썬3, 윤인성3
			혼자 공부하는 파이썬4, 윤인성4
			혼자 공부하는 파이썬5, 윤인성5
			
			혼자 공부하는 파이썬, 윤인성
			혼자 공부하는 파이썬2, 윤인성2
			혼자 공부하는 파이썬3, 윤인성3
			혼자 공부하는 파이썬4, 윤인성4
			혼자 공부하는 파이썬5, 윤인성5
		 */
	}
}
