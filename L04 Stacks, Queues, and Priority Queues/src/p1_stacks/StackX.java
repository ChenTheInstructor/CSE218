package p1_stacks;

public class StackX {
	private long[] stackArray;
	private int top;
	private int maxSize;
	
	public StackX(int maxSize) {
		stackArray = new long[maxSize];
		top = -1;
		this.maxSize = maxSize;
	}
	
	public void push(long value) {
		stackArray[++top] = value;
	}
	
	public long pop() {
		return stackArray[top--];
	}
	
	public long peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize -1);
	}
}
