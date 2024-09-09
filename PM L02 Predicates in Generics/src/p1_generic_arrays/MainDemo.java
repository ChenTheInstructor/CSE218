package p1_generic_arrays;

import java.util.Arrays;

public class MainDemo {

	public static void main(String[] args) {
		Student s1 = new Student("A", 1.1);
		Student s2 = new Student("B", 2.1);
		Student s3 = new Student("C", 3.1);
		Student s4 = new Student("D", 4.0);
		
		GenericBag<Student> theBag = new GenericBag<>(Student.class, 10);
		theBag.add(s1);
		theBag.add(s2);
		theBag.add(s3);
		theBag.add(s4);
		
		theBag.display();
		
//		Student[] arrFound = theBag.search(Student.class, s -> (s.getName().compareTo("B") > 0));
		Student[] arrFound = theBag.search(Student.class, s -> s.getGpa() > 3.0);
		System.out.println(Arrays.toString(arrFound));
		
	}

}
