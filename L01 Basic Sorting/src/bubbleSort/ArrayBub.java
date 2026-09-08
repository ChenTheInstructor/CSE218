package bubbleSort;

public class ArrayBub {
	private int[] a;
	private int nElems;
	
	public ArrayBub(int maxSize) {
		a = new int[maxSize];
		nElems = 0;
	}
	
	public void insertionSort() {
		int out;
		int in;
		for(out = 1; out < nElems; out++) {
			in = out;
			int temp = a[out];
			while(in > 0 && a[in - 1] > temp) {
				a[in] = a[in -1];
				in--;
			}
			a[in] = temp;
		}
	}
	
	public void selectionSort() {
		int out;
		int in;
		int min;
		for(out = 0; out < nElems - 1; out++) {
			min =out;
			for(in  = out + 1; in < nElems; in++) {
				if(a[in] < a[min]) {
					min = in;
				}
			}
			swap(out, min);
		}
	}
	
	public void bubbleSort() {
		int out;
		int in;
		int swaps = 0;
		int comparisons = 0;
		for(out = nElems- 1; out >=1; out--) {
			for(in = 0; in < out; in++) {
				comparisons++;
				if(a[in] > a[in + 1]) {
					swap(in, in+1);
					swaps++;
				}
			}
			if(swaps == 0) {
				break;
			}
		}
		System.out.println("Comparisons: " + comparisons);
		System.out.println("Swaps: " + swaps);
		System.out.println("N value: " + nElems);
	}
	
	private void swap(int one, int two) {
		int temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}

	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public void insert(int value) {
		a[nElems++] = value;
	}
}
