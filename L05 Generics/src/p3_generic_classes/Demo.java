package p3_generic_classes;

public class Demo {
// erasure occurs during compilation time, not runtime. 
	// So it has no negative influence on performance 
	public static void main(String[] args) {
		Point<Integer, Integer> p1 = new Point<>(5, 10);
		Point<Integer, Double> p2 = new Point<>(5, 10.5);
		Point<Integer, Double> p3 = new Point<>(1, 1.5);
//		Point<Student, Student> p4 = new Point<>(new Student("A", .1), new Student("B", 2.2));
		
		
 	}
	
	public static <E extends Comparable> void sort(E[] arr) {
		
	}

}
