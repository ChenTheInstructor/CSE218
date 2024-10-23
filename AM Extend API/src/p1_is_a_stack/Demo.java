package p1_is_a_stack;

import java.util.Arrays;
import java.util.Stack;

public class Demo {

	public static void main(String[] args) {
		QuickStack<Integer> stack1 = new QuickStack<>();
		Integer[] a = { 1, 2, 3, 4};
		
		stack1.push(100);
		stack1.pushAll(a);
		System.out.println(stack1.size());
		
		Integer[] b = stack1.popAll();
		
		
		
		System.out.println(Arrays.toString(b));
		
	}

}
