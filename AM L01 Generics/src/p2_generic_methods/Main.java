// Generics uses placeholders during the development of the classes and methods
// The placeholders are to be replaced with the exact referece type during compilation
package p2_generic_methods;

public class Main {

	public static void main(String[] args) {
		Integer[] a1 = {1, 2, 3, 4, 5};
		Double[] a2 = {1.1, 2.2, 3.3, 4.4};
		Student[] a3 = {new Student("A", 1.1), new Student("B", 2.2)};
		
//		showArr(a1);
//		showArr(a2);
//		showArr(a3);
//		showArr(a1, a2, a3);
//		showIntergerArr(a1);
//		showDoubleArr(a2);
//		showStudentArr(a3);
				
	}
	
	// generic method with upperbound constraint
	public static <E extends Comparable> void showArr(E[] a) {
		for(E value : a) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
	
	public static <E1, E2, E3> void showArr(E1[] a, E2[] b, E3[] c) {
		for(E1 value : a) {
			System.out.print(value + " ");
		}
		System.out.println();
		for(E2 value : b) {
			System.out.print(value + " ");
		}
		System.out.println();
		for(E3 value : c) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

//	private static void showStudentArr(Student[] a3) {
//		for(Student s : a3) {
//			System.out.print(s + " ");
//		}
//		System.out.println();
//	}
//
//	private static void showDoubleArr(Double[] a2) {
//		for(Double n : a2) {
//			System.out.print(n + " ");
//		}
//		System.out.println();
//	}
//
//	private static void showIntergerArr(Integer[] a1) {
//		for(Integer n : a1) {
//			System.out.print(n + " ");
//		}
//		System.out.println();
//	}

}
