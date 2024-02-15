package p3_apply_functional_programming;

public class DemoPredicate {

	public static void main(String[] args) {
		StudentBag bag = new StudentBag(100);
		bag.insert("M", 2.6);
		bag.insert("Z", 1.9);
		bag.insert("A", 3.5);
		
		Student studentFound = bag.search((s) -> s.getName().equals("Z"));
		System.out.println(studentFound);
		
		Student studentFound2 = bag.search((s) -> s.getGpa() == 3.5);
		System.out.println(studentFound2);
	}

}
