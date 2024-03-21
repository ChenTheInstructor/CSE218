package p1;

import java.util.Optional;

public class DemoOptional {

	public static void main(String[] args) {
//		search().ifPresent(System.out::println);
		search().ifPresentOrElse(System.out::println, () -> System.out.println("It's empty"));
		
		System.out.println("End");
//		if (search().isEmpty()) {
//			System.out.println(search().get().length());
//		} else {
//			System.out.println("No String returned.");
//		}
	}

	public static Optional<Student> search() {
		return Optional.ofNullable(null);
	}

}
