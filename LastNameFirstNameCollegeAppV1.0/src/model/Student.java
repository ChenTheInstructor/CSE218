package model;

import java.util.ArrayList;

public class Student implements Comparable<Student> {
	private Name name;
	private String id;// unique 8-digit long
	private Major major;
	private double gpa;
	private double creditsCompleted;
	private ArrayList<String> currentSections;

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
