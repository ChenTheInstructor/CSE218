package p1;

import java.lang.reflect.Array;

public class PriorityQ<T extends Comparable<T>> {
	private T[] arr;
	private int initialSize;
	private int nItems;

	public PriorityQ(int initialSize) {
		this.initialSize = initialSize;
		arr = (T[]) new Object[initialSize];
		nItems = 0;
	}

	public void enqueue(T value) {
		int j;
		if(isFull()) {
			arr = resizing2();
		}
		if (isEmpty()) {
			arr[nItems] = value;
		} else {
			for (j = nItems - 1; j >= 0; j--) {
				if (arr[j].compareTo(value) > 0) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}

			arr[j + 1] = value;

		}
		nItems++;
	}

	private T[] resizing1() {
		T[] temp = (T[])new Object[arr.length * 2];
		int count = 0;
		for(T v : arr) {
			temp[count++] = v;
		}
		initialSize = temp.length;
		return temp;
	}
	
	private T[] resizing2() {
		T[] temp = (T[])Array.newInstance(peek().getClass(), initialSize * 2);
		int count = 0;
		for(T v : arr) {
			temp[count++] = v;
		}
		initialSize = temp.length;
		return temp;
	}

	public T dequeue() {
//		return arr[nItems - 1];
		return arr[--nItems];
	}
	
	public T peek() {
		return arr[nItems - 1];
	}

	public boolean isFull() {
		return nItems == initialSize;
	}

	public PriorityQ(Class clazz, int initialSize) {
		this.initialSize = initialSize;
		arr = (T[]) Array.newInstance(clazz, initialSize);
		nItems = 0;
	}

	public boolean isEmpty() {
		return nItems == 0;
	}
}
