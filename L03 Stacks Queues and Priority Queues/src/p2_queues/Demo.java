package p2_queues;

public class Demo {

	public static void main(String[] args) {
		MyQ q = new MyQ(7);
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		
		
//		System.out.println(q.peekFront());
//		while(!q.isEmpty()) {
//			System.out.println(q.remove());
//		}
		q.remove();
		q.remove();
		q.remove();
		q.add(80);
		q.add(90);
		q.add(100);
		
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}
		
	}

}
