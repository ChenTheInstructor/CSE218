package p2_mergeSort;

public class MergeSortArray {
	private int[] theArray;
	private int nElems;
	
	public MergeSortArray(int maxSize) {
		theArray = new int[maxSize];
		nElems  = 0;
	}
	
	public void mergeSort() {
		int[] workspace = new int[nElems];
		recMergeSort(workspace, 0, nElems-1);
	}
	
	public void recMergeSort(int[] workspace, int lowerBound, int upperBound) {
		if(lowerBound == upperBound) { // base case
			return;
		} else {
			int mid = (lowerBound + upperBound) / 2;
			recMergeSort(workspace, lowerBound, mid);
			recMergeSort(workspace, mid+1, upperBound);
			merge(workspace, lowerBound, mid+1, upperBound);
			
		}
	}
	
	public void merge(int[] workspace, int lowPtr, int highPtr, int upperBound) {
		int j = 0; // index for workspace
		int lowerBound = lowPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1; // number of data items in the array
		
		// lowPtr is aIndex, highPtr is bIndex, j is cIndex
		
		while(lowPtr <= mid && highPtr <= upperBound) { //neither sub-array is done
			if(theArray[lowPtr] < theArray[highPtr]) {
				workspace[j++] = theArray[lowPtr++];
			} else {
				workspace[j++] = theArray[highPtr++];
			}
		}
		
		while(lowPtr <= mid) { // the upper half of the array is done copying
			workspace[j++] = theArray[lowPtr++];
		}
		
		while(highPtr <= upperBound) { // the lower half of the array is done copying
			workspace[j++] = theArray[highPtr++];
		}
		
		for(j = 0; j < n; j++) { //copy sorted data back to the original array from workspace
			theArray[lowerBound + j] = workspace[j];
		}
	}
	
	public void insert(int value) {
		theArray[nElems++] = value;
	}
	
	public void display() {
		for(int i = 0 ; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}

}
