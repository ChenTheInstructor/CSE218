package p3_insertion_sort;

public class ArrayInsertion {
	private int[] a;
	private int nElems;

	public ArrayInsertion(int maxSize) {
		a = new int[maxSize];
		nElems = 0;
	}

	public void insertionSort() {
		int out;
		int in;
		for (out = 1; out < nElems; out++) {
			in = out;
			int temp = a[out];
			while (in > 0 && a[in - 1] >= temp) {
				a[in] = a[in - 1];
				in--;
			}
			a[in] = temp;
		}
	}

	
	public void insert(int value) {
		a[nElems++] = value;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
