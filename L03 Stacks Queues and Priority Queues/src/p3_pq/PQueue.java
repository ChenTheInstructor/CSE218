package p3_pq;

public class PQueue {
	private int nElems;
	private int maxSize;
	private int[] queArray;
	
	public PQueue(int maxSize) {
		this.maxSize = maxSize;
		queArray = new int[maxSize];
		nElems = 0;
	}
	
	public void insert(int value) {
		int j;
		if(nElems == 0) {
			queArray[0] = value;
		} else {
			for(j = nElems - 1; j >= 0; j--) {
				if(value > queArray[j]) {
					queArray[j + 1] = queArray[j];
				} else {
					break;
				}
			}
			queArray[j + 1] = value;
		}
		nElems++;
	}
	
	public int peekHighest() {
		return queArray[nElems];
	}
	
	public int remove() {
		return queArray[--nElems];
	}
	
	public int size() {
		return nElems;
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}
	
	public boolean isEmpty() {
		return nElems == 0;
	}
}
