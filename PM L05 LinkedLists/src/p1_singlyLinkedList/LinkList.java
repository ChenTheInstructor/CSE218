package p1_singlyLinkedList;

import java.util.Optional;

public class LinkList {
	private Link first;
	private Link last;
	
	public LinkList() {
		first  = null; // optional
		last = null;
	}
	
	public void displayList() {
		System.out.println("\nThe list: ");
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.getNext();
		}
		System.out.println();
	}
	
	public Optional<Link> delete(int key) {
		Link previous = null;
		Link current = first;
		while(current.getiData() != key) {
			if(current.getNext() == null) {
				return Optional.ofNullable(null);
			} else {
				previous = current;
				current = current.getNext();
			}
		}
		
		if(current == first) {
			first = first.getNext();
		} else {
			previous.setNext(current.getNext());
		}
		return Optional.of(current);
	}
	
	public Optional<Link> find(int key) {
		Link current = first;
		while(current.getiData() != key) {
			if(current.getNext() == null) {
				return Optional.ofNullable(null);
			} else {
				current = current.getNext();
			}
			
		}
		return Optional.of(current);
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(int iData, double dData) {
		Link newLink = new Link(iData, dData);
		newLink.setNext(first);
		first = newLink;
	}
	
	public Link deleteFirst() {
		Link tempLink = first;
		first = first.getNext();
		return tempLink;
	}
}
