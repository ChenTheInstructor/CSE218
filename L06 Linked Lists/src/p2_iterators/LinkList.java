package p2_iterators;

public class LinkList {
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public ListIterator getIterator() {
		return new ListIterator(this);
	}
	
	public void displayList() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
	
	public Link getFirst() {
		return first;
	}
	
	public void setFirst(Link link) {
		first = link;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
}
