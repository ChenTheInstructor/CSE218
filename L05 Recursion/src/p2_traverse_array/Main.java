package p2_traverse_array;

public class Main {

	public static void main(String[] args) {
		String[] arr = {"A", "M", "C", "Z"};
//		showArr(arr, 2);
		showWholeArray(arr);
	}

	private static void showWholeArray(String[] arr) {
		showArrHelper(arr, 0);
	}

	private static void showArrHelper(String[] arr, int i) {
		if(i == arr.length) {
			return;
		}
		System.out.println(arr[i]);
//		i++;
		showArrHelper(arr, ++i);
		
	}

}
