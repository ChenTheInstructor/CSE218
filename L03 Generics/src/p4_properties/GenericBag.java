package p4_properties;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class GenericBag<T> {
	private T[] arr;
	private int nItems;

//	public GenericBag(int maxSize) {
//		arr = (T[])(new Object[maxSize]);
//		nItems = 0;
//	}

	public GenericBag(Class<T> clazz, int maxSize) {
		arr = (T[]) (Array.newInstance(clazz, maxSize));
	}

	public T[] search(Class<T> clazz, Predicate<T> predicate) {
		T[] tempArr = (T[])Array.newInstance(clazz, nItems);
		int matchCount = 0;
		for(int i = 0; i < nItems; i++) {
			if(predicate.test(arr[i])) {
				tempArr[matchCount++] = arr[i];
			}
		}
		
		return Arrays.copyOf(tempArr, matchCount);
	}

	public void add(T value) {
		arr[nItems++] = value;
	}

	public void display() {
		for (int i = 0; i < nItems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

}
