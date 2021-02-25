package p1_intro;

public class Name implements Comparable<Name> {
	private String fn;
	private String ln;

	public Name(String fn, String ln) {
		super();
		this.fn = fn;
		this.ln = ln;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	@Override
	public int compareTo(Name o) {
		return -this.fn.compareTo(o.fn);
	}

	@Override
	public String toString() {
		return "Name [fn=" + fn + ", ln=" + ln + "]";
	}

}
