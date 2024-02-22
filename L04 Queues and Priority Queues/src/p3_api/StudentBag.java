package p3_api;

import java.util.Comparator;

public class StudentBag {
	private Student[] arr;
	private int nElems;

	public StudentBag(int maxSize) {
		arr = new Student[maxSize];
	}

	public void insert(Student s) {
		arr[nElems++] = s;
	}

	public void bubbleSort() {
		int in;
		int out;

		for (out = nElems - 1; out >= 1; out--) {
			for (in = 0; in < out; in++) {
				if (arr[in].compareTo(arr[in + 1]) > 0) {
					swap(in, in + 1);
				}
			}

		}
	}

	public void bubbleSort(Comparator<Student> comparator) {
		int in;
		int out;

		for (out = nElems - 1; out >= 1; out--) {
			for (in = 0; in < out; in++) {
				if (comparator.compare(arr[in], arr[in + 1]) > 0) {
					swap(in, in + 1);
				}
			}

		}
	}

	private void swap(int aIndex, int bIndex) {
		Student temp = arr[aIndex];
		arr[aIndex] = arr[bIndex];
		arr[bIndex] = temp;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
