package p4_priority_queue;

public class PriorityQ {
	private int maxSize;
	private long[] queArray;
	private int nElems;

	public PriorityQ(int maxSize) {
		queArray = new long[maxSize];
		this.maxSize = maxSize;
		nElems = 0;
	}

	public void insert(long value) {
		int j;
		if (nElems == 0) { // if array is empty
			queArray[nElems++] = value;
		} else { // if array not empty
			for (j = nElems - 1; j >= 0; j--) {
				if (value > queArray[j]) { // if new item larger
					queArray[j + 1] = queArray[j]; // shift upward
				} else { // if new item smaller
					break;
				}
			}
			queArray[j + 1] = value; // insert the value
			nElems++;
		}
	}

	public long remove() {
		return queArray[--nElems];
	}
	
	public boolean isEmpty() {
		return nElems == 0;
	}

	public long peekMin() {
		return queArray[nElems - 1];
	}

	public boolean isFull() {
		return nElems == maxSize;
	}
}
