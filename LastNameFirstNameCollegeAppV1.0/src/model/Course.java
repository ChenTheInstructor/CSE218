package model;

public class Course implements Comparable<Course>{
	private String courseTitle;
	private String courseNumber;
	private String description;
	private double credits;
	private ArrayList<String> sectionList;

	@Override
	public int compareTo(Course o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
