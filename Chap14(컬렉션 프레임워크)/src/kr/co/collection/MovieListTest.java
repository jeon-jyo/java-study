package kr.co.collection;

import java.util.ArrayList;

public class MovieListTest {

	public static void main(String[] args) {
		
		ArrayList<Movie> list = new ArrayList<Movie>();
		
		list.add(new Movie("1미션 임파서블: 데드 레코닝 PART ONE", "크리스토퍼 맥쿼리", "2023.07.12", "미국"));
		list.add(new Movie("2미션 임파서블: 데드 레코닝 PART ONE", "크리스토퍼 맥쿼리", "2023.07.12", "미국"));
		list.add(new Movie("3미션 임파서블: 데드 레코닝 PART ONE", "크리스토퍼 맥쿼리", "2023.07.12", "미국"));
	
		for(Movie movie : list) {
			System.out.println(movie);
		}
	}
}
