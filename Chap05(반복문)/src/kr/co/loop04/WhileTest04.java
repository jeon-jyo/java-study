package kr.co.loop04;

public class WhileTest04 {
	
	public static void main(String[] args) {
		
		int dan = 2;
		int count;
		
		while(dan <= 9) {
			count = 1;	// while문은 반복 수행할 변수를 while 문 위에 선언하고 초기화한다. 
			while(count <= 9) {	  // while문 괄호 안에는 조건식만 존재한다.
				System.out.println(dan + " * " + count + " = " + (dan*count));
				count++;
				// 증감식과 실행문은 블록안에 작성한다.
			}
			dan++;
			System.out.println();
		}
		
	}

}
