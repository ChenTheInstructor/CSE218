package p3_pq;

public class Demo {

	public static void main(String[] args) {
		PQueue pq = new PQueue(10);
		pq.insert(5);
		pq.insert(2);
		pq.insert(6);
		pq.insert(7);
		pq.insert(1);
		pq.insert(3);
		pq.insert(4);
		pq.insert(8);
		pq.insert(9);
		pq.insert(10);
		System.out.println("Is Full? " + pq.isFull());
		
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
		System.out.println("Is empty? " + pq.isEmpty());
	}

}
