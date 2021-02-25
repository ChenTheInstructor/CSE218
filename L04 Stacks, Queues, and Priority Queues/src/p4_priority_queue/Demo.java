package p4_priority_queue;

public class Demo {

	public static void main(String[] args) {
		PriorityQ thePQ = new PriorityQ(5);
		thePQ.insert(30);
		thePQ.insert(50);
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(20);
		
		while(!thePQ.isEmpty()) {
			System.out.println(thePQ.remove());
		}
	}

}
