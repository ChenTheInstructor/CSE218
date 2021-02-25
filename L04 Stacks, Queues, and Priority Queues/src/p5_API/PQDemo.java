package p5_API;

import java.util.PriorityQueue;

public class PQDemo {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		System.out.println("Bye");
		System.out.println("hi");
		PriorityQueue<Student> thePQ = new PriorityQueue<>();
		thePQ.add(new Student("Z", 4.0));
		thePQ.add(new Student("B", 5.0));
		System.out.println(thePQ.remove());
		System.out.println(thePQ.remove());
	}
	
}
