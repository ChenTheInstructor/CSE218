package p1;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("A", 3.0);
		Student s2 = new Student("M", 4.0);
		Student s3 = new Student("Z", 1.5);
		Student s4 = new Student("P", 2.5);
		Student s5 = new Student("M", 2.0);
		Student s6 = new Student("Z", 0.5);
		Student s7 = new Student("P", 2.9);
		
		PriorityQ<Student> pq = new PriorityQ<>(/*Student.class,*/ 5);
		pq.enqueue(s1);
		pq.enqueue(s2);
		pq.enqueue(s3);
		pq.enqueue(s4);
		pq.enqueue(s5);
		pq.enqueue(s6);
		pq.enqueue(s7);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.dequeue());
		}
	}

}
