package p1_student;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Student[] arr = { new Student("M", 2.0), new Student("Z", 1.0), new Student("C", 3.5) };
		System.out.println(Arrays.toString(arr));
		
		// create a new separate Comparator class named StudentComparator
//		Arrays.sort(arr, new StudentComparator());
		
		// anonymous class 
//		Arrays.sort(arr, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//
//		});
		
		// use lambda expression
		Arrays.sort(arr, (o1, o2) -> Double.compare(o1.getGpa(), o2.getGpa()));
		
		System.out.println(Arrays.toString(arr));
	}

}
