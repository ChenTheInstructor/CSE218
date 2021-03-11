import java.util.Arrays;

public class Student {
	private String name;
	private double gpa;
	private String[] friends;
	
	public Student(String name, double gpa, String[] friends) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.friends = friends;
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

	public String[] getFriends() {
		return friends;
	}

	public void setFriends(String[] friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", friends=" + Arrays.toString(friends) + "]";
	}
	
	
	
	
}
