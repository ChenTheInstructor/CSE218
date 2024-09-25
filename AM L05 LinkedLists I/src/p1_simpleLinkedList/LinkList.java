package p1_simpleLinkedList;

import java.util.Optional;

public class LinkList {
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public void displayList() {
		System.out.println("First --> Last");
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.getNext();
		}
		System.out.println();
	}
	
	public Optional<Link> find(int key) {
		Link current = first;
		while(current.getIData() != key) {
			if(current.getNext() == null) {
				return Optional.ofNullable(null);
			} else {
				current = current.getNext();
			}
		}
		return Optional.ofNullable(current);
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.getNext();
		return temp;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd);
		newLink.setNext(first);
		first = newLink;
	}
}
