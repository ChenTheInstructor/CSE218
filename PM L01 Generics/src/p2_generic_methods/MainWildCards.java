package p2_generic_methods;

import java.util.ArrayList;

public class MainWildCards {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();// ArrayList is based on array
		list1.add(1);
		list1.add(2);

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("One");
		list2.add("Two");

		ArrayList<Student> list3 = new ArrayList<>();
		list3.add(new Student("A", 1.1));
		list3.add(new Student("B", 2.2));

		showArrayList(list1);
		showArrayList(list2);
		showArrayList(list3);

	}
	
	public static void processArrayList(ArrayList<? extends Comparable> list1) {
		list1.forEach(v -> {
			System.out.println(v + " ");
			System.out.println();
			System.out.println();
		});
	}

	public static void showArrayList(ArrayList<? extends Comparable> list1) {
//		list1.forEach(element -> System.out.println(element);
//		list1.forEach(System.out::print);// method reference
		list1.forEach(MainWildCards::myPrint);
		System.out.println("\n");
	}
	
	public static <E extends Comparable> void myPrint(E value) {
		System.out.print(value + " ");
	}

}
