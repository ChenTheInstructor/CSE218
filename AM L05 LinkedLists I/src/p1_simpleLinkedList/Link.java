package p1_simpleLinkedList;

public class Link {
	private int iData;
	private double dData;
	private Link next;

	public Link(int iData, double dData) {
		this.iData = iData;
		this.dData = dData;
		next = null;// optional
	}
	
	public void displayLink() {
		System.out.println("{"+ iData + ", " + dData +"}");
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public double getDData() {
		return dData;
	}

	public void setDData(double dData) {
		this.dData = dData;
	}

	public int getIData() {
		return iData;
	}

	public void setIData(int iData) {
		this.iData = iData;
	}
}
