package p1_queues;

public class Demo {

	public static void main(String[] args) {
		Queue myQ = new Queue(5);
		System.out.println("Is empty? " + myQ.isEmpty());
		myQ.insert(10);
		myQ.insert(20);
		myQ.insert(30);
		myQ.insert(40);
		myQ.insert(50);
		System.out.println("Is Full? " + myQ.isFull());
//		while (!myQ.isEmpty()) {
//			System.out.println(myQ.remove());
//		}
		
		System.out.println(myQ.remove());
		System.out.println(myQ.remove());
		myQ.insert(60);
		myQ.insert(70);
		
		while (!myQ.isEmpty()) {
			System.out.println(myQ.remove());
		}
		
	}

}
