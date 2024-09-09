package p1;

public class Demo {

	public static void main(String[] args) {
		System.out.println(DayOfWeek.MONDAY);
		
		DayOfWeek[] schoolDays = {DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY};
		
		Student s1 = new Student("A", 3.5, schoolDays);
		
		System.out.println(s1);
	}

}
