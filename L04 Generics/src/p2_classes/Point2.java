package p2_classes;

public class Point2<S, T> {
	S x;
	T y;

	public Point2(S x, T y) {
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
