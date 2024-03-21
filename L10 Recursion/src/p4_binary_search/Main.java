package p4_binary_search;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 8, 10, 13, 15 };
		System.out.println(binarySearch(arr, 0, arr.length - 1, 100));
	}

	private static int binarySearch(int[] arr, int start, int end, int n) {
		if (start > end) {
			return -1;
		}
		int mid = (start + end) / 2;
		if (arr[mid] == n) {
			return mid;
		} else if (arr[mid] > n) {
			end = mid - 1;
		} else {
			start = mid + 1;
		}
		return binarySearch(arr, start, end, n);
	}

}
