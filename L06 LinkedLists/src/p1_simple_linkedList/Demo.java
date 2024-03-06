package p1_simple_linkedList;

public class Demo {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.insertFirst(11, 11.1);
		list.insertFirst(22, 22.1);
		list.insertFirst(33, 33.1);
		list.insertFirst(44, 44.1);

		list.display();
//		System.out.println(list.find(33));
		list.delete(33);
		list.display();
		
//		while (!list.isEmpty()) {
//			System.out.println(list.deleteFirst());
//		}
	}

}
