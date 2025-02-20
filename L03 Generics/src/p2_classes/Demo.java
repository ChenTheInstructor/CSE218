package p2_classes;

public class Demo {

	public static void main(String[] args) {
		Point<Double> p1 = new Point<>(1.1, 2.2);
		Point<Integer> p2 = new Point<>(10, 20);
		Point<String> p3 = new Point<>("Twenty", "Fifty");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
