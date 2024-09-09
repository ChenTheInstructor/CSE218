package p5;

public class ArrayBag <T> {
	private T[] arr;
	private int nElems;
	
	public ArrayBag(int maxSize) {
		arr = (T[])(new Object[maxSize]);
	}
}
