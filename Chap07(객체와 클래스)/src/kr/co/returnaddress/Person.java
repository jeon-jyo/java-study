package kr.co.returnaddress;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		this("이순신", 20);
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person getPerson() {
		return this;	// 자신의 주소를 반한
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.getName());	// 이순신
		
		Person person2 = person.getPerson();	// 같은 주소 공유
		System.out.println(person);	 // kr.co.returnaddress.Person@39ed3c8d
		System.out.println(person2); // kr.co.returnaddress.Person@39ed3c8d
	}
}
