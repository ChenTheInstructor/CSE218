package p1;

import java.util.Optional;

public class SimpleLinkedList {
	private Link first;

	public SimpleLinkedList() {
		first = null;
	}
	
	public Optional<Link> delete(String name) {
		Link current = first;
		Link previous = first;
		while(!current.getStudent().getName().equals(name)) {
			if(current.getNext() == null) {
				return Optional.ofNullable(null);
			} else {
				previous = current;
				current = current.getNext();
			}
		}
		
		if(current == first) {
			first = current.getNext();
		} else {
			previous.setNext(current.getNext());
		}
		return Optional.of(current);
	}
	
	public Optional<Link> find(String key) {
		Link current = first;
		while(!current.getStudent().getName().equals(key)) {
			if(current.getNext() == null) {
				return Optional.ofNullable(null);
			} else {
				current = current.getNext();
			}
		}
		
		return Optional.of(current);
	}
	
	public void displayList() {
		System.out.println("List (first --> last):");
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.getNext();
		}
		System.out.println();
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.getNext();
		return temp;
	}

	public void insertFirst(String name, double gpa) {
		Link newLink = new Link(name, gpa);
		newLink.setNext(first);
		first = newLink;
	}

	public boolean isEmpty() {
		return first == null;
	}
}
