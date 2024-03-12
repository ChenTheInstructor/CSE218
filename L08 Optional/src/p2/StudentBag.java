package p2;

import java.util.Optional;
import java.util.function.Predicate;

public class StudentBag {
	private Student[] arr;
	private int nElems;

	public StudentBag(int maxSize) {
		super();
		arr = new Student[maxSize];
	}
	
	public Optional<Student> search(Predicate<Student> predicate) {
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				return Optional.of(arr[i]);
			}
		}
		return Optional.ofNullable(null);
	}

	public void add(Student s) {
		arr[nElems++] = s;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
