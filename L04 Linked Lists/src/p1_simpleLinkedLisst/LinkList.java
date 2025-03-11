package p1_simpleLinkedLisst;

import java.util.Optional;

public class LinkList {
	private Link first;
	private Link last;

	public LinkList() {
		first = null;
	}

	public Optional<Link> find(int key) {
		Link current = first;
		while (current.getiData() != key) {
			if (current.getNext() == null) {
				return Optional.ofNullable(null);
			} else {
				current = current.getNext();
			}
		}
		return Optional.of(current);
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
