package p1;

public class SimpleLinkedList {
	private Link first;

	public SimpleLinkedList() {
		first = null;
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
