package p1_is_a_stack;

import java.lang.reflect.Array;
import java.util.Stack;

public class QuickStack <T> extends Stack<T> {
//	private Stack<T> stack;
	
	
//	public QuickStack() {
//		this.stack = new Stack<T>();
//	}
//	public QuickStack() {
////		super();
//	}
	
	public void pushAll(T[] arr) {
		for(T value : arr) {
			push(value);
		}
	}
	
	

	public T[] popAll() {
//		T[] temp = (T[])new Object[stack.size()];
		T[] temp = (T[])Array.newInstance(peek().getClass(), size());
		int count = 0;
		while(!isEmpty()) {
			temp[count++] = pop();
		}
		return temp;
	}

}
