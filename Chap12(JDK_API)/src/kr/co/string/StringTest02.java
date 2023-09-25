package kr.co.string;

public class StringTest02 {
	public static void main(String[] args) {
		
		String java = new String("java");
		String java2 = new String("java");
		String kotlin = new String("kotlin");
		System.out.println(System.identityHashCode(java));	// 1554547125
		System.out.println(System.identityHashCode(java2));	// 617901222
		System.out.println(System.identityHashCode(kotlin));	// 1159190947
	
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));	// 925858445
		
		buffer.append(kotlin);
		System.out.println(buffer);	// javakotlin
		System.out.println(System.identityHashCode(buffer));	// 925858445
		
	}
}
