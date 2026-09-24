package p1_methods;

public class DemoGenericMethods {

	public static void main(String[] args) {
		String[] names = {"A", "B", "C", "D"};
		Integer[] numbers = {1, 2, 3, 4, 5, 6};
		displayArr(names);
		displayArr(numbers);
	}
	
	public static <E> void displayArr(E[] arr) {
		for(E value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
	
//	public static void displayStringArr(String[] a) {
//		for (String s : a) {
//			System.out.print(s + " ");
//		}
//		System.out.println();
//	}
//	
//	public static void displayIntegerArr(Integer[] a) {
//		for (int n : a) {
//			System.out.print(n + " ");
//		}
//		System.out.println();
//	}

}
