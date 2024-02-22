package p2_generic_methods;

public class Demo {

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Double[] arr2 = { 1.1, 2.2, 3.3, 4.4 };
		Student[] arr3 = {new Student("A", 1.1),new Student("B", 2.1),new Student("C", 13.1)}; 
//		displayIntArray(arr1);
//		displayDoubleArray(arr2);
		displayArray(arr1);
		displayArray(arr2);
		displayArray(arr3);
	}
	
	private static <E> void displayArray(E[] arr1) {
		for(E n : arr1) {
			System.out.println(n);
		}
		System.out.println();
	}

//	private static void displayDoubleArray(double[] arr2) {
//		for (double n : arr2) {
//			System.out.println(n);
//		}
//		System.out.println();
//	}
//
//	private static void displayIntArray(int[] arr1) {
//		for (int n : arr1) {
//			System.out.println(n);
//		}
//		System.out.println();
//	}

}
