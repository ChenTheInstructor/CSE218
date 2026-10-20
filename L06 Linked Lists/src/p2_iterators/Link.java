package p2_iterators;

public class Link {
	public long iData;
	public Link next;
	
	public Link(long iData) {
		this.iData = iData;
	}
	
	public void displayLink() {
		System.out.print(iData + " ");
		
	}
}
