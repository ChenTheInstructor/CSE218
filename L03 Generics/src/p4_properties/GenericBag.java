package p4_properties;

public class GenericBag <T> {
	private T[] arr;
	private int nItems;
	
	public GenericBag(int maxSize) {
		arr = (T[])(new Object[maxSize]);
		nItems = 0;
	}
	
	public void add(T value) {
		arr[nItems++] = value;
	}
	
	public void display() {
		for(int i = 0; i < nItems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
}
