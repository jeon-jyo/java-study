package kr.co.generic05;

public class AverageCalc<T extends Number> {

	private T[] numbers;
	
	public AverageCalc(T[] numbers) {
		this.numbers = numbers;
	}
	
	public double calculateAverage() {
		double sum = 0.0;
		for(T number : numbers) {
			sum += number.doubleValue();	// 더블로 반환
		}
		return sum/numbers.length;
	}
	
}
