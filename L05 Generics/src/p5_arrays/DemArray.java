package p5_arrays;

public class DemArray {

	public static void main(String[] args) {
		Bag<Student> bag = new Bag<>(10);
		Student s1 = new Student("B", 1.2);
		Student s2 = new Student("C", 3.2);
		Student s3 = new Student("A", 2.2);

		bag.insert(s1);
		bag.insert(s2);
		bag.insert(s3);
		bag.display();
		
		Student found = bag.search(s -> s.getName().equals("C"));
		System.out.println(found);
	}

}
