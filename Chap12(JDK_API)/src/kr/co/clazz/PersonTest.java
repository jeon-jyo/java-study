package kr.co.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javax.xml.transform.Source;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		/*
		 * c1 은 Person 클래스 정보를 가지고 있지만 Class 타입이다.
		 * c1.newInstance() 는 Object 타입이다.
		 */
		
		// throws ClassNotFoundException
		Class c1 = Class.forName("kr.co.clazz.Person");
		System.out.println(c1);		// class kr.co.clazz.Person
		// throws InstantiationException, IllegalAccessException
		Person person = (Person)c1.newInstance();
		System.out.println(person);	// null
		
		person.setName("이순신");
		System.out.println(person);	// 이순신
		System.out.println();
		
		// person 객체에서 Person 클래스 가져오기
		Class c2 = person.getClass();
		System.out.println(c2);			// class kr.co.clazz.Person
		Person person2 = (Person)c2.newInstance();
		System.out.println(person2);	// null
		System.out.println();
		
		/*
		 * 클래스 parameterType 에는 String 클래스 정보를 담는다.
		 * 생성자 con 에는 Person 클래스 정보를 가지고 있는 c2의 생성자를 담는다.
		 *  -> Person 클래스에서 String 매개변수가 있는 생성자를 가져온다.
		 */
		
		// 생성자 호출
		Class[] parameterType = {String.class};
		// throws NoSuchMethodException
		Constructor con = c2.getConstructor(parameterType);
		System.out.println(con);	// public kr.co.clazz.Person(java.lang.String)
		System.out.println();
		
		// Person 클래스의 모든 생성자 가져오기
		Constructor[] cons = c2.getConstructors();
		for(Constructor a : cons) {
			System.out.println(a);
		}
		System.out.println();
		/*
			public kr.co.clazz.Person(java.lang.String,int)
			public kr.co.clazz.Person(java.lang.String)
			public kr.co.clazz.Person()
		 */
		
		/*
		 * Person personShin = new Person(); 이외의 객체 생성 방법
		 * Person 클래스의 String 매개변수가 있는 생성자인 con 으로 새로운 객체를 만든다.
		 *  -> "심사임당" 이라는 매개변수를 보내준다
		 */
		
		// 생성자 초기화
		Object[] initAges = {"신사임당"};
		// throws IllegalArgumentException
		Person personShin = (Person) con.newInstance(initAges);
		System.out.println(personShin);		// 신사임당
		
		Person personShin2 = new Person("신사임당");
		System.out.println(personShin2);	// 신사임당
		
	}
}
