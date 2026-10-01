package p1;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Student>{

	@Override
	public boolean test(Student t) {
		return t.getName().compareTo("K") >= 0;
	}

}
