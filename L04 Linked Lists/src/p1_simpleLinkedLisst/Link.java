package p1_simpleLinkedLisst;

public class Link {
	private int iData;
	private double dData;
	private Link next;

	public Link(int iData, double dData) {
		super();
		this.iData = iData;
		this.dData = dData;
	}

	public void displayLink() {
		System.out.println("{" + iData + ", " + dData + "}");
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

}
