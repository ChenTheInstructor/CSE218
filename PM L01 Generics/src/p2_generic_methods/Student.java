package p2_generic_methods;

public class Student implements Comparable<Student>{
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}

}
