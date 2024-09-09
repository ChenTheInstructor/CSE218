package p4_bags_containers;

import java.util.function.Predicate;

public class ArrayBag <T extends Comparable>{
	private T[] arr;
	private int nElems; //number of elements
	
	public ArrayBag(int maxSize) {
		arr = (T[]) (new Object[maxSize]);
	}
	
	public void add(T value) {
		arr[nElems++] = value;
	}
	
	public boolean search(Predicate<T> predicate, T value) {
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				return true;
			}
		}
		return false;
		
	}
	
}
