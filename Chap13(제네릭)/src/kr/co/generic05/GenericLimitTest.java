package kr.co.generic05;

public class GenericLimitTest {

	public static void main(String[] args) {
	
		Integer[] intArr = {1, 2, 3, 4, 5};
		Double[] doubleArr = {11.1, 22.2, 33.3, 44.4, 55.5};
		String[] strArr = {"hi", "media"};
	
		AverageCalc<Integer> integerCalc = new AverageCalc<Integer>(intArr);
		double integerAverage = integerCalc.calculateAverage();
		System.out.println(integerAverage);		// 3.0
		
		AverageCalc<Double> doubleCalc = new AverageCalc<Double>(doubleArr);
		double doubleAverage = doubleCalc.calculateAverage();
		System.out.println(doubleAverage);		// 33.3
		
		/*
		 * Bound mismatch: The type String is not a valid substitute for
		 * the bounded parameter <T extends Number> of the type AverageCalc<T>
		 */
//		AverageCalc<String> stringCalc = new AverageCalc<String>(strArr);

	}
}
