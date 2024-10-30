package p2_merge_sort;

public class DemoMergeSort {

	public static void main(String[] args) {
		MergeSortArray theArray = new MergeSortArray(10);
		theArray.insert(30);
		theArray.insert(10);
		theArray.insert(70);
		theArray.insert(40);
		theArray.insert(60);
		theArray.insert(20);
		theArray.insert(80);
		theArray.insert(50);
		theArray.display();
		theArray.mergeSort();
		theArray.display();
	}

}
