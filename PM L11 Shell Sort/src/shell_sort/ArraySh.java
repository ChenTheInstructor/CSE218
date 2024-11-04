package shell_sort;

public class ArraySh {
	private long[] theArray;
	private int nElems;

	public ArraySh(int maxSize) {
		theArray = new long[maxSize];
		nElems = 0;
	}

	public void shellSort() {
		int inner;
		int outer;
		long temp;

		// find initial value of h
		int h = 1;
		while (h <= nElems / 3) {
			h = h * 3 + 1;
		}

		while (h > 0) { // decreasing h, until h = 1; 4, 1
			for (outer = h; outer < nElems; outer++) { // h-sort
				temp = theArray[outer];
				inner = outer;

				while (inner > h - 1 && theArray[inner - h] >= temp) {
					theArray[inner] = theArray[inner - h];
					inner -= h;
				}
				theArray[inner] = temp;
			}
			h = (h - 1) / 3; // decrease h
		}
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}

	public void insert(long value) {
		theArray[nElems++] = value;
	}
}
