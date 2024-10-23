package p1_apps;

public class RecursiveBinarySearch {
	public static void main(String[] args) {
//		System.out.println("Adam".compareTo("Gina"));
		String[] a = {"Adam", "Bill", "Cathy", "Dave", "Ellen", "Fran", "Gina" };
		System.out.println(binarySearchEntireArray(a, "Ellen"));
	}
	
	public static int binarySearchEntireArray(String[] a, String name) {
		return binarySearch(a, 0, a.length-1, name);
	}

	private static int binarySearch(String[] a, int start, int end, String name2Find) {
		if(start > end) {
			return -1;
		}
		int mid = (start + end) / 2;
		if(a[mid].equals(name2Find)) {
			return mid;
		} else if(a[mid].compareTo(name2Find) > 0) {
			end = mid - 1;
		} else {
			start = mid + 1;
		}
		return binarySearch(a, start, end, name2Find);
	}

}
