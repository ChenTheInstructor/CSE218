package p2_double_ended_linkedList;

public class Demo {

	public static void main(String[] args) {
		FirstLastList list1 = new FirstLastList();
		list1.insertFirst(1.1);
		list1.insertFirst(2.2);
		list1.insertFirst(3.3);
		list1.deleteFirst();
		list1.insertLast(4.4);
		list1.displayList();
	}

}
