package p1;

public class Link {
	public long dData;
	public Link next;

	public Link(long dData) {
		this.dData = dData;
		next = null;// optional
	}

	public void displayLink() {
		System.out.print(dData + " ");
	}
}
