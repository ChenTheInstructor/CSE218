package p1;

public class Demo {

	public static void main(String[] args) {
		Point<Integer, Integer> p1 = new Point<>(5, 10);
		System.out.println(p1);
		
		Point<Double, Integer> p2 = new Point<>(5.0, 10);
		System.out.println(p2);
		
		Point<String, Double> p3 = new Point<>("One", 5.0);
		System.out.println(p3);
	}

}
