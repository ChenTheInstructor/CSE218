package p3_queues;

public class Queue {
	private long[] queArray;
	private int nElems;
	private int maxSize;
	private int front;
	private int rear;
	
	public Queue(int maxSize) {
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		this.maxSize = maxSize;
		nElems = 0;
	}
	
	public void insert(long value) { // the queue (array) is not full
		if(rear == maxSize -1) {
			rear  = -1;
		}
		
		queArray[++rear] = value;
		nElems++;
	}
	
	public long remove() {
		long temp = queArray[front++];
		if(front == maxSize) { // wrap-around
			front = 0;
		}
		nElems--;
		return temp;
	}
	
	public long peekFront() {
		return queArray[front];
	}

	public boolean isEmpty() {
		return nElems == 0;
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}
	
	public int size() {
		return nElems;
	}
}
