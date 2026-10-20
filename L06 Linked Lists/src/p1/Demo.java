package p1;

import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		SimpleLinkedList list = new SimpleLinkedList();
		list.insertFirst("A", 1.1);
		list.insertFirst("B", 2.1);
		list.insertFirst("C", 3.1);
		list.insertFirst("D", 4.1);
		list.displayList();
		Optional<Link> optional = list.delete("C");
//		if(optional.isPresent()) {
//			optional.get().displayLink();
//		}
//		optional.ifPresent(Link::displayLink);
		
		System.out.println("The remaining list:");
		list.displayList();
	}

}
