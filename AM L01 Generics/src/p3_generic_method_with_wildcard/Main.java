package p3_generic_method_with_wildcard;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("One");
		list2.add("Two");
		
		ArrayList<Student> list3 = new ArrayList<>();
		list3.add(new Student("A", 1.1));
		list3.add(new Student("B", 2.2));	
		
		showList(list1);
//		showList(list2);
//		showList(list3);
	}

	public static void showList(ArrayList<? extends/*super*/  Number> list) {
//		list.forEach(n -> System.out.print(n + " "));
//		list.forEach(System.out::print); // method reference
//		System.out.println();
		list.forEach(Main::myPrint);
	}
	
	public static <T> void myPrint(T n) {
		System.out.print(n + " ");
	}
}
