package model;

import java.util.ArrayList;

public class Section implements Comparable<Section> {
	private TimeRange timeRange;
	private ArrayList<DayOfWeek> classDays;
	private String crn; // unique id for the section
	private Instructor instructor;
	private ArrayList<String> bookList;
	private Course course;
	private String courseNumber;
	private Classroom classroom;
	@Override
	public int compareTo(Section o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
