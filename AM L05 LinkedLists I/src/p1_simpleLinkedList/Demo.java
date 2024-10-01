package p1_simpleLinkedList;

import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		LinkList myList = new LinkList();
		myList.insertFirst(1, 1.1);
		myList.insertFirst(2, 2.2);
		myList.insertFirst(3, 3.3);
	   	myList.insertFirst(4, 4.4);
		myList.displayList();
		Optional<Link> foundOptional = myList.delete(3);
		
		System.out.println("This gets deleted: ");
		if(foundOptional.isPresent()) {
			foundOptional.get().displayLink();
			
		}
		
		System.out.println("After deletion: ");
		myList.displayList();

	}

}
