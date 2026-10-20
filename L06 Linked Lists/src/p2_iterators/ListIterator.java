package p2_iterators;

public class ListIterator {
	private LinkList ourList;
	private Link current;
	private Link previous;
	
	public ListIterator(LinkList linkList) {
		ourList = linkList;
	}
	
	public long deleteCurrent() {
		long value = current.iData;
		if(previous == null) { // beginning of list
			ourList.setFirst(current.next);
			reset();
		} else {
			previous.next = current.next;
			if(atEnd()) {
				reset();
			} else {
				current = current.next;
			}
		}
		return value;
	}
	
	public void insertBefore(long iData) {
		Link newLink = new Link(iData);
		
		if(previous == null) { // beginning of list or empty list
			newLink.next = ourList.getFirst();
			ourList.setFirst(newLink);
			reset();
		} else {
			newLink.next = previous.next;
			previous.next = newLink;
			current = newLink;
		}
	}
	
	public void insertAfter(long iData) {
		Link newLink = new Link(iData);
		
		if(ourList.isEmpty()) {
			ourList.setFirst(newLink);
			current = newLink;
		} else {
			newLink.next = current.next;
			current.next = newLink;
			nextLink();
		}
		
	}
	
	public void reset() {
		current = ourList.getFirst();
		previous = null;
	}

	public boolean atEnd() {
		return current.next == null;
	}
	
	public void nextLink() {
		previous = current;
		current = current.next;
	}
	
	public Link getCurrent() {
		return current;
	}
}
