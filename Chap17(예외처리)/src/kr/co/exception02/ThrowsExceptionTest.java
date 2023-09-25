package kr.co.exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionTest {

	public Class loadClass(String fileName, String className)
			throws FileNotFoundException, ClassNotFoundException {
			// loadClass 를 호출하게 될 때 파일이 없거나 클래스 이름이 없으면 Exception 처리
			// FileInputStream, Class.forName 에게 필요한 예외처리를 throws 에게 전담
		
		FileInputStream fis = new FileInputStream(fileName);
		Class clazz = Class.forName(className);
		
		return clazz;
	}
	
	public static void main(String[] args) {
		
		ThrowsExceptionTest test = new ThrowsExceptionTest();

		try {
			test.loadClass("himedia.txt", "java.lang.String");
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("FileNotFoundException : " + e.getMessage());
		} catch (ClassNotFoundException e) {
//]			e.printStackTrace();
			System.out.println("ClassNotFoundException : " + e.getMessage());
		} catch (Exception e) {		// 그 외의 예외 처리
			System.out.println("Exception : " + e.getMessage());
		}
		System.out.println("end");	// end
		
	}
}
