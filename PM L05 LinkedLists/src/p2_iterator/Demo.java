package p2_iterator;

public class Demo {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
		ListIterator iter1 = theList.getIterator();
		

		iter1.insertAfter(10);
		iter1.insertAfter(20);
		iter1.insertAfter(30);
		iter1.insertAfter(40);

		theList.displayList();

		iter1.reset();
//		for (int i = 0; i < 2; i++) {
//			// iter1.getCurrent().displayLink();
//			iter1.nextLink();
//		}
//		iter1.getCurrent().displayLink();
//		ListIterator iter2 = theList.getIterator();
//		iter2.getCurrent().displayLink();
//		iter1.reset();
		while(iter1.getCurrent() != null) {
			Link aLink = iter1.getCurrent();
			if(aLink.dData % 3 == 0) {
				iter1.deleteCurrent();
			}
			iter1.nextLink();
		}
		
		theList.displayList();
	}

}
