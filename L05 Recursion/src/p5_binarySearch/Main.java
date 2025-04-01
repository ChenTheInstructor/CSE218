package p5_binarySearch;

public class Main {

	public static void main(String[] args) {
		Integer[] arr = {2, 5, 8, 9, 10, 24};
		System.out.println(binarySearch(arr, 20));
	}
	
	public static <T extends Comparable<T>> int binarySearch(T[] arr, T key) {
		return binarySearchHelper(arr, key, 0, arr.length-1);
	}

	private static <T extends Comparable<T>> int binarySearchHelper(T[] arr, T key, int start, int end) {
		
		if(start > end) {
			return -1;
		}
		
		int mid = (start + end) / 2;
		if(arr[mid].equals(key)) {
			return mid;
		}
		if(arr[mid].compareTo(key) > 0) {
			return binarySearchHelper(arr, key, start, mid - 1);
		} else {
			return binarySearchHelper(arr, key, mid + 1, end);
		}
	}

}
