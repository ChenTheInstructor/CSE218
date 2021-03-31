package p2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Adam");
		list.add("Billy");
		list.add("Cathy");
		list.add("Dave");
		list.add("David");
		list.add("Cathie");
		
		LinkedList<String> copy = (LinkedList<String>) list.clone();
		list.set(1, "B");
		System.out.println(list);
		
		ListIterator<String> iter1 = list.listIterator();
		while(iter1.hasNext()) {
			String str = iter1.next();
			if(str.startsWith("D")) {
				System.out.println(str);
			}
		}
	}

}
