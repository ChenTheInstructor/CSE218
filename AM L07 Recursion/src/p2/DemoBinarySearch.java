package p2;

public class DemoBinarySearch {

	public static void main(String[] args) {
		int[] a = { 2, 4, 7, 9, 13, 15, 20};
		System.out.println(binarySearch(a, 0, a.length-1, 20));
	}

	private static int binarySearch(int[] a, int start, int end, int n) {
		if (start > end) {
			return -1;
		}
		int mid = (start + end) / 2;
		if (a[mid] == n) {
			return mid;
		} else if (a[mid] < n) {
			start = mid + 1;
		} else {
			end = mid - 1;
		}
		return binarySearch(a, start, end, n);
	}

}
