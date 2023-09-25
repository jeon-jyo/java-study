package kr.co.accessmodifier01;

class Student1 {
	String name;
	int age;
}

class Student2 {
	public String name;
	private int age;
	
	public Student2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		// Validation 검사
		if(age < 0 || age > 150) {
			System.out.println("나이가 부적합합니다.");
			return;
		}
		this.age = age;
	}
}

public class privateUse {

	public static void main(String[] args) {
		
		Student1 student1 = new Student1();
		student1.name = "이순신";	// 멤버변수 직접접근
		student1.age = 20;
		System.out.printf("%s 의 나이는 %d 살 입니다. \n", student1.name, student1.age);
		System.out.println();
		
		Student2 student2 = new Student2("신사임당", 20);
		student2.name = "이방원";
//		student2.	// age 접근 불가
		student2.setAge(-10);
		System.out.printf("%s 의 나이는 %d 살 입니다. \n", student2.name, student2.getAge());
		
		/*
			이순신 의 나이는 20 살 입니다. 
			
			나이가 부적합합니다.
			이방원 의 나이는 20 살 입니다. 
		 */
	}
}
