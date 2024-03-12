package p2_double_ended_list;

public class DoubleEndedList <T> {
	private Link first;
	private Link last;

	public DoubleEndedList() {
		first = null;
		last = null;
	}
	
	public double deleteFirst() {
		double temp = first.dData;
		if(first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
	}

	public void insertLast(double dData) {
		Link newLink = new Link(dData);
		if (isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
		}
		last = newLink;
	}

	public void insertFirst(double dData) {
		Link newLink = new Link(dData);
		if (isEmpty()) {
			last = newLink;
		}
		newLink.next = first;
		first = newLink;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void displayList() {
		System.out.println("First -> Last: ");
		Link current = first;
		while (current != null) {
			System.out.println(current);
			current = current.next;
		}
		System.out.println();
	}
}
