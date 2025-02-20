package p3_priorityq;

public class PriorityQ {
	private int maxSize;
	private long[] queArr;
	private int nItems;

	public PriorityQ(int maxSize) {
		this.maxSize = maxSize;
		queArr = new long[maxSize];
		nItems = 0;
	}

	public void insert(long value) {
		int j = 0;
		if (nItems == 0) {
			queArr[nItems++] = value;
		} else {
			for (j = nItems - 1; j >= 0; j--) {
				if (value < queArr[j]) {
					queArr[j + 1] = queArr[j];
				} else {
					break;
				}
			}
			queArr[j + 1] = value;
			nItems++;
		}

	}
	
	public long remove() {
		return queArr[--nItems];
	}
}
