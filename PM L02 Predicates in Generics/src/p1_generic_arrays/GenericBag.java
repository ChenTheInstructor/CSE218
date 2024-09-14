package p1_generic_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class GenericBag <E extends Object & Comparable<E>>  {
	private E[] arr;
	private int nElems;
	
	public GenericBag(Class clazz, int maxSize) {
		arr = (E[])Array.newInstance(clazz, maxSize);
		nElems = 0;
	}
	
	public E[] search(Class clazz, Predicate<E> predicate) {
		E[] matchArr = (E[])Array.newInstance(clazz, nElems);
		int matchCount = 0;
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				matchArr[matchCount++] = arr[i];
			}
		}
		return Arrays.copyOf(matchArr, matchCount);
		
	}
	
//	public E[] remove(Predicate<E> predicate, E value) {
//		E[] matchArr = (E[])(new Object[nElems]);
//		int matchCount = 0;
//		for(int i = 0; i < nElems; i++) {
//			if(predicate.test(arr[i])) {
//				break;
//			}
//		}
//		if()
//	}
	
	public void add(E value) {
		arr[nElems++] = value;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
}
