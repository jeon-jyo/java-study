package kr.co.dto;
/*
 * 객체 중심으로 클래스를 설계(모델링, Modeling) 하고  => 모델링 도구 class 필요
 * 객체를 생성(사용)
 * 
 * 	- ex) 한 명의 헬스클럽회원 데이터를 저장하기 위한 변수들
 * 		  	- 이름, 나이, 전화번호, 이메일, 거주지, 몸무게 ...
 * 		  	=> 사용자 정의 자료형, 새로운 자료형, 객체 자료형
 */
public class MemberDTO {
	
	String name;
	int age;
	String phone;
	String email;
	String addr;
	float weight;

}
