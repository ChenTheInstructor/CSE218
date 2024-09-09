package p4_rules;

import java.io.IOException;

public class InvalidGPA extends IOException{
	
	public InvalidGPA(String msg) {
		super(msg);
		System.out.println("Invalid GPA");
	}

}
