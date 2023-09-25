package kr.co.stream06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	
	String name;			// String implements java.io.Serializable
	transient String job;	// 직렬화안됨 null값
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}

}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personLee = new Person("이순신", "대표이사");
		Person personShin = new Person("신사임당", "상무이사");
			
		// 직렬화
											// .txt 이지만 바이너리로 저장되기 때문에 읽을 수 없음
											// 그래서 .out 이렇게 의미없는 확장자를 쓰기도 함
		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
											// 매개변수 fos 대신 new FileOutputStream("serial.out") 해도 됨
			// throws IOException
			oos.writeObject(personLee);
			oos.writeObject(personShin);
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
		
		// 역직렬화
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			// throws IOException, ClassNotFoundException
			Person person1 = (Person)ois.readObject();
			Person person2 = (Person)ois.readObject();
			
			System.out.println(person1);
			System.out.println(person2);
			/*
			 * Person [name=이순신, job=null]
			 * Person [name=신사임당, job=null]
			 * 
			 * java.io.NotSerializableException
			 * -> class Person implements Serializable
			 */
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
