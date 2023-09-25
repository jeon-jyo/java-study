package kr.co.interface03;

public class HiMediaClassTest {

	public static void main(String[] args) {
		
		HiMediaClass hClass = new HiMediaClass();
		hClass.x();
		hClass.y();
		hClass.myMethod();
		
		// upcasting
		X xClass = hClass;
		xClass.x();
		
		Y yClass = hClass;
		yClass.y();
		
		HiMediaInterface hClazz = hClass;
		hClazz.myMethod();
		
	}
}
