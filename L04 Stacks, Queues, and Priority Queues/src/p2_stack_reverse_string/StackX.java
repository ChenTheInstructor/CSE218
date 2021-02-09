package p2_stack_reverse_string;

public class StackX {
	private char[] stackArray;
	private int top;
	private int maxSize;
	
	public StackX(int maxSize) {
		stackArray = new char[maxSize];
		top = -1;
		this.maxSize = maxSize;
	}
	
	public void push(char value) {
		stackArray[++top] = value;
	}
	
	public char pop() {
		return stackArray[top--];
	}
	
	public char peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize -1);
	}
}
