package kr.co.singleton01;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company company = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company);	// kr.co.singleton.Company@71dac704
		System.out.println(company2);	// kr.co.singleton.Company@71dac704
		
		// boolean java.lang.Object.equals(Object obj) : 주소 비교
		if(company.equals(company2)) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		
		// == 연산자 : 주소값 비교
		if(company == company2) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		
		/*
			kr.co.singleton01.Company@71dac704
			kr.co.singleton01.Company@71dac704
			같은 객체입니다.
			같은 객체입니다.
		 */
	}
}
