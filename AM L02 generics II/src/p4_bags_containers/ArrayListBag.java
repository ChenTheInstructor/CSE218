package p4_bags_containers;

import java.util.ArrayList;

public class ArrayListBag <T extends Comparable> {
	private ArrayList<T> list;

	public ArrayListBag(int initialSize) {
		list = new ArrayList<>(initialSize);
	}
	
	public void add(T value) {
		list.add(value);
	}
	
	public boolean contains(T value) {
		return list.contains(value);
	}
}
