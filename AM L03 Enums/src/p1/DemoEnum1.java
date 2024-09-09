package p1;

public class DemoEnum1 {

	public static void main(String[] args) {
		String name = "John";
		double gpa = 4.0;
		DayOfWeek[] arr = {DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY};
		Student s1 = new Student(name, gpa, arr);
		System.out.println(s1);
	}

}
