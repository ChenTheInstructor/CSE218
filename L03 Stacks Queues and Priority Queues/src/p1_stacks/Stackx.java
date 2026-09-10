package p1_stacks;

public class Stackx {
	private int[] a;
	private int top;
	private int maxSize;
	
	
	
	public Stackx(int maxSize) {
		a = new int[maxSize];
		top = -1;
		this.maxSize = maxSize;
	}
	
	public void push(int value) {
		a[++top] = value;
	}
	
	public int pop() {
		return a[top--];
	}
	
	public int peek() {
		return a[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
}
