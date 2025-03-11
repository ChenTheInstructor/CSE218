package p1_simpleLinkedLisst;

public class Demo {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.insertFirst(1, 1.1);
		list.insertFirst(2, 2.2);
		list.insertFirst(3, 3.3);
		list.insertFirst(4, 4.4);
		
//		Link deletedLink = list.deleteFirst();
//		deletedLink.displayLink();
//		deletedLink = list.deleteFirst();
//		deletedLink.displayLink();
		
//		if(list.find(1).isPresent()) {
//			list.find(1).get().displayLink();
//		} else {
//			System.out.println("No such key found");
//		}
		
//		list.find(4).ifPresent((link) -> link.displayLink());
		list.find(4).ifPresent((link) -> System.out.println(link));
		list.find(40).ifPresent(System.out::println);


	}

}
