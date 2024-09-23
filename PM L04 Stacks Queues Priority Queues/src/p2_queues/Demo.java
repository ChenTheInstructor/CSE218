package p2_queues;

public class Demo {

	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.insert(10);
		q.insert(20);
		q.insert(30);
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}
	}

}
