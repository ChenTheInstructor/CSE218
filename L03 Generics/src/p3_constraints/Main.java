package p3_constraints;

public class Main {

	public static void main(String[] args) {
		Point<Integer> p1 = new Point<>(1, 2);
		Point<Double> p2 = new Point<>(1.0, 2.0);
		Point<String> p3 = new Point<>("Ten", "Twenty");
		Point<Student> p4 = new Point<>(new Student("A", 1.1), new Student("Z", 4.0));
		Point<Object> p5 = new Point<>(new Object(), new Object());
		// print our points
		printPoint(p1);
		printPoint(p2);
		printPoint(p3);
		printPoint(p4);
		printPoint(p5);
 	}
	
//	public static <T extends Comparable> void printPoint(Point<T> point) {
//		System.out.println("X: " + point.getX() + ", y: " + point.getY() );
//	}
	// ? wild card
//	public static void printPoint(Point<? extends Number> point) {
//		System.out.println(point);
//	}

	// super sets a lowerbound for the data type allowed
	public static void printPoint(Point<? /*super Integer*/> point) {
		System.out.println(point);
	}
}
