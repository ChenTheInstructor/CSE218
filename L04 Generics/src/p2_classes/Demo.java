package p2_classes;

public class Demo {

	public static void main(String[] args) {
		Point<Integer> p1 = new Point<>(5, 10);
		System.out.println(p1);
		
		Point<Double> p2 = new Point<>(5.5, 10.5);
		System.out.println(p2);
		
		Point<String> p3 = new Point<>("Five", "Ten");
		System.out.println(p3);
		
		Point<String> p4 = new Point<>("Five", "10");
	}

}
