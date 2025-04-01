package p4_sequential_search;

public class Main {

	public static void main(String[] args) {
		String[] arr = { "A", "B", "Z", "M", "D" };
		System.out.println(seqSearch(arr, "D"));
	}

	private static int seqSearch(String[] arr, String key) {

		return searchHelper(arr, key, 0);
	}

	private static int searchHelper(String[] arr, String key, int i) {
		if (i == arr.length) {
			return -1;
		}
		if (arr[i].equals(key)) {
			return i;
		} else {
			return searchHelper(arr, key, ++i);
		}
	}

}
