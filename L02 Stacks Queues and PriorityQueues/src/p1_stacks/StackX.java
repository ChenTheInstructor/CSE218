package p1_stacks;

public class StackX {
	private long[] stackArr;
	private int top;
	private int maxSize;

	public StackX(int maxSize) {
		this.maxSize = maxSize;
		top = -1;
		stackArr = new long[maxSize];
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

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

}
