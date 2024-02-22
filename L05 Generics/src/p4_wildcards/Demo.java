package p4_wildcards;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Double> list1 = new ArrayList<>();
		list1.add(1.10);
		list1.add(1.1);
		displayList(list1);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("One");
		list2.add("Two");
		displayList(list2);
		
	}
	
	public static void displayList(ArrayList<? extends Comparable> list) {
		list.forEach(n -> System.out.println(n));
	}

}
