package p5_API;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Double> theStack = new Stack<>();
		theStack.push(Double.valueOf(1.1)); // manual-boxing
		theStack.push(4.4); // auto-boxing
		theStack.push(2.2);
		
		System.out.println(theStack.pop());
		
	}

}
