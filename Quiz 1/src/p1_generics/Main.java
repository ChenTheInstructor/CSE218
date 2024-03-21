package p1_generics;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>();
		LinkedList<Double> list2 = new LinkedList<>();
		LinkedList<Integer> list3 = new LinkedList<>();
		LinkedList<Book> bookList = new LinkedList<>();

		sort2(list1);
		sort2(list2);
		sort2(list3);
		sort2(bookList);
	}

	public static <T extends Comparable<T>> void sort2(LinkedList<T> list) {
		Collections.sort(list);
	}

	public static void sort1(LinkedList<? extends Comparable> list) {
		Collections.sort(list);
	}

//	public static <T> void sort5(LinkedList<T> list) { // not generic
//		Collections.sort(list);
//	}

//	public static  LinkedList<T> sort4(LinkedList<T> list) { // not generic
//		Collections.sort(list);
//		return list;
//	}

//	public static <T> void sort3(LinkedList<T> list) {
//		Collections.sort(list);
//	}

}
