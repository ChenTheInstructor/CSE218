package p2_queues;

public class MyQ {
	private int maxSize;
	private int[] a;
	private int front;
	private int rear;
	private int nItems;

	public MyQ(int maxSize) {
		this.maxSize = maxSize;
		a = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public int size() {
		return nItems;
	}
	
	public int peekFront() {
		return a[front];
	}
	
	public int remove() {
		int temp = a[front++];
		if(front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}
	
	public void add(int value) {
		if(rear == maxSize - 1) {
			rear = -1;
		}
		a[++rear] = value;
		nItems++;
	}
}
