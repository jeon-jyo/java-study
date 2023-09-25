package kr.co.memory;

public class MemoryHeap {
	
	public static void main(String[] args) {
		
		// 객체가 만들어지는 공간
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.price = 10000;
		book2.price = 20000;

		System.out.println(book1.price);
		System.out.println(book2.price);
		
//		System.out.println(book1);
//		System.out.println(book2);
		book1 = null;
		book2 = null;
	}

}
