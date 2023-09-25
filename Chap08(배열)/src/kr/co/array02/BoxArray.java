package kr.co.array02;

class BoxA4 {
	String name;
	
	public BoxA4(String name) {
		this.name = name;
	}
}

public class BoxArray {
	
	public static void main(String[] args) {
		
		BoxA4[] box = new BoxA4[3];
		
		for(int i = 0; i < box.length; i++) {
			box[i] = new BoxA4("혼자 공부하는 자바" + (i+1));
		}
		
		for(BoxA4 i : box) {
			System.out.println(i.name);
		}
		
		/*
			혼자 공부하는 자바1
			혼자 공부하는 자바2
			혼자 공부하는 자바3
		 */
	}
}
