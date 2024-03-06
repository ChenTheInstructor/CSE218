package p6;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("M", 1.0);
		Student s2 = new Student("A", 2.0);
		Student s3 = new Student("B", 0.0);
		Student s4 = new Student("Z", 4.0);
		Student s5 = new Student("C", 3.0);
		
		Bag bag = new Bag(100);
		bag.insert(s1);
		bag.insert(s2);
		bag.insert(s3);
		bag.insert(s4);
		bag.insert(s5);
		
//		Comparator<Student> cByName = (st1, st2) -> st1.getName().compareTo(st2.getName());
//		Comparator<Student> cByGPA = (st1, st2) -> Double.compare(st1.getGpa(), st2.getGpa());
//		bag.bubbleSort(cByGPA);
//		bag.display();
//		Student[] foundArr = bag.search(s -> s.getGpa() >= 3.0);
		Student[] foundArr = bag.remove(s -> s.getName().compareTo("B") > 0);
//		System.out.println(Arrays.toString(foundArr));
		System.out.println("What's left in the bag: ");
		bag.display();
	}

}
