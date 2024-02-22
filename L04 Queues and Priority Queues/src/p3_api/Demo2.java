package p3_api;

public class Demo2 {

	public static void main(String[] args) {
		Student s1 = new Student("A", 4.0);
		Student s2 = new Student("Z", 1.0);
		Student s3 = new Student("M", 2.0);
		StudentBag bag = new StudentBag(10);
		bag.insert(s1);
		bag.insert(s2);
		bag.insert(s3);

		bag.bubbleSort();
		bag.display();

		bag.bubbleSort((st1, st2) -> Double.compare(st1.getGpa(), st2.getGpa()));
		bag.display();
	}

}
