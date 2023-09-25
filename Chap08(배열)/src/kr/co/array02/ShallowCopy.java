package kr.co.array02;
/*
 * 얕은 복사
 */
public class ShallowCopy {

	public static void main(String[] args) {
		
		Book[] book = new Book[5];
		Book[] copyBook = new Book[5];
		
		book[0] = new Book("혼자 공부하는 파이썬", "윤인성");
		book[1] = new Book("혼자 공부하는 파이썬2", "윤인성2");
		book[2] = new Book("혼자 공부하는 파이썬3", "윤인성3");
		book[3] = new Book("혼자 공부하는 파이썬4", "윤인성4");
		book[4] = new Book("혼자 공부하는 파이썬5", "윤인성5");
		
		/*
            void java.lang.System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
            src - 원본 배열
            srcPos - 원본 배열의 복사 시작 위치
            dest - 복사할 배열
            destPost - 복사할 배열의 복사 시작 위치
            length - 복사할 요소의 개수
		 */
		System.arraycopy(book, 0, copyBook, 0, 5);
		
		System.out.println("=====원본=====");
		
		for(Book i : book) {
			i.showInfo();
		}
		
		System.out.println("=====복사본=====");
		
		for(Book i : copyBook) {
			i.showInfo();
		}

		/*
			=====원본=====
			혼자 공부하는 파이썬, 윤인성
			혼자 공부하는 파이썬2, 윤인성2
			혼자 공부하는 파이썬3, 윤인성3
			혼자 공부하는 파이썬4, 윤인성4
			혼자 공부하는 파이썬5, 윤인성5
			=====복사본=====
			혼자 공부하는 파이썬, 윤인성
			혼자 공부하는 파이썬2, 윤인성2
			혼자 공부하는 파이썬3, 윤인성3
			혼자 공부하는 파이썬4, 윤인성4
			혼자 공부하는 파이썬5, 윤인성5
		 */
		
		System.out.println();
		
		book[0].setTitle("한글");
		book[1].setAuthor("세종대왕");
		
		System.out.println("=====원본=====");
		
		for(Book i : book) {
			i.showInfo();
		}
		
		System.out.println("=====복사본=====");
		
		for(Book i : copyBook) {
			i.showInfo();
		}
		
		/*
			=====원본=====
			한글, 윤인성
			혼자 공부하는 파이썬2, 세종대왕
			혼자 공부하는 파이썬3, 윤인성3
			혼자 공부하는 파이썬4, 윤인성4
			혼자 공부하는 파이썬5, 윤인성5
			=====복사본=====
			한글, 윤인성
			혼자 공부하는 파이썬2, 세종대왕
			혼자 공부하는 파이썬3, 윤인성3
			혼자 공부하는 파이썬4, 윤인성4
			혼자 공부하는 파이썬5, 윤인성5
		 */
	}
}
