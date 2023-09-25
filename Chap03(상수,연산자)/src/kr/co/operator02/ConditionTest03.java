package kr.co.operator02;

import java.util.Scanner;

/*
 * 입력받은 두 수 중에서 큰 수를 출력하시오.
 * 
 *  입력1 : 50
 *  입력2 : 20
 *  
 *  50
 */

public class ConditionTest03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int x = scan.nextInt();
		System.out.print("입력2 : ");
		int y = scan.nextInt();
		
		int max = (x > y) ? x : y;
		System.out.println(max);
		
		scan.close();
	}

}
