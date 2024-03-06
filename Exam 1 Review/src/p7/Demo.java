package p7;

import java.util.ArrayList;
import java.util.Comparator;



public class Demo {

	public static void main(String[] args) {
		
		Student s1 = new Student("M", 1.0);
		Student s2 = new Student("X", 2.0);
		Student s3 = new Student("N", 0.2);
		Student s4 = new Student("Z", 4.0);
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		
		Student s5 = new Student("K", 3.9);
		Student s6 = new Student("M", 1.1);
		Student s7 = new Student("A", 2.5);
		ArrayList<Student> list2 = new ArrayList<>();
		list2.add(s5);
		list2.add(s6);
		list2.add(s7);
		
		Student s8 = new Student("Y", 0.8);
		Student s9 = new Student("Z", 4.1);
		ArrayList<Student> list3 = new ArrayList<>();
		list3.add(s8);
		list3.add(s9);
		
		ArrayList<ArrayList<Student>> mainList = new ArrayList<>();
		mainList.add(list3);
		mainList.add(list1);
		mainList.add(list2);
		
		Comparator<Student> cByName = (st1, st2) -> st1.getName().compareTo(st2.getName());
		Comparator<Student> cByGPA = (st1, st2) -> Double.compare(st1.getGpa(), st2.getGpa());
		
		ArrayList<Student> mergedList = ListMerger.getMergedList(mainList, cByGPA);
		mergedList.forEach(s -> System.out.println(s));
	}

}
