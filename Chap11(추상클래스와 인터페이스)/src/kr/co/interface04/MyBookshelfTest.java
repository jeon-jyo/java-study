package kr.co.interface04;

public class MyBookshelfTest {

	public static void main(String[] args) {
		
		Queue bQueue = new MyBookshelf();
		bQueue.enQueue("책1");
		bQueue.enQueue("책2");
		bQueue.enQueue("책3");
		bQueue.enQueue("책4");
		bQueue.enQueue("책5");
		System.out.println();
		System.out.println(bQueue.getSize());
		System.out.println();
		
		System.out.println(bQueue.deQueue());
		System.out.println();
		System.out.println(bQueue.getSize());
		/*
			Bookshelf() 책장 추가
			enQueue(String title) 책 추가
			enQueue(String title) 책 추가
			enQueue(String title) 책 추가
			enQueue(String title) 책 추가
			enQueue(String title) 책 추가
			
			***** getSize() 책장 확인 *****
			getBookshelf() 책장의 책들 : [책1, 책2, 책3, 책4, 책5]
			getCount() 책장의 책 수 : 5
			
			deQueue() 책 빼기 : 책1
			
			***** getSize() 책장 확인 *****
			getBookshelf() 책장의 책들 : [책2, 책3, 책4, 책5]
			getCount() 책장의 책 수 : 4
		 */
	}
}
