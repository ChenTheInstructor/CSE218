package p2_merge_sort;

public class DemoMergeSort {

	public static void main(String[] args) {
		MergeSortArray theArr = new MergeSortArray(100);
		theArr.insert(53);
		theArr.insert(43);
		theArr.insert(71);
		theArr.insert(18);
		theArr.insert(9);
		theArr.insert(69);
		theArr.insert(84);
		theArr.insert(42);
		theArr.display();
		theArr.mergeSort();
		theArr.display();
	}

}
