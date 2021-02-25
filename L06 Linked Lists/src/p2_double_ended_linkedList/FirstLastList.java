package p2_double_ended_linkedList;

public class FirstLastList {
	public Link first;
	public Link last;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(double dData) {
		Link newLink = new Link(dData);
		
		if(isEmpty()) {
			last = newLink;
		} else {
			newLink.next = first;
		}
		first = newLink;
	}
	
	public void insertLast(double dData) {
		Link newLink = new Link(dData);
		if(isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
		}
		last = newLink;
	}
	
	public double deleteFirst() { // assume not empty
		double temp = first.dData;
		if(first.next == null) { // only one link 
			last = null;
		} 
		
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		System.out.println("First --> Last: ");
		Link current = first;
		while(current != null)  {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
