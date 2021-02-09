package p2_classes_objects;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("John");
		s1.setGpa(3.5);
		s1.curveGpa(0.2);
		System.out.println(s1.getName() + ": " + s1.getGpa());
		System.out.println("School: " + s1.getSchoolName());
		System.out.println("---------------------------------");
		Student s2 = new Student();
		s2.setName("Joe");
		s2.setGpa(3.0);
		s2.curveGpa(0.4);
		System.out.println(s2.getName() + ": " + s2.getGpa());
		System.out.println("School: " + s2.getSchoolName());
		
		System.out.println("-----------------------------------");
		s1.setSchoolName("NCCC");
		System.out.println("School: " + s1.getSchoolName());
		System.out.println("School: " + s2.getSchoolName());
		System.out.println("-----Using Static Method to Change School Name-----");
		Student.changeSchoolName("SBU");
		System.out.println("School: " + s1.getSchoolName());
		System.out.println("School: " + s2.getSchoolName());
		System.out.println("------Memory Usage---------------------");
		System.out.println(s1);// will show the hashcode of the memory address
		System.out.println(s2);// will show the hashcode of the memory address
		Student s3 = s1;
		s2 = s3;
		System.out.println(s3);
		System.out.println("Finally:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
