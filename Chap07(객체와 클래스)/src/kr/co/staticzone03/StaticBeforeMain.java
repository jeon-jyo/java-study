package kr.co.staticzone03;

import java.util.Random;

public class StaticBeforeMain {

	/*
	 * 메인보다 먼저 실행
	 */
	static int num;	// static 멤버 변수
	
	static {		// static 초기화 블록
		Random random = new Random();
		num = random.nextInt(100);	// 0~99 사이 임의의 숫자 반환
	}
	
	/*
	 * 메인
	 */
	public static void main(String[] args) {
		System.out.println(num);
	}
}
