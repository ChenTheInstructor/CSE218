package p2_classes;

public class DemoLowerBound {

	public static void main(String[] args) {
		Point<Comparable> p1 = new Point<>(10, 20);
		Point<Comparable> p2 = new Point<>(10.1, 20.2);
		Point<Comparable> p3 = new Point<>("One", "Two");
		
		showPoint(p1);
		showPoint(p2);
		showPoint(p3);
	}
	
	public static <T> void showPoint(Point<? super Comparable> point) {
		System.out.println(point);
	}

}
