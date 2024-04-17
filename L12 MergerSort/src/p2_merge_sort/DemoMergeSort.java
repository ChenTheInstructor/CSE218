package p2_merge_sort;

public class DemoMergeSort {

	public static void main(String[] args) {
//		System.out.println(Long.MIN_VALUE + " " + Integer.MIN_VALUE);
//		System.out.println(Long.MAX_VALUE + " " + Integer.MAX_VALUE);
		
		System.out.println();
		MergeSortArray theArr = new MergeSortArray(100);
		theArr.insert(64);
		theArr.insert(21);
		theArr.insert(33);
		theArr.insert(70);
		theArr.insert(12);
		theArr.insert(85);
		theArr.insert(44);
		theArr.insert(3);
		theArr.display();
		theArr.mergeSort();
		theArr.display();
	}

}
