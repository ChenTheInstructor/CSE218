package p2_equals_hashcode;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("A", 3.5);
		Student s2 = new Student("A", 3.4);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
//		String str1 = "Hi"; // intern property
//		String str2 = "Hi";// shallow copy
//		String str3 = "Hi";
//		System.out.println(str1.equals(str3));
	}

}
