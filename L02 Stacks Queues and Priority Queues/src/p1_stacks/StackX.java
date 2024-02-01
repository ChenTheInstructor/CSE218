package p1_stacks;

public class StackX {
	private int[] a;
	private int top;

	public StackX(int maxSize) {
		a = new int[maxSize];
		top = -1;
	}
	
	public int pop() {
		int temp = a[top];
		top--;
		return temp;
	}
	
	public int peek() {
		return a[top];
	}

	public void push(int value) {
		if (!isFull()) {
			a[++top] = value;
		}
	}

	public boolean isFull() {
		return top == a.length - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}
}
