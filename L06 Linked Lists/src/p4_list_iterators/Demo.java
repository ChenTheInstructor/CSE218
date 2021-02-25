package p4_list_iterators;

public class Demo {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
		ListIterator iter1 = theList.getIterator();
		
		iter1.insertAfter(21);
		iter1.insertAfter(31);
		iter1.insertAfter(41);
		iter1.insertAfter(51);
		iter1.insertAfter(61);
		iter1.insertAfter(71);
		
		
//		theList.display();
//		System.out.println(iter1.atEnd());
//		iter1.reset();
//		for (int i = 0; i < 4; i++) {
//			iter1.nextLink();
//		}
//	
//		iter1.getCurrent().display();
//		iter1.reset();
//		while(!iter1.atEnd()) {
//			iter1.getCurrent().display();
//			iter1.nextLink();
//		}
//		
		ListIterator iter2 = theList.getIterator();
		iter2.getCurrent().display();
	}

}
