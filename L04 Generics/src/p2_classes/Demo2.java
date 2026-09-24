package p2_classes;

public class Demo2 {

	public static void main(String[] args) {
		Point2<Integer, Integer> p1 = new Point2<>(5, 10);
		System.out.println(p1);
		
		Point2<Double, Double> p2 = new Point2<>(5.5, 10.5);
		System.out.println(p2);
		
		Point2<String, String> p3 = new Point2<>("Five", "Ten");
		System.out.println(p3);
		
		Point2<String, Double> p4 = new Point2<>("Five", 10.5);
	}

}
