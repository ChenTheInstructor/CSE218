package p2_queues;

public class Main {

	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		System.out.println(q.peekFront());
		System.out.println(q.peekFront());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.size());
		q.insert(50);
		q.insert(60);
		System.out.println(q.size());
		System.out.println("Dumping the queue:");
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}
		
		
	}

}
