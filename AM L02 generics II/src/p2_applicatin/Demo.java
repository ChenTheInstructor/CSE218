package p2_applicatin;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("A", 1.1);
		Student s2 = new Student("A", 1.1);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
