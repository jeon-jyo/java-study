package kr.co.member01;

/*
 * 1. 클래스는 대문자로 시작함
 * 2. java 파일 하나에 여러 개의 class가 있을 수 있음
 * 	  - public class 는 하나임
 * 	  - public class 와 .java 파일의 이름은 동일함
 */
class A {}
class B {}

public class Student {

//	public Student() {};
	
	// public 모든 곳에 공개
	// private 공개 x - 이 클래스 내에서만 쓸 수 있음
	
	public int studentId;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
}
