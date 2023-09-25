package kr.co.review;

public class CarTest {
	
	public static void main(String[] args) {
		
		// 자동차의 정보를 저장하려고 함. 변수를 선언하시오.
		
		// 모델
		String carModel = "BMW 520i";
		// 주행거리
		long distance = 100000;
		// 가격
		int carPrice = 67700000;
		// 제조사
		String company = "BMW";
		// 기어방식
		boolean auto = true;
		// 년식
		int CarYear = 2023;
		// 연비
		float efficiency = 5.07f;
		
		System.out.println("carModel " + carModel + " / distance " + distance + " / carPrice " + carPrice + " / company " + company +
				" / auto " + auto + " / CarYear " + CarYear + " / efficiency " + efficiency);
		
	}

}
