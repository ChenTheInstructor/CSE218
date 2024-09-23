package p2_queues;

public class DemoQueue {

	public static void main(String[] args) {
		Queue myQ = new Queue(10);
		myQ.enqueue(10);
		myQ.enqueue(20);
		myQ.enqueue(30);
		while(!myQ.isEmpty()) {
			System.out.println(myQ.dequeue());
		}
	}

}
