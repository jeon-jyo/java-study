package kr.co.lambda05;

@FunctionalInterface
public interface Converter<F,T> {
	
	/* F 매개변수, T 반환형 */
	
	T convert(F from);

}