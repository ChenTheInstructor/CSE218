package p2;

import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		StudentBag theBag = new StudentBag(10);
		theBag.add(new Student("A", 1.1));
		theBag.add(new Student("B", 2.2));
		theBag.add(new Student("C", 3.3));

		theBag.display();

		Optional<Student> studentFound = theBag.search((s) -> s.getName().equals("D"));
		
		studentFound.ifPresent((s) -> System.out.println(s));
		
//		System.out.println(studentFound.orElse(new Student("D", 0.0)));
		
		
		
//		System.out.println(studentFound.isEmpty());
		
		
//		if(studentFound.isPresent()) {
//			System.out.println(studentFound.get().getGpa());
//		} else {
//			System.out.println("No student named as such.");
//		}
	}

}
