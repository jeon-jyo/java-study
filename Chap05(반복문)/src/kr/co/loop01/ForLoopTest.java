package kr.co.loop01;

public class ForLoopTest {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			System.out.print(i + " ");	// 0 1 2 3 4 5 6 7 8 9 10
		}
		
		System.out.println();
		System.out.println("-----");
		
		for(char ch = 'A'; ch <= 'z'; ch++) {
			System.out.print(ch + " ");
			// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c d e f g h i j k l m n o p q r s t u v w x y z 
		}

		System.out.println();
		
		for(int i = 65; i <= 90; i++) {
			System.out.print(i + " : " + (char)i + ", ");
			// 65 : A, 66 : B, 67 : C, 68 : D, 69 : E, 70 : F, 71 : G, 72 : H, 73 : I, 74 : J, 75 : K, 76 : L, 77 : M, 78 : N,
			// 79 : O, 80 : P, 81 : Q, 82 : R, 83 : S, 84 : T, 85 : U, 86 : V, 87 : W, 88 : X, 89 : Y, 90 : Z, 
		}
		
		System.out.println();
		
		for(char cha = 'a'; cha <= 'z'; cha++) {
			System.out.print(cha + " : " + (int)cha + ", ");
			// a : 97, b : 98, c : 99, d : 100, e : 101, f : 102, g : 103, h : 104, i : 105, j : 106, k : 107, l : 108, m : 109, n : 110,
			// o : 111, p : 112, q : 113, r : 114, s : 115, t : 116, u : 117, v : 118, w : 119, x : 120, y : 121, z : 122, 
		}
		
		System.out.println();
		System.out.println("-----");
		
		int[] numbers = {1, 2, 3, 4 , 5, 6, 7, 8, 9, 10};
		for(int i = 0; i < numbers.length; i++) {
//			System.out.print(i + " ");	// 0 1 2 3 4 5 6 7 8 9
			System.out.print(numbers[i] + " ");	 // 1 2 3 4 5 6 7 8 9 10 
		}
		
		System.out.println();
		
		// 향상된 for문
		for(int su : numbers) {
			System.out.print(su + " ");	 // 1 2 3 4 5 6 7 8 9 10 
		}
		
	}
}
