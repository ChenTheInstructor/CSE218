package p1_stacks;

public class Student implements Comparable<Student>{
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
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

	@Override
	public String toString() {
		return "[" + name + ", " + gpa + "]";
	}

	@Override
	public int compareTo(Student o) {
//		return this.name.compareTo(o.name);
		return Double.compare(this.gpa, o.gpa);
	}

}
