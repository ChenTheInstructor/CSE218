package p2_double_ended_list;

public class Link <T> {
	public double dData;
	public Link next;
	
	public Link(double dData) {
		this.dData = dData;
		this.next = null;
	}

	
	@Override
	public String toString() {
		return "{" + dData + "}";
	}
	
	
}
