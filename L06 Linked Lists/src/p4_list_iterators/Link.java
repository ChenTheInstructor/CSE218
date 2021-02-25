package p4_list_iterators;

public class Link {
	public Link next;
	public long dData;
	
	public Link(long dData) {
		this.dData = dData;
	}
	
	public void display() {
		System.out.println(dData + " ");
	}
}
