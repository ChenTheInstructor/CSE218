package p4_list_iterators;

public class ThisDemo {

	public static void main(String[] args) {
		LinkList myList1 = new LinkList();
		ListIterator myIterator1 = myList1.getIterator();
		ListIterator myIterator2 = myList1.getIterator();
		
		LinkList myList2 = new LinkList();
		ListIterator myIterator3 = myList2.getIterator();
		ListIterator myIterator4 = myList2.getIterator();
	}

}
