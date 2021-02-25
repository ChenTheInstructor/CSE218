package p5_api;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>();
		ListIterator iter1 = (ListIterator) list1.iterator();
		list1.add("A");
		list1.add("b");
		iter1.next();
	}

}
