package p3_doubly_linked_list;

public class Link {
	public long dData;
	public Link next;
	public Link previous;

	public Link(long dData) {
		this.dData = dData;
		next = null;
		previous = null;
	}
	
	public void display() {
		System.out.print(dData + " ");
	}
	
}
