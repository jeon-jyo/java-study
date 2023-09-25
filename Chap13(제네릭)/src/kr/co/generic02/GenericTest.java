package kr.co.generic02;

public class GenericTest {

	public static void main(String[] args) {
	
		ObjectArr<Movie> oArr = new ObjectArr<Movie>(5);
		oArr.set(0, new Movie("1미션 임파서블: 데드 레코닝 PART ONE", "크리스토퍼 맥쿼리", "2023.07.12", "미국"));
		oArr.set(1, new Movie("2미션 임파서블: 데드 레코닝 PART ONE", "크리스토퍼 맥쿼리", "2023.07.12", "미국"));
		oArr.set(2, new Movie("3미션 임파서블: 데드 레코닝 PART ONE", "크리스토퍼 맥쿼리", "2023.07.12", "미국"));
		oArr.set(3, new Movie("4미션 임파서블: 데드 레코닝 PART ONE", "크리스토퍼 맥쿼리", "2023.07.12", "미국"));
		oArr.set(4, new Movie("5미션 임파서블: 데드 레코닝 PART ONE", "크리스토퍼 맥쿼리", "2023.07.12", "미국"));
		
		for(int i = 0; i < oArr.size(); i++) {
			System.out.println(oArr.get(i));
		}
		
	}
}
