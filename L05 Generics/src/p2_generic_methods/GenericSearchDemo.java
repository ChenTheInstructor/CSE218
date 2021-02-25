package p2_generic_methods;

public class GenericSearchDemo {

	public static void main(String[] args) {
		String[] strs = {"J", "B", "A", "K"};
		Integer[] numbers = {5, 3, 7, 2, 9, 1};
		Name[] names = {new Name("F", "M"), new Name("Z", "K"),new Name("A", "F")};
		Student[] students = {new Student("A", 1.5), new Student("B", 1.5), new Student("C", 1.5)};
		
//		System.out.println(searchArray(strs, "Z"));
//		System.out.println(searchArray(numbers, 10));
//		System.out.println(searchArray(names, new Name("a", "f")));
//		System.out.println(searchArray(students, new Student("Z", 2.0)));
		
		displayArray(numbers);
		displayArray(strs);
		displayArray(students);
	}
	
	// upperbound constraint
	private static <E extends Comparable<E>> int searchArray(E[] a, E key) {
		int index = 0;
		int position = -1;
		boolean found = false;
		while(!found && index<a.length) {
			if(a[index].compareTo(key) == 0) {
				found = true;
				position = index;
			}
			index++;
		}
		return position;
		
	}
	
	public static <E> void displayArray(E[] a) {
		for(E e : a) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
//	public static void displayArray(Integer[] a) {
//		for( Integer i : a) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//	}
//	
//	public static void displayArray(String[] a) {
//		for( String i : a) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//	}
	
//	private static int searchStringArray(String[] a, String key) {
//		int index = 0;
//		int position = -1;
//		boolean found = false;
//		
//		
//		while(!found && index < a.length) {
//			if(a[index].compareTo(key) == 0) {
//				found  = true;
//				position = index;
//			}
//			index++;
//		}
//		return position;
//	}
//	
//	private static int searchIntegerArray(Integer[] a, Integer key) {
//		int index = 0;
//		int position = -1;
//		boolean found = false;
//		
//		
//		while(!found && index < a.length) {
//			if(a[index]==key) {
//				found  = true;
//				position = index;
//			}
//			index++;
//		}
//		return position;
//	}

}
