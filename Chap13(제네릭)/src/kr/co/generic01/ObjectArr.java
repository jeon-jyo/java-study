package kr.co.generic01;

public class ObjectArr<T> {
	
	private T[] arr;
	private int size;
	
	public ObjectArr(int size) {
//		this.size = size;
		arr = (T[]) new Object[size];
//		arr = new T[size];	// Cannot create a generic array of T
	}
	
	public void set(int index, T value) {
		arr[index] = value;
		size++;
		/*
		 * 추가할 때 마다 크기++을 하게 되어 추가된 값만 들어감
		 *  -> 크기가 5여도 남은 인덱스에 초기화 값이 안들어감
		 *  -> 하지만 배열 크기 이상은 추가 안됨
		 */
	}
	
	public T get(int index) {
		return arr[index];
	}
	
	public int size() {
		return size;
//		return arr.length();	// Cannot invoke length() on the array type T[]
	}

}
