package p1;

import java.util.Arrays;

public class Student {
	private String name;
	private double gpa;
	private DayOfWeek[] schoolDays;

	public Student(String name, double gpa, DayOfWeek[] schoolDays) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.schoolDays = schoolDays;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", schoolDays=" + Arrays.toString(schoolDays) + "]";
	}

}
