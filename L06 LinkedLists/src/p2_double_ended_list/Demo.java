package p2_double_ended_list;

public class Demo {

	public static void main(String[] args) {
		DoubleEndedList list = new DoubleEndedList();
		list.insertFirst(1.1);
		list.insertFirst(2.2);
		list.insertFirst(3.3);
		list.insertLast(4.4);
		list.insertLast(5.5);
		while(!list.isEmpty()) {
			System.out.println(list.deleteFirst());
		}
	}

}
