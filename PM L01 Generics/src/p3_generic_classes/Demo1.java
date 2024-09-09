package p3_generic_classes;

public class Demo1 {

	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point(10, 20);
		Point<Double, Float> p2 = new Point(5, 10);
		Point<String, Integer> p3 = new Point("Five", 100);
		Point<Student, Double> p4 = new Point(new Student("A", 1.1), 1.1);
	}

}
