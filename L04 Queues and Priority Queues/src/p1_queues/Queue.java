package p1_queues;

public class Queue {
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int maxSize) {
		this.maxSize = maxSize;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public int size() {
		return nItems;
	}
	
	public long remove() {
		long temp = queArray[front++];
		if(front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public void insert(long n) {
		if(rear == maxSize - 1) { // check to wrap around
			rear = -1;
		}
		queArray[++rear] = n;
		nItems++;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
}
