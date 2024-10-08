package p1_singlyLinkedList;

public class Link {
	private int iData;
	private double dData;
	private Link next; // overhead
	
	public Link(int iData, double dData) {
		super();
		this.iData = iData;
		this.dData = dData;
		next = null;
	}

	public int getiData() {
		return iData;
	}

	public void setiData(int iData) {
		this.iData = iData;
	}

	public double getdData() {
		return dData;
	}

	public void setdData(double dData) {
		this.dData = dData;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}
	
	public void displayLink() {
		System.out.println("{" + iData + " " + dData + "}, ");
	}
	

}
