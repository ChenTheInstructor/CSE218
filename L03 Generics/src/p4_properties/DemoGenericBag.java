package p4_properties;

import java.util.Arrays;

public class DemoGenericBag {

	public static void main(String[] args) {
		GenericBag<Student> bag1 = new GenericBag<>(Student.class, 10);
		
		bag1.add(new Student("A", 2.5));
		bag1.add(new Student("D", 1.1));
		bag1.add(new Student("Z", 3.5));
		bag1.add(new Student("D", 3.1));
		bag1.add(new Student("M", 1.5));
		bag1.add(new Student("D", 2.1));
		
//		bag1.display();
//		Student[] sArr = bag1.search(Student.class, (Student student) -> student.getName().equals("D"));
		Student[] sArr = bag1.search(Student.class, (Student student) -> student.getGpa() >= 2.5);
		
		System.out.println(Arrays.toString(sArr));
	}

}
