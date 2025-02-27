package p1_simpleLinkedLisst;

public class LinkList {
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public Link find(int key) {
		Link current = first;
		while(current.getiData() != key) {
			if(current.getNext() == null) {
				return null;
			} else {
				current = current.getNext();
			}
		}
		return current;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.getNext();
		return temp;
	}
	
	public void insertFirst(int iData, double dData) {
		Link newLink = new Link(iData, dData);
		newLink.setNext(first);
		first = newLink;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	
}
