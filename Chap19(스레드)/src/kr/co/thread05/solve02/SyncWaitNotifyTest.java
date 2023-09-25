package kr.co.thread05.solve02;

import java.util.ArrayList;

class HiMediaBooks {

	public ArrayList<String> shelf = new ArrayList<String>();
	
	public HiMediaBooks() {
		shelf.add("책1");
		shelf.add("책2");
		shelf.add("책3");
	}
	
	// 세 명만 빌릴 수 있는 상황
	public synchronized String lendBook() throws InterruptedException {
		
		// while 문으로 변경
		while (shelf.size() == 0) {
			System.out.println(Thread.currentThread().getName() + " waiting start ");
			// 더 빌릴 게 없는 상황에서 리소스를 기다리기 위해 wait 호출 -> Not Runnable 상태
			// throws InterruptedException
			wait();
			System.out.println(Thread.currentThread().getName() + " waiting end ");
		}
		
		if(shelf.size() > 0) {
			String book = shelf.remove(0);
			System.out.println(Thread.currentThread().getName() + " : "
					+ book + " 빌렸습니다.");
			return book;
		} else {
			return null;
		}
	}
	
	public synchronized void returnBook(String book) {
		shelf.add(book);
		// notifyAll() -> 유효한 리소스만큼의 Thread만 수행, 자원을 갖지 못한 Thread는 다시 wait() 상태로 만듦
		// 동기화 처리이긴한데 리소스 하나로 경쟁하는것이 아님
		notifyAll();
		System.out.println(Thread.currentThread().getName() + " : "
				+ book + " 반납했습니다.");
	}
	
}

class Person extends Thread {
	
	public Person(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		String title;
		
		try {
												// throws InterruptedException
			title = SyncWaitNotifyTest.hiBooks.lendBook();
			if (title == null) {
				System.out.println(getName()	// Thread 상속 받은 상태 - Thread의 getName()
						+ " 빌리지 못했습니다.");
				return;
			}
			Thread.sleep(5000);
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
			person5 : 책2 빌렸습니다.
			person6 : 책3 빌렸습니다.
			person4 waiting start 
			person3 waiting start 
			person2 waiting start 
			person1 : 책1 반납했습니다.
			person4 waiting end 
			person4 : 책1 빌렸습니다.
			person6 : 책3 반납했습니다.
			person5 : 책2 반납했습니다.
			person2 waiting end 
			person2 : 책3 빌렸습니다.
			person3 waiting end 
			person3 : 책2 빌렸습니다.
			person4 : 책1 반납했습니다.
			person3 : 책2 반납했습니다.
			person2 : 책3 반납했습니다.
		 */
	}
}
