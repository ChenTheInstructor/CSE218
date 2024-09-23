package p1_stacks;

public class StackX {
	private int maxSize;
	private long[] stackArr;
	private int top;
	
	public StackX(int maxSize) {
		this.maxSize = maxSize;
		stackArr = new long[maxSize];
		top = -1;
	}
	
	public void push(long value) {
		
		stackArr[++top] = value;
	}
	
	public long pop() {
		return stackArr[top--];
	}
	
	public long peek() {
		return stackArr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
}
