package p2_sequential_search;

public class SequentialSearchDemo {

	public static void main(String[] args) {
		char[] arr = "Hello".toCharArray();
//		boolean isPresent = sequentialSearch(arr, 0, arr.length-1, 'o');
		boolean isPresent = sequentialSearch2(arr, 'o');
		System.out.println(isPresent);
	}

	private static boolean sequentialSearch2(char[] arr, char ch) {
		int start = 0;
		int end = arr.length - 1;

		return sequentialSearch(arr, start, end, ch);

	}

	private static boolean sequentialSearch(char[] arr, int start, int end, char ch) {
		if (start > end) {
			return false;
		}

		if (arr[start] == ch) {
			return true;
		} else {
			return sequentialSearch(arr, start + 1, end, ch);
		}
	}

}
