package kr.co.arraylist03;

import java.util.ArrayList;

public class Student {

	private int StudentId;
	private String StudentName;
	ArrayList<Book> bookList;
	
	public Student(int studentId, String studentName) {
		StudentId = studentId;
		StudentName = studentName;
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String name) {
		Book book = new Book(name);
		bookList.add(book);
	}
	
	public void showInfo() {
		System.out.print(StudentName + " 학생이 읽은 책은 : ");
		for(int i = 0; i < bookList.size(); i++) {
			System.out.print(bookList.get(i).getName());
			if(i < (bookList.size()-1)) {
				System.out.print(", ");
			}
		}
		System.out.println(" 입니다.");
	}
	
}
