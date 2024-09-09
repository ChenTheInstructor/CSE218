package p1;

import java.util.Arrays;

public class Student {
	private String name;
	private double gpa;
	private DayOfWeek[] classArr;
	
	public Student(String name, double gpa, DayOfWeek[] classArr) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.classArr = classArr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public DayOfWeek[] getClassArr() {
		return classArr;
	}

	public void setClassArr(DayOfWeek[] classArr) {
		this.classArr = classArr;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", classArr=" + Arrays.toString(classArr) + "]";
	}
	
	
	
}
