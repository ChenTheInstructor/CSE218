package p2_has_a_stack;

import java.lang.reflect.Array;
import java.util.Stack;
import java.util.TreeSet;

public class QuickCollection<T> { // has a relationship
	private Stack<T> stack;
	private TreeSet<T> set;
	
	public QuickCollection() {
		stack = new Stack<>();
		set = new TreeSet<>();
	}
	
	public void pushAll(T[] arr) {
		for(T value : arr) {
			stack.push(value);
		}
	}
	
	public T[] popAll() {
		T[] temp = (T[])Array.newInstance(stack.peek().getClass(), stack.size());
		int count = 0;
		while(!stack.isEmpty()) {
			temp[count++] = stack.pop();
		}
		return temp;
	}
}
