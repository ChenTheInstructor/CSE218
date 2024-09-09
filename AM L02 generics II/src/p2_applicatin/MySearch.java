package p2_applicatin;

public class MySearch {

	public static <E extends Comparable> boolean sequentialSearch(E[] arr, E value) {
		for(E n : arr) {
			if (n.compareTo(value)==0) {
				return true;
			}
		}
		return false;

	}

}
