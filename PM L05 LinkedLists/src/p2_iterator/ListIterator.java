package p2_iterator;

public class ListIterator {
	
	Link previous;
	Link current;
	LinkList ourList;
	
	public ListIterator(LinkList linkList) {
		ourList = linkList;
		reset();
	}
	
	public long deleteCurrent() {
		long value = current.dData;
		
		if(previous == null) { //beginning of list
			ourList.setFirst(current.next);
			reset();
		} else { // not beginning
			previous.next = current.next;
			if(atEnd()) {
				reset();
			}else {
				current = current.next;
			}
		}
		return value;
	}
	
	public void insertBefore(long dd) { // insert newlink before current
		Link newLink = new Link(dd);
		if(previous == null) {// beginning of list or empty
			newLink.next = ourList.getFirst();
			ourList.setFirst(newLink);
			reset();
		} else {
			newLink.next = previous.next;
			previous.next = newLink;
			current = newLink;
		}
	}
	
	public void insertAfter(long dd) { // insert after current
		Link newLink = new Link(dd);
		if(ourList.isEmpty()) {
			ourList.setFirst(newLink);
			current = newLink;
		} else {
			newLink.next = current.next;
			current.next = newLink;
			nextLink();
		}
	}
	
	public Link getCurrent() {
		return current;
	}
	
	// encapsulation or abstraction
	public void nextLink() {
		previous = current;
		current = current.next;
	}
	
	public boolean atEnd() {
		return current.next == null;
	}
	
	public void reset() {
		current = ourList.getFirst();
		previous = null;
	}
}
