package p1;

public class Demo {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
		ListIterator iter1 = theList.getIterator();

		iter1.insertAfter(9);
		iter1.insertAfter(20);
		iter1.insertAfter(30);
		iter1.insertAfter(30);
		iter1.insertAfter(9);
		theList.displayList();
		iter1.reset();

//		Link firstLink = iter1.getCurrent();
//		if(firstLink.dData % 3 == 0) {
//			iter1.deleteCurrent();
//		}
//		link1.displayLink();
//		Link link1 = iter1.getCurrent();
		do {

//			iter1.nextLink();
			Link link1 = iter1.getCurrent();
			if (link1.dData % 3 == 0) {
				iter1.deleteCurrent();
			} else {
				iter1.nextLink();
			}

		} while (iter1.getCurrent() != null);

		theList.displayList();
	}

}
