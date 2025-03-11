package p3_priorityq;

import java.lang.reflect.Array;

public class PriorityQ2 <T extends Comparable<T>> {
	private int maxSize;
	private T[] queArr;
	private int nItems;
	private Class<T> clazz;

	public PriorityQ2(Class<T> clazz, int maxSize) {
		this.maxSize = maxSize;
		queArr = (T[])Array.newInstance(clazz, maxSize);
		nItems = 0;
		this.clazz = clazz;
	}

	public void insert(T value) {
		int j = 0;
		if (nItems == 0) {
			queArr[nItems++] = value;
		} else {
			for (j = nItems - 1; j >= 0; j--) {
				if (value.compareTo(queArr[j]) < 0) {
					queArr[j + 1] = queArr[j];
				} else {
					break;
				}
			}
			queArr[j + 1] = value;
			nItems++;
		}

	}
	
	public T remove() {
		return queArr[--nItems];
	}
}
