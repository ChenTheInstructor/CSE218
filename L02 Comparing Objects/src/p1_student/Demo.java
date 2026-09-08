package p1_student;

public class Demo {

	public static void main(String[] args) {
		ArrayBasicSorting arr = new ArrayBasicSorting(10);
		Student s1 = new Student("M", 20);
		arr.insert(s1);
		Student s2 = new Student("B", 21);
		arr.insert(s2);
		Student s3 = new Student("Z", 20);
		arr.insert(s3);
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s3));
		
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareTo(s3));
//		System.out.println(s2.compareTo(s3));
		
//		arr.display();
//		arr.bubbleSort();
//		arr.selectionSort();
//		arr.insertionSort();
//		
//		arr.display();
		
	}

}
