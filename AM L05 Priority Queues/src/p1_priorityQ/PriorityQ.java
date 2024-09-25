package p1_priorityQ;

public class PriorityQ {
	private long[] queArray;
	private int maxSize;
	private int nItems;
	
	public PriorityQ(int maxSize) {
		this.maxSize = maxSize;
		queArray = new long[maxSize];
		nItems = 0;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
	
	public long peekMin() {
		return queArray[nItems - 1];
	}
	
	public long remove() {
		return queArray[--nItems];
	}
	
	public void insert(long value) {
		int j;
		if(nItems == 0) {
			queArray[nItems++] = value;
		} else {
			for(j = nItems - 1; j >= 0; j--) {
				if(value > queArray[j]) { // if new value is larger
					queArray[j + 1] = queArray[j]; // shift upward
				} else {
					break;
				}
			}
			queArray[j + 1] = value;
			nItems++;
		}
	}
}
