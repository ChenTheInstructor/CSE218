package p3_generic_classes;

// the extends keyword sets the upperbound of the type allowed
// This is called upperbound constraint
public class Point<S extends Integer, T extends Number> {
	private S x;
	private T y;

	public Point(S x, T y) {
		super();
		this.x = x;
		this.y = y;
	}

	public S getX() {
		return x;
	}

	public void setX(S x) {
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

}
