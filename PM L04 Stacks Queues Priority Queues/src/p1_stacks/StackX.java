package p1_stacks;

public class StackX {
	private long[] stackArr;
	private int maxSize;
	private int top;
	
	public StackX(int maxSize) {
		stackArr = new long[maxSize];
		this.maxSize = maxSize;
		top = -1;
	}
	
	public long pop() {
		return stackArr[top--];
	}
	
	public long peek() {
		return stackArr[top];
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public void push(long value) {
		stackArr[++top] = value;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
}
