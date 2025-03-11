package p3_priorityq;

public class Demo2 {

	public static void main(String[] args) {
		PriorityQ2<String> pq2 = new PriorityQ2<>(String.class, 5);
		pq2.insert("M");
		pq2.insert("Z");
		pq2.insert("F");
		pq2.insert("N");
		System.out.println(pq2.remove());
		System.out.println(pq2.remove());
		System.out.println(pq2.remove());
		System.out.println(pq2.remove());
	}

}
