package kr.co.nongeneric;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		ThreeDPrinter01 printer = new ThreeDPrinter01();
		Powder powder = new Powder();
		printer.setMaterial(powder);
		System.out.println(printer.getMaterial());	// 재료는 Powder 입니다.

		Powder pow = printer.getMaterial();
		System.out.println(pow);					// 재료는 Powder 입니다.
		System.out.println();
		
		ThreeDPrinter02 printer2 = new ThreeDPrinter02();
		Plastic plastic = new Plastic();
		printer2.setMaterial(plastic);
		System.out.println(printer2.getMaterial());	// 재료는 Plastic 입니다.
		
		plastic = printer2.getMaterial();
		System.out.println(plastic);				// 재료는 Plastic 입니다.
		System.out.println("--------------------");
		
		/*
			이렇게 3D프린터 클래스를 각 재료의 자료형마다 생성해줘야함
			Object 자료형을 이용해도 되지만 매번 다운캐스팅을 구현해야함
		 */
		ThreeDPrinter03 printer301 = new ThreeDPrinter03();
		printer301.setMaterial(powder);
		System.out.println(printer301.getMaterial());	// 재료는 Powder 입니다.
		
		powder = (Powder)printer301.getMaterial();
		System.out.println(powder);						// 재료는 Powder 입니다.
		System.out.println();

		ThreeDPrinter03 printer302 = new ThreeDPrinter03();
		printer302.setMaterial(plastic);
		System.out.println(printer302.getMaterial());	// 재료는 Plastic 입니다.
		
		plastic = (Plastic)printer302.getMaterial();
		System.out.println(plastic);					// 재료는 Plastic 입니다.
		System.out.println("--------------------");
		
		/* 제네릭 */
		GenericThreeDPrinter<Powder> powderPrinter = new GenericThreeDPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		System.out.println(powderPrinter);				// 재료는 Powder 입니다.
		
		Powder po = powderPrinter.getMaterial();
		System.out.println(po);							// 재료는 Powder 입니다.
		System.out.println();
		
		GenericThreeDPrinter<Plastic> plasticPrinter = new GenericThreeDPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);				// 재료는 Plastic 입니다.
		
		Plastic pl = plasticPrinter.getMaterial();
		System.out.println(pl);							// 재료는 Plastic 입니다.
		
	}
}
