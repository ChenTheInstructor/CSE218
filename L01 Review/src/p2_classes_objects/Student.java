package p2_classes_objects;

// Purpose of a class: to create objects
// Purpose of an object: (1) to store data; (2) to perform actions

public class Student {
	// instance variables: to store data
	private String name; 
	private double gpa;
	
	// static variables: only one value allowed across all objects of the class
	private static String schoolName = "SCCC";
	
	// instance methods: to perform actions
	public void setName(String newName)  {
		this.name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public double curveGpa(double amount) {
		gpa += amount;
		return gpa;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String newSchoolName) {
		schoolName = newSchoolName;
	}
	
	// static method
	public static void changeSchoolName(String newSchoolName) {
		schoolName = newSchoolName;
	}
}
