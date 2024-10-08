package p1_singlyLinkedList;

import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.insertFirst(1, 1.1);
		list.insertFirst(2, 1.1);
		list.insertFirst(3, 1.1);
		list.insertFirst(4, 1.1);
		
		list.displayList();
		Optional<Link> result = list.delete(3);
		if(result.isPresent()) {
			result.get().displayLink();
		}
		list.displayList();
		
	}

}
