package kr.co.generic04;

public class GenericThreeDPrinter<T extends Material> {	// Material 를 상속받은 클래스만

	private T material;		// T 자료형으로 선언한 참조 변수
	
	public T getMaterial() {	// T 자료형을 반환하는 제네릭 메서드
		return material;
	}
	
	public void setMaterial(T material) {
		System.out.println("setMaterial() : " + material);
		this.material = material;
	}

	@Override
	public String toString() {
		return "GenericThreeDPrinter [material=" + material + "]";
	}
	
	public void print() {
		material.doPrint();
	}
}
