package kr.co.generic02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {

	public static void main(String[] args) {
		
		List<Movie> list = new ArrayList<Movie>();
		
		list.add(new Movie("1미션 임파서블: 데드 레코닝 PART ONE", "크리스토퍼 맥쿼리", "2023.07.12", "미국"));
		list.add(new Movie("2미션 임파서블: 데드 레코닝 PART ONE", "크리스토퍼 맥쿼리", "2023.07.12", "미국"));
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
	}
}
