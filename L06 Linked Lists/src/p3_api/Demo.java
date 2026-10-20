package p3_api;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		ListIterator iter1 = list.listIterator();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.forEach(System.out::println);// method reference
		list.forEach(e -> System.out.print(e + " ")); // simple consumer
		
		
	}

}
