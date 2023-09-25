package kr.co.lambda03;

@FunctionalInterface
public interface TriFuntion<T, U, V, R> {

	R apply(T t, U u, V v);
	
}
