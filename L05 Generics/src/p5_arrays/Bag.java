package p5_arrays;

import java.util.function.Predicate;

public class Bag <E>{
	private E[] arr;
	private int nElems;
	
	@SuppressWarnings("unchecked")
	public Bag(int maxSize) {
		arr = (E[])(new Object[maxSize]);
	}
	
	public void insert(E value) {
		arr[nElems++] = value;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	public E search(Predicate<E> predicate) {
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				return arr[i];
			}
		}
		return null;
	}
}
