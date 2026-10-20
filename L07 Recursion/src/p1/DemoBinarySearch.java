package p1;

public class DemoBinarySearch {

	public static void main(String[] args) {
		int[] a = {2, 4, 7, 9, 12, 15};
//		System.out.println(binarySearch(a, 0, a.length-1, 20));
		System.out.println(binarySearch(a, 9));
	}
	
	public static int binarySearch(int[] arr, int key) { // wrapper method
		return binarySearch(arr, 0, arr.length-1, key);
	}

	private static int binarySearch(int[] arr, int start, int end, int key) {
		int mid = (start + end) / 2;
		
		if(start > end) { // basecase
			return -1;
		}
		
		if(arr[mid] == key) {
			return mid;
		} else if(arr[mid] > key) {
			end = mid - 1;
		} else {
			start = mid + 1;
		}
		
		return binarySearch(arr, start, end, key);
	}

}
