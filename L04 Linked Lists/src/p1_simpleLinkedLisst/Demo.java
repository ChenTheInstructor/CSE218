package p1_simpleLinkedLisst;

public class Demo {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.insertFirst(1, 1.1);
		list.insertFirst(2, 2.2);
		list.insertFirst(3, 3.3);
		list.insertFirst(4, 4.4);
		
		Link deletedLink = list.deleteFirst();
		deletedLink.displayLink();
		deletedLink = list.deleteFirst();
		deletedLink.displayLink();
		
		list.find(3).displayLink();

	}

}
