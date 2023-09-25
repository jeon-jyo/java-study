package kr.co.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RefectTest {

	public static void main(String[] args) throws ClassNotFoundException {
				
		/*
		 * .class 파일 안에 있는것들을 동적으로 로딩해서 안에 있는 것들을 확인
		 */

		/*
		 * Class.forName()
		 *  - 지정된 문자열 이름을 가진 클래스 또는 인터페이스와 연결된 클래스 객체를 반환
		 * 
		 * 컴파일 단계 x 런타임 때 실행
		 */
		// throws ClassNotFoundException
		Class clazz = Class.forName("java.lang.String");
		
		Constructor<String>[] cons = clazz.getConstructors();
		for(Constructor con : cons) {
			System.out.println(con);
		}
		System.out.println();
/*
public java.lang.String(java.lang.StringBuffer)
public java.lang.String(java.lang.StringBuilder)
public java.lang.String(byte[],int,int,java.nio.charset.Charset)
public java.lang.String(byte[],java.lang.String) throws java.io.UnsupportedEncodingException
public java.lang.String(byte[],java.nio.charset.Charset)
public java.lang.String(byte[],int,int)
public java.lang.String(byte[])
public java.lang.String(char[],int,int)
public java.lang.String(char[])
public java.lang.String(java.lang.String)
public java.lang.String()
public java.lang.String(byte[],int,int,java.lang.String) throws java.io.UnsupportedEncodingException
public java.lang.String(byte[],int)
public java.lang.String(byte[],int,int,int)
public java.lang.String(int[],int,int)
*/
		
		Method[] methods = clazz.getMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
/*
public boolean java.lang.String.equals(java.lang.Object)
public int java.lang.String.length()
public java.lang.String java.lang.String.toString()
public int java.lang.String.hashCode()
public void java.lang.String.getChars(int,int,char[],int)
public int java.lang.String.compareTo(java.lang.String)
public int java.lang.String.compareTo(java.lang.Object)
public int java.lang.String.indexOf(int)
public int java.lang.String.indexOf(java.lang.String)
public int java.lang.String.indexOf(java.lang.String,int)
public int java.lang.String.indexOf(int,int)
public static java.lang.String java.lang.String.valueOf(int)
public static java.lang.String java.lang.String.valueOf(char[])
public static java.lang.String java.lang.String.valueOf(java.lang.Object)
public static java.lang.String java.lang.String.valueOf(boolean)
public static java.lang.String java.lang.String.valueOf(char[],int,int)
public static java.lang.String java.lang.String.valueOf(char)
public static java.lang.String java.lang.String.valueOf(double)
public static java.lang.String java.lang.String.valueOf(float)
public static java.lang.String java.lang.String.valueOf(long)
public char java.lang.String.charAt(int)
public int java.lang.String.codePointAt(int)
public int java.lang.String.codePointBefore(int)
public int java.lang.String.codePointCount(int,int)
public int java.lang.String.offsetByCodePoints(int,int)
public byte[] java.lang.String.getBytes(java.nio.charset.Charset)
public byte[] java.lang.String.getBytes(java.lang.String) throws java.io.UnsupportedEncodingException
public void java.lang.String.getBytes(int,int,byte[],int)
public byte[] java.lang.String.getBytes()
public boolean java.lang.String.contentEquals(java.lang.CharSequence)
public boolean java.lang.String.contentEquals(java.lang.StringBuffer)
public boolean java.lang.String.regionMatches(boolean,int,java.lang.String,int,int)
public boolean java.lang.String.regionMatches(int,java.lang.String,int,int)
public boolean java.lang.String.startsWith(java.lang.String,int)
public boolean java.lang.String.startsWith(java.lang.String)
public int java.lang.String.lastIndexOf(java.lang.String)
public int java.lang.String.lastIndexOf(java.lang.String,int)
public int java.lang.String.lastIndexOf(int,int)
public int java.lang.String.lastIndexOf(int)
public java.lang.String java.lang.String.substring(int,int)
public java.lang.String java.lang.String.substring(int)
public boolean java.lang.String.isEmpty()
public java.lang.String java.lang.String.replace(char,char)
public java.lang.String java.lang.String.replace(java.lang.CharSequence,java.lang.CharSequence)
public boolean java.lang.String.matches(java.lang.String)
public java.lang.String java.lang.String.replaceFirst(java.lang.String,java.lang.String)
public java.lang.String java.lang.String.replaceAll(java.lang.String,java.lang.String)
public java.lang.String[] java.lang.String.split(java.lang.String)
public java.lang.String[] java.lang.String.split(java.lang.String,int)
public static java.lang.String java.lang.String.join(java.lang.CharSequence,java.lang.CharSequence[])
public static java.lang.String java.lang.String.join(java.lang.CharSequence,java.lang.Iterable)
public java.lang.String java.lang.String.toLowerCase()
public java.lang.String java.lang.String.toLowerCase(java.util.Locale)
public java.lang.String java.lang.String.toUpperCase()
public java.lang.String java.lang.String.toUpperCase(java.util.Locale)
public java.lang.String java.lang.String.trim()
public java.lang.String java.lang.String.strip()
public java.lang.String java.lang.String.stripLeading()
public java.lang.String java.lang.String.stripTrailing()
public java.util.stream.Stream java.lang.String.lines()
public java.lang.String java.lang.String.repeat(int)
public boolean java.lang.String.isBlank()
public char[] java.lang.String.toCharArray()
public static java.lang.String java.lang.String.format(java.lang.String,java.lang.Object[])
public static java.lang.String java.lang.String.format(java.util.Locale,java.lang.String,java.lang.Object[])
public java.lang.Object java.lang.String.resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup) throws java.lang.ReflectiveOperationException
public java.lang.String java.lang.String.resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup)
public java.util.stream.IntStream java.lang.String.codePoints()
public boolean java.lang.String.equalsIgnoreCase(java.lang.String)
public int java.lang.String.compareToIgnoreCase(java.lang.String)
public boolean java.lang.String.endsWith(java.lang.String)
public java.lang.CharSequence java.lang.String.subSequence(int,int)
public java.lang.String java.lang.String.concat(java.lang.String)
public boolean java.lang.String.contains(java.lang.CharSequence)
public java.lang.String java.lang.String.indent(int)
public java.lang.String java.lang.String.stripIndent()
public java.lang.String java.lang.String.translateEscapes()
public java.util.stream.IntStream java.lang.String.chars()
public java.lang.Object java.lang.String.transform(java.util.function.Function)
public java.lang.String java.lang.String.formatted(java.lang.Object[])
public static java.lang.String java.lang.String.copyValueOf(char[],int,int)
public static java.lang.String java.lang.String.copyValueOf(char[])
public native java.lang.String java.lang.String.intern()
public java.util.Optional java.lang.String.describeConstable()
public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
public final void java.lang.Object.wait() throws java.lang.InterruptedException
public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
public final native java.lang.Class java.lang.Object.getClass()
public final native void java.lang.Object.notify()
public final native void java.lang.Object.notifyAll()
 */
	}
}
