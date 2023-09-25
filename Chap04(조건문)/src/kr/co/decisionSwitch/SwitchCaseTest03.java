package kr.co.decisionSwitch;

import java.util.Scanner;

public class SwitchCaseTest03 {
	
	public static void main(String[] args) {
		/*
		 * Quiz. switch ~ case문 사용하여 요일에 해당하는 운동을 출력하시오.
		 * 		 ex) 요일에 해당하는 운동을 입력하세요. (Sunday, Monday, Wednesday, Tuesday, Friday) :
		 * 			 야구하기 농구하기 수영하기 자전거타기 축구하기 / 휴식
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("요일에 해당하는 운동을 입력하세요. (Sunday, Monday, Wednesday, Tuesday, Friday) : ");
		String str = scan.nextLine();
		
	switch (str) {
		case "Sunday":
			System.out.println("야구하기");
			break;
		case "Monday":
			System.out.println("농구하기");
			break;
		case "Wednesday":
			System.out.println("수영하기");
			break;
		case "Tuesday":
			System.out.println("자전거타기");
			break;
		case "Friday":
			System.out.println("축구하기");
			break;
		default:
			System.out.println("휴식");
		}	

		scan.close();
	}

}
