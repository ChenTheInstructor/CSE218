package p1;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		Bag<Student> bag = new Bag<>(Student.class, 6);
		Student s1 = new Student("A", 1.0);
		Student s2 = new Student("B", 2.1);
		Student s3 = new Student("C", 3.0);
		Student s4 = new Student("D", 4.1);
		Student s5 = new Student("E", 5.9);
		Student s6 = new Student("F", 6.0);
		bag.add(s1);
		bag.add(s2);
		bag.add(s3);
		bag.add(s4);
		bag.add(s5);
		bag.add(s6);
		bag.display();
		System.out.println();
		Student[] a1 = bag.remove(s -> s.getName().compareTo("C") >= 0);
		System.out.println("\nBag content after deletion: ");
		bag.display();
		System.out.println("The size of the bag: " + bag.size());
		System.out.println("\nDeleted items: ");
		System.out.println(Arrays.toString(a1));
		System.out.println();
		
	}

}
