package p6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class Bag {
	private Student[] arr;
	private int nElems;
	
	public Bag(int maxSize) {
		arr = new Student[maxSize];
		nElems = 0;
	}
	
	public void insert(Student s) {
		arr[nElems++] = s;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	public Student[] remove(Predicate<Student> predicate) {
		Student[] matchArr = new Student[nElems];
		int matchCount = 0;
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				matchArr[matchCount++] = arr[i];
				for(int j = i; j < nElems - 1; j++) {
					arr[j] = arr[j + 1];
				}
				nElems--;
				i--;
			}
		}
		
		return Arrays.copyOf(matchArr, matchCount);
	}
	
	public Student[] search(Predicate<Student> predicate) {
		Student[] matchedArr = new Student[nElems];
		int matchCount = 0;
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				matchedArr[matchCount++] = arr[i];
			}
		}
		return Arrays.copyOf(matchedArr, matchCount);
	}
	
	public void bubbleSort(Comparator< Student> c) {
		int in;
		int out;
		for(out = nElems -1; out > 0; out--) {
			for(in = 0; in < out; in++) {
				if(c.compare(arr[in], arr[in + 1]) > 0) {
					swap(in, in + 1);
				}
			}
		}
	}

	private void swap(int index1, int index2) {
		Student temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
}
