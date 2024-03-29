package p1_integers;

public class BasicSorting {
	private int[] a;
	private int nElems;
	
	public BasicSorting(int maxSize) {
		a = new int[maxSize];
		nElems = 0;
	}
	
	public void insert(int value) {
		a[nElems++] = value;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public void insertionSort() {
		int in;
		int out;
		for(out = 1; out <nElems; out++) {
			int temp = a[out];
			in = out;
			while(in > 0 && a[in - 1] >= temp) {
				a[in] = a[in - 1];
				in--;
			}
			
			a[in] = temp;
		}
	}
	
	public void selectionSort() {
		int out;
		int in;
		int min;
		
		for(out = 0; out < nElems-1; out++) {
			min = out;
			for(in = out + 1; in < nElems; in++) {
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
		for(out = nElems-1; out >= 1; out--) {
			for(in = 0; in < out; in++) {
				if(a[in] > a[in + 1]) {
					swap(in, in+1);
				}
			}
		}
	}

	private void swap(int dex1, int dex2) {
		int temp = a[dex1];
		a[dex1] = a[dex2];
		a[dex2] = temp;
	}
}
