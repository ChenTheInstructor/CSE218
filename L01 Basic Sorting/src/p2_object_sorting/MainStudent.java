package p2_object_sorting;

import java.util.Arrays;

public class MainStudent {

	public static void main(String[] args) {
		Student s1 = new Student("A", 2.5);
		Student s2 = new Student("B", 1.5);
		Student s3 = new Student("Z", 3.5);
		Student s4 = new Student("M", 0.5);
//		System.out.println(s1.compareTo(s2));
		
		Student[] a = {s1, s2, s3, s4};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
