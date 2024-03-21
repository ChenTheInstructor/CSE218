package p3_optional;

import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		Optional<Student> result = Optional.ofNullable(new Student("B", 2.5));
		check(result);
	}

	private static void check(Optional<Student> result) {
//		if(!result.isPresent()) {
//			System.out.println("The result is null");
//		} else {
//			System.out.println(result.get());
//		}
		
		result.ifPresentOrElse((s) -> System.out.println(s), 
				() -> System.out.println("It's null"));
	}

}
