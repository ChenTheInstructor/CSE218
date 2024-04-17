package p2_merge_sort;

public class MergeSortArray {
	private long[] theArray;
	private int nElems;

	public MergeSortArray(int maxSize) {
		theArray = new long[maxSize];
		nElems = 0;
	}
	
	public void mergeSort() {
		long[] workspace = new long[nElems];
		recMergeSort(workspace, 0, nElems-1);
	}
	
	public void recMergeSort(long[] workspace, int lowerBound, int upperBound) {
		if(lowerBound == upperBound) {
			return;
		} else {
			int mid = (lowerBound + upperBound)/ 2; // find midpoint
			recMergeSort(workspace, lowerBound, mid); // sort low half
			recMergeSort(workspace, mid+1, upperBound); // sort high half
			merge(workspace, lowerBound, mid+1, upperBound); // merge two halves
			// lowerBound: lowerBound of array A, mid+1: lowerbound of array B,
			// upperBound: upperBound of array B.
		}
		
	}



	public void merge(long[] workspace, int lowPtr, int highPtr, int upperBound) {
		// lowPtr: starting point of low-half 
		// highPtr: starting point of high-half subarray
		// upperBound: the upper bound of the high-half subarray
		int j = 0; // workspace index
		int lowerBound = lowPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1; // # of data items
		
		while(lowPtr <= mid && highPtr <= upperBound) { // neither subarray is done
			if(theArray[lowPtr] < theArray[highPtr] ) {
				workspace[j++] = theArray[lowPtr++];
			} else {
				workspace[j++] = theArray[highPtr++];
			}
		}
		
		while(lowPtr <= mid) { // high-half is done
			workspace[j++] = theArray[lowPtr++];
		}
		
		while(highPtr <= upperBound) { // low-half is done
			workspace[j++] = theArray[highPtr++];
		}
		
		for(j = 0; j < n;  j++) {
			theArray[lowerBound + j] = workspace[j];
		}
	}

	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}
	
	public void insert(long value) {
		theArray[nElems++] = value;
	}
}
