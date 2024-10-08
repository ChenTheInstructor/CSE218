package p1;

public class Demo2 {

	public static void main(String[] args) {
		Person p1 = new Person("A");
		Student s1 = new Student("B", 4.0);
		
		QuickStack<Person> st1 = new QuickStack(Person.class);
		st1.push(p1);
		st1.push(s1);
		
		System.out.println(st1.pop().getClass());
		System.out.println(st1.peek());
	}

}
