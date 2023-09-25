package kr.co.generic02;

public class ObjectArr<T> {
	
	private T[] arr;
	private int size;
	
	public ObjectArr(int size) {
//		this.size = size;
		arr = (T[]) new Object[size];
	}

	public void set(int index, T value) {
		arr[index] = value;
		size++;
	}
	public T get(int index) {
		return arr[index];
	}
	public int size() {
		return size;
	}
}
