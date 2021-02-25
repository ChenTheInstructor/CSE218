package p3_doubly_linked_list;

public class Demo {

	public static void main(String[] args) {
		DoublyLinkedList theList = new DoublyLinkedList();
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.displayForward();
		theList.displayBackward();
		
		theList.insertBefore(44, 33);
		theList.displayForward();
	}

}
