import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		String[] friends1 = {"A", "X", "C", "D"};
		String[] friends2 = {"E", "F", "G", "H"};
		String[] friends3 = {"I", "J", "X", "Y"};
		
		
		Student s1 = new Student("John Doe", 3.5, friends1);
		Student s2 = new Student("Jane Doe", 3.5, friends2);
		Student s3 = new Student("Joe Smith", 3.5, friends3);
		
		StudentBag theBag = new StudentBag(10);
		
		theBag.insert(s1);
		theBag.insert(s2);
		theBag.insert(s3);
		
		ArrayList<Student> studentsFound = theBag.searchFriend((name) -> {
			return name.equals("X");
		});
		
		System.out.println(studentsFound);
		
	}

}
