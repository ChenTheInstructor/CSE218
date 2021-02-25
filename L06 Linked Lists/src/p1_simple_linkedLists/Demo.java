package p1_simple_linkedLists;

public class Demo {

	public static void main(String[] args) {
		LinkList list1 = new LinkList();
		list1.insertFirst(1, 1.1);
		list1.insertFirst(2,  2.2);
		list1.insertFirst(3,  3.3);
		list1.insertFirst(4,  4.4);
		
		list1.delete(4);
		
		list1.displayList();
		
	}

}
