package kr.co.lambda03;

public class TriFuntionTest {

	public static void main(String[] args) {
		
		TriFuntion<Integer, Integer, Integer, Integer> addTriNums =
				(x, y, z) -> z + y + z;
		int result = addTriNums.apply(3, 2, 5);
		
		System.out.println("result : " + result);
	}
}
