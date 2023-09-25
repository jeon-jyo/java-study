package kr.co.interface04;

public class MyBookshelf extends Bookshelf implements Queue {

	@Override
	public void enQueue(String title) {
		System.out.println("enQueue(String title) 책 추가");
		bookshelf.add(title);
	}

	@Override
	public String deQueue() {
		System.out.print("deQueue() 책 빼기 : ");
		return bookshelf.remove(0);
	}

	@Override
	public int getSize() {
		System.out.println("***** getSize() 책장 확인 *****");
		System.out.println(getBookshelf());
		return getCount();
	}

}
