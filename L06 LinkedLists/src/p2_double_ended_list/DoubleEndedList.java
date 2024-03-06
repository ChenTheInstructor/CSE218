package p2_double_ended_list;

public class DoubleEndedList {
	private Link first;
	private Link last;
	
	public DoubleEndedList() {
		first = null;
		last = null;
	}
	
	public void insertFirst(double dData) {
		Link newLink = new Link(dData);
		if(isEmpty()) {
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
		while(current != null) {
			System.out.println(current);
			current = current.next;
		}
		System.out.println();
	}
}
