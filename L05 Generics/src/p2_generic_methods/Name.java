package p2_generic_methods;

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
		if (this.fn.equalsIgnoreCase(o.fn) && this.ln.equalsIgnoreCase(o.ln)) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Name [fn=" + fn + ", ln=" + ln + "]";
	}

}
