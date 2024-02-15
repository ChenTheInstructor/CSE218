package p3_apply_functional_programming;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {

	public static void main(String[] args) {
		Student s1 = new Student("M", 2.1);
		Student s2 = new Student("Z", 1.1);
		Student s3 = new Student("A", 3.1);
		
		Student[] a = {s1, s2, s3};
		
//		Arrays.sort(a, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return Double.compare(o1.getGpa(), o2.getGpa());
//			}
//			
//		});
		
		
		Comparator<Student> c = (o1, o2) -> Double.compare(o1.getGpa(), o2.getGpa());
		Arrays.sort(a, c);
		System.out.println(Arrays.toString(a));
	}

}
