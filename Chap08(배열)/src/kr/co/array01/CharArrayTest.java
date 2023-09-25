package kr.co.array01;

import java.util.Arrays;

public class CharArrayTest {

	public static void main(String[] args) {
		
		char[] charArr = new char[26];
		char[] charArr2 = new char[26];
		
		System.out.println(Arrays.toString(charArr));
		
		// 1.
		for(int i = 0, num = 65; i < charArr.length; i++, num++) {
			charArr[i] = (char)num;
		}
		
		// 2.
		char ch = 'A';
		for(int i = 0; i < charArr2.length; i++) {
			charArr2[i] = ch++;
		}

		System.out.println(Arrays.toString(charArr));
		System.out.println(Arrays.toString(charArr2));
		
		/*
		 * 향상된 for문
		 * 
		 * for(변수 : 배열) {
		 * }
		 */
		for(char alpha : charArr) {
			System.out.println(alpha + " : " + (int)alpha);
		}
		
		/*
		 	[, , , , , , , , , , , , , , , , , , , , , , , , , ]
			[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
			[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
			A : 65
			B : 66
			C : 67
			D : 68
			E : 69
			F : 70
			G : 71
			H : 72
			I : 73
			J : 74
			K : 75
			L : 76
			M : 77
			N : 78
			O : 79
			P : 80
			Q : 81
			R : 82
			S : 83
			T : 84
			U : 85
			V : 86
			W : 87
			X : 88
			Y : 89
			Z : 90
		 */
	}
}
