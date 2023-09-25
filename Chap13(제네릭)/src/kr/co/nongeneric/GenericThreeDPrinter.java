package kr.co.nongeneric;

public class GenericThreeDPrinter<T> {

	private T material;			// T 자료형으로 선언한 (참조)변수

	public T getMaterial() {	// T 자료형 변수를 반환하는 generic 메서드
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
}
