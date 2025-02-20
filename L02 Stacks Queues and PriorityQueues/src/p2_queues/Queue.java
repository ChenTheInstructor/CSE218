package p2_queues;

public class Queue {
	private long[] queArr;
	private int rear;
	private int front;
	private int nItems;
	private int maxSize;

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		queArr = new long[maxSize];
		rear = -1;
		front = 0;
		nItems = 0;
	}

	public long remove() {
		long temp = queArr[front++];
		if (front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public int size() {
		return nItems;
	}
	
	public long peekRear() {
		return queArr[rear];
	}
	
	public long peekFront() {
		return queArr[front];
	}

	public boolean isEmpty() {
		return nItems == 0;
	}

	public boolean isFull() {
		return nItems == maxSize;
	}

	public void insert(long value) {
		if (rear == maxSize - 1) {
			rear = -1;
		}
		queArr[++rear] = value;
		nItems++;
	}
}
