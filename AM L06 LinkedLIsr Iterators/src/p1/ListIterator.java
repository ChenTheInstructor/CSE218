package p1;

public class ListIterator {
	private LinkList linkList;
	private Link current;
	private Link previous;

	public ListIterator(LinkList linkList) {
		this.linkList = linkList;
		reset();
	}
	
	public long deleteCurrent() {
		long value = current.dData;
		if(previous == null) {
			linkList.setFirst(current.next);
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
	
	public void insertBefore(long dd) {
		Link newLink = new Link(dd);
		if(previous == null) {
			newLink.next = linkList.getFirst();
			linkList.setFirst(newLink);
			reset();
		} else {
			newLink.next = previous.next;
			previous.next = newLink;
			current = newLink;
		}
	}
	
	public void insertAfter(long dd) {
		Link newLink = new Link(dd);
		if(linkList.isEmpty()) {
			linkList.setFirst(newLink);
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
	
	public void reset() {
		current = linkList.getFirst();
		previous = null;
	}
	
	public void nextLink() {
		previous = current;
		current = current.next;
	}
	
	public boolean atEnd() {
		return current.next == null;
	}

}
