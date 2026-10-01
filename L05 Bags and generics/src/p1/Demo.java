package p1;

import java.util.Arrays;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
		StudentBag bag = new StudentBag(10);
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
//		Student[] a1 = bag.searchByName("K");
		Student[] a1 = bag.search((Student s) -> s.getName().compareTo("K") >= 0 && s.getGpa() <= 2.5);
		
		
		System.out.println(Arrays.toString(a1));
		System.out.println();
		Student[] a2 = bag.search(new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				return t.getGpa() >= 3.0;
			}
			
		});
		System.out.println(Arrays.toString(a2));
		
		System.out.println();
		Student[] a3 = bag.search(s -> s.getGpa() >= 3.0);
		System.out.println(Arrays.toString(a2));

	}

}
