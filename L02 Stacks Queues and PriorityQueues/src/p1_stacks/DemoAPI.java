package p1_stacks;

import java.util.Stack;

public class DemoAPI {

	public static void main(String[] args) {
		Stack<Student> myStack = new Stack<>();
		myStack.push(new Student("A", 3.5));
		myStack.push(new Student("B", 3.5));
		myStack.push(new Student("C", 3.5));
		myStack.push(new Student("D", 3.5));
		myStack.push(new Student("E", 3.5));
		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}

	}

}
