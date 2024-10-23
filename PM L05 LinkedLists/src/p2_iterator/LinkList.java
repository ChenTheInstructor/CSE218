package p2_iterator;

public class LinkList {
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public Link getFirst() {
		return first;
	}
	
	public void setFirst(Link first) {
		this.first = first;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void displayList() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
	
	public ListIterator getIterator() { // provides a listIterator object
		return new ListIterator(this);						// for this linkList object
		
	}
}
