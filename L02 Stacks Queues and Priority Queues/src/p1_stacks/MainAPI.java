package p1_stacks;

import java.util.Stack;

public class MainAPI {

	public static void main(String[] args) {
		Stack<Student> stack = new Stack<>();
		stack.push(new Student("A", 1.9));
		stack.push(new Student("B", 1.9));
		stack.push(new Student("C", 1.9));
		stack.push(new Student("D", 1.9));
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}
