package p3_priorityq;

public class Demo {

	public static void main(String[] args) {
		PriorityQ q = new PriorityQ(4);
		q.insert(10);
		q.insert(30);
		q.insert(20);
		q.insert(50);
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		
	}

}
