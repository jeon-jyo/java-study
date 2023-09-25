package kr.co.generic04;

public class GenericThreeDPrinterTest {

	public static void main(String[] args) {
		
		/* Water cannot be resolved to a type */
//		GenericThreeDPrinter<Water> a = new GenericThreeDPrinter<>();
		GenericThreeDPrinter<Powder> genericThreeDPrinter = new GenericThreeDPrinter<>();
		
		Powder powder = new Powder();
		System.out.println(powder);					// 재료는 Powder 입니다.
		System.out.println();
		
		genericThreeDPrinter.setMaterial(powder);	// setMaterial() : 재료는 Powder 입니다.
		System.out.println();
		
		System.out.println(genericThreeDPrinter);
		System.out.println("getMaterial : " + genericThreeDPrinter.getMaterial());
		System.out.println();
		/*
			GenericThreeDPrinter [material=재료는 Powder 입니다.]
			getMaterial : 재료는 Powder 입니다.
		 */
		
		GenericThreeDPrinter<Plastic> genericThreeDPrinter2 = new GenericThreeDPrinter<>();
		
		Plastic plastic = new Plastic();
		genericThreeDPrinter2.setMaterial(plastic);	// setMaterial() : 재료는 Plastic 입니다.
		System.out.println();
		
		System.out.println(genericThreeDPrinter2);
		System.out.println("getMaterial : " + genericThreeDPrinter2.getMaterial());
		System.out.println();
		/*
			GenericThreeDPrinter [material=재료는 Plastic 입니다.]
			getMaterial : 재료는 Plastic 입니다.
		 */
		
		genericThreeDPrinter.print();
		genericThreeDPrinter2.print();
		/*
			Powder 재료로 출력합니다.
			Plastic 재료로 출력합니다.
		 */
	}
}
