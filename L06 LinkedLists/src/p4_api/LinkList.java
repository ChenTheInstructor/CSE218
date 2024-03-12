package p4_api;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList {
	LinkedList<Integer> list;

	public LinkList() {
		list = new LinkedList<>();
	}

	public void add(Integer n) {
		list.addLast(n);
	}

	public void display() {
		ListIterator iter1 = list.listIterator();
		ListIterator iter2 = list.listIterator();
		for (int i = 0; i < 5; i++) {
			iter1.next();
		}
//		iter1.forEachRemaining((n) -> System.out.println(n));
		iter1.forEachRemaining(System.out::println);
		System.out.println();
		iter2.forEachRemaining(System.out::println);
	}

}
