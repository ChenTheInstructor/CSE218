package p2_queues;

public class Queue {
	private int maxSize;
	private long[] queueArr;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		queueArr = new long[maxSize];
		front  = 0;
		rear = -1;
		nItems = 0;
	}
	
	public long dequeue() {
		long temp = queueArr[front++];
		if(front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public long peek() {
		return queueArr[front];
	}
	
	public void enqueue(long value) {
		if(rear == maxSize - 1) {
			rear = -1;
		}
		queueArr[++rear] = value;
		nItems++;
	}
	
	public int size() {
		return nItems;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
}
