package p2_generic_methods;

public class Main {

	public static void main(String[] args) {
		Integer[] a1 = {1, 2, 3, 4, 5};
		Double[] a2 = {1.1, 2.2, 3.3};
		Student[] a3 = {new Student("A", 1.1), new Student("B", 2.2), new Student("C", 3.3)};
//		showIntegerArr(a1);
//		showDoubleArr(a2);
//		showStudentArr(a3);
		showArr(a1);
		showArr(a2);
		showArr(a3);
	}
	//generic method
	public static <E extends Comparable> void showArr(E[] a) { // upper bound constraint
		for(E e : a) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

//	private static void showStudentArr(Student[] a3) {
//		for(Student s : a3) {
//			System.out.print(s + "\n");
//		}
//		System.out.println();
//	}
//
//	private static void showDoubleArr(Double[] a2) {
//		for(Double dd : a2) {
//			System.out.print(dd + "") ;
//		}
//		System.out.println();
//	}
//
//	private static void showIntegerArr(Integer[] a1) {
//		for(Integer n : a1) {
//			System.out.print(n + " ");
//		}
//		System.out.println();
//	}

}
