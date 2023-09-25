package kr.co.thread05;

import java.util.ArrayList;

class HiMediaBooks {

	// 책꽂이, 책 선반
	public ArrayList<String> shelf = new ArrayList<String>();
	
	public HiMediaBooks() {
		// 리소스
		shelf.add("책1");
		shelf.add("책2");
		shelf.add("책3");
		shelf.add("책4");
		shelf.add("책5");
		shelf.add("책6");
	}
	
	public String lendBook() {
		String book = shelf.remove(0);
		System.out.println(Thread.currentThread().getName() + " : "
				+ book + " 빌렸습니다.");
		return book;
	}
	
	public void returnBook(String book) {
		shelf.add(book);
		System.out.println(Thread.currentThread().getName() + " : "
				+ book + " 반납했습니다.");
	}
	
}

class Person extends Thread {
	
	public Person(String name) {	// name은 스레드 이름이 됨
									// Thread.currentThread().getName()
		super(name);
	}
	
	// lendBook, returnBook 을 호출하는 스레드
	@Override
	public void run() {
		String title = SyncWaitNotifyTest.hiBooks.lendBook();
		
		if (title == null) {
			return;
		}
		try {
			Thread.sleep(5000);		// 이 시간동안 책을 읽음
			SyncWaitNotifyTest.hiBooks.returnBook(title);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class SyncWaitNotifyTest {

	public static HiMediaBooks hiBooks = new HiMediaBooks();
	
	public static void main(String[] args) {
		
		Person person1 = new Person("person1");
		Person person2 = new Person("person2");
		Person person3 = new Person("person3");
		Person person4 = new Person("person4");
		Person person5 = new Person("person5");
		Person person6 = new Person("person6");
		person1.start();
		person2.start();
		person3.start();
		person4.start();
		person5.start();
		person6.start();
		/*
			person1 : 책1 빌렸습니다.
			person2 : 책2 빌렸습니다.
			person3 : 책3 빌렸습니다.
			person4 : 책4 빌렸습니다.
			person6 : 책6 빌렸습니다.
			person5 : 책5 빌렸습니다.
			person3 : 책3 반납했습니다.
			person6 : 책6 반납했습니다.
			person4 : 책4 반납했습니다.
			person5 : 책5 반납했습니다.
			person1 : 책1 반납했습니다.
			person2 : 책2 반납했습니다.
		 */
	}
}
