package p1;

import java.util.Arrays;
import java.util.function.Predicate;

public class StudentBag {
	private Student[] arr;
	private int nElems;

	public StudentBag(int maxSize) {
		arr = new Student[maxSize];
		nElems = 0;
	}
	
	public Student[] search(Predicate<Student> predicate) {
		Student[] tempArr = new Student[nElems];
		int count = 0;
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				tempArr[count++] = arr[i];
			}
		}
		return Arrays.copyOf(tempArr, count);
	}

//	public Student[] searchByName(String name) {
//		Student[] tempArr = new Student[nElems];
//		int count = 0;
//		for (int i = 0; i < nElems; i++) {
//			if (arr[i].getName().compareTo(name) >= 0) {
//				tempArr[count++] = arr[i];
//			}
//		}
//		return Arrays.copyOf(tempArr, count);
//	}

	public void add(Student s) {
		arr[nElems++] = s;
	}

//	public Student[] searchByGPA(double gpa) {
//		Student[] tempArr = new Student[nElems];
//		int count = 0;
//		for (int i = 0; i < nElems; i++) {
//			if (arr[i].getGpa() >= gpa) {
//				tempArr[count++] = arr[i];
//			}
//		}
//		return Arrays.copyOf(tempArr, count);
//	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
