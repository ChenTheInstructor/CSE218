package p1;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		Bag<Student> bag = new Bag<>(Student.class, 10);
		Student s1 = new Student("M", 3.0);
		Student s2 = new Student("B", 3.1);
		Student s3 = new Student("K", 1.0);
		Student s4 = new Student("G", 2.1);
		Student s5 = new Student("Z", 1.9);
		Student s6 = new Student("N", 4.0);
		bag.add(s1);
		bag.add(s2);
		bag.add(s3);
		bag.add(s4);
		bag.add(s5);
		bag.add(s6);
		bag.display();
		System.out.println();
		Student[] a1 = bag.search(new MyPredicate());
		System.out.println(Arrays.toString(a1));
	}

}
