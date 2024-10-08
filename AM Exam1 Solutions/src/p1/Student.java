package p1;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}

	@Override
	public int compareTo(Student o) {
//		if (this.gpa > o.gpa) {
//			return 1;
//		} else if (this.gpa < o.gpa) {
//			return -1;
//		} else {
//			return 0;
//		}
		return Double.compare(this.gpa, o.gpa);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
