package p3_generic_classes;

// erasure
public class Point <T> {
	private T x;
	private T y;

	public Point(T x, T y) {
		super();
		this.x = x;
		this.y = y;
//		T[] t =(T[]) (new Object[10]);
//		T[] t1 = new T[10];
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	// lowerbound constraint
	public static void display(Point<? super Integer> point) {
		System.out.println(point);
	}

}
