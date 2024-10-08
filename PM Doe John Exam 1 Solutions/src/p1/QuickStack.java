package p1;

import java.lang.reflect.Array;
import java.util.Stack;

//inheritance
/*
 * It implies QuickStack "IS A" stack
 * So QuickStack inherits all of the non-private elements from Stack class
 * Also, a subclass (QuickStack) has to contain an object of the superclass (Stack)
 */
public class QuickStack <T> extends Stack <T>{
	private Class clazz;
//	private T[] arr;
	
	public QuickStack(Class clazz) {
		this.clazz = clazz;
//		arr = (T[])new Object[this.size()];
	}

	public T[] popAll() {
		if(isEmpty()) {
			return (T[])new Object[0];
		}
		int count  = 0;
//		T[] tempArr = (T[])new Object[size()];// may produce ClassCastException
		T[] tempArr = (T[])Array.newInstance(clazz, size());
		while(!isEmpty()) {
			tempArr[count++] = pop();
		}
		return tempArr;
	}

	public void pushAll(T[] arr) {
		for(T value : arr) {
			push(value);
		}
	}
}
