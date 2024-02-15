package p3_apply_functional_programming;

import java.util.function.Predicate;

public class StudentBag {
	private Student[] arr;
	private int nElems;
	
	public StudentBag(int maxSize) {
		arr = new Student[maxSize];
	}
	
	public void insert(String name, double gpa) {
		Student s = new Student(name, gpa);
		arr[nElems++] = s;
	}
	
	public Student search(Predicate<Student> predicate) {
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				return arr[i];
			}
		}
		return null;
	}
}
