package p3_api;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Consumer;

public class Demo {

	public static void main(String[] args) {
//		Stack<Student> myStack = new Stack<>();
//		Queue<Student> q1 = new ArrayBlockingQueue<>(100);
//		Queue<Student> q2 = new LinkedBlockingQueue<>();
//		
		Student s1 = new Student("A", 1.5);
		Student s2 = new Student("B", 2.5);
		Student s3 = new Student("C", 0.5);
//		q1.add(s1);
//		q1.add(s2);
//		q1.add(s3);
		
//		System.out.println(q1.remove());
		
//		Consumer<Student> c1 = s -> System.out.println(s);
//		Consumer<Student> c2 = s -> System.out.println("Hi " + s);
//		Consumer<Student> c3 = System.out :: println; // method reference
//		
//		q1.forEach(c1);
//		q1.forEach(c2);
//		q1.forEach(c3);
		
		PriorityQueue<Student> pq1 = new PriorityQueue<>();
		pq1.add(s1);
		pq1.add(s2);
		pq1.add(s3);
		
		System.out.println(pq1.remove());
	}
	

}
